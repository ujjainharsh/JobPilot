package com.jobpilot.service;

import com.jobpilot.mapper.persistence.UserDocumentPersistenceMapper;
import com.jobpilot.model.api.UserDocumentResponse;
import com.jobpilot.model.domain.UserDocument;
import com.jobpilot.persistence.entity.UserDocumentEntity;
import com.jobpilot.persistence.repository.UserDocumentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.Resource;
import org.springframework.data.mongodb.gridfs.GridFsResource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

import java.io.IOException;
import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class UserDocumentService {

    private final UserDocumentRepository userDocumentRepository;

    private final UserDocumentPersistenceMapper persistenceMapper;

    private final DocumentStorageService documentStorageService;

    public UserDocumentResponse uploadDocument(
            String profileId,
            MultipartFile file) throws IOException {

        // 1. Store actual PDF in GridFS
        String storageId = documentStorageService.store(file);

        // 2. Create domain object containing metadata
        UserDocument document = UserDocument.builder()
                .profileId(profileId)
                .fileName(file.getOriginalFilename())
                .contentType(file.getContentType())
                .fileSize(file.getSize())
                .storageId(storageId)
                .documentType("RESUME")
                .uploadedAt(LocalDateTime.now())
                .build();

        // 3. Store metadata in user_documents
        UserDocumentEntity entity =
                persistenceMapper.toEntity(document);

        UserDocumentEntity savedEntity =
                userDocumentRepository.save(entity);

        // 4. Return API response
        return toResponse(
                persistenceMapper.toDomain(savedEntity)
        );
    }

    private UserDocumentResponse toResponse(
            UserDocument document) {

        return UserDocumentResponse.builder()
                .id(document.getId())
                .profileId(document.getProfileId())
                .fileName(document.getFileName())
                .contentType(document.getContentType())
                .fileSize(document.getFileSize())
                .documentType(document.getDocumentType())
                .uploadedAt(document.getUploadedAt())
                .downloadUrl(
                        "/api/v1/profile/"+document.getProfileId()+"/documents/"
                                + document.getId()
                                + "/download"
                )
                .build();
    }

    public ResponseEntity<Resource> downloadDocument(
            String documentId) throws IOException {

        UserDocumentEntity entity =
                userDocumentRepository.findById(documentId)
                        .orElseThrow(() ->
                                new IllegalArgumentException(
                                        "Document not found: " + documentId
                                )
                        );

        GridFsResource resource =
                documentStorageService.getResource(
                        entity.getStorageId()
                );

        return ResponseEntity.ok()
                .contentType(
                        MediaType.parseMediaType(
                                entity.getContentType()
                        )
                )
                .header(
                        HttpHeaders.CONTENT_DISPOSITION,
                        "attachment; filename=\"" +
                                entity.getFileName() +
                                "\""
                )
                .body(resource);
    }
}

