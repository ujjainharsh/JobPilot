package com.jobpilot.service;

import com.jobpilot.mapper.api.UserDocumentApiMapper;
import com.jobpilot.mapper.event.DocumentEventMapper;
import com.jobpilot.messaging.event.DocumentUploadedEvent;
import com.jobpilot.messaging.producer.DocumentUploadedProducer;
import com.jobpilot.model.api.UserDocumentResponse;
import com.jobpilot.model.domain.UserDocument;
import com.jobpilot.persistence.entity.UserDocumentEntity;
import com.jobpilot.persistence.service.UserDocumentEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.Resource;
import org.springframework.data.mongodb.gridfs.GridFsResource;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

import java.io.IOException;

@Service
@RequiredArgsConstructor
public class UserDocumentService {

    private final UserDocumentApiMapper apiMapper;

    private final DocumentStorageService documentStorageService;

    private final UserDocumentEntityService userDocumentEntityService;

    private final DocumentEventMapper documentEventMapper;

    private final DocumentUploadedProducer documentUploadedProducer;


    public UserDocumentResponse uploadDocument(String profileId, MultipartFile file) throws IOException {
        String storageId = documentStorageService.store(file);
        UserDocument userDocument = apiMapper.toDomain(profileId, file, storageId);
        UserDocument savedDocument = userDocumentEntityService.uploadDocument(userDocument);
        DocumentUploadedEvent event =
                documentEventMapper.toDocumentUploadedEvent(savedDocument);
        documentUploadedProducer.publish(event);
        return apiMapper.toResponse(savedDocument);
    }



    public ResponseEntity<Resource> downloadDocument(
            String documentId) throws IOException {
        UserDocumentEntity entity = userDocumentEntityService.downloadDocument(documentId);
        GridFsResource resource = documentStorageService.getResource(entity.getStorageId());
        return ResponseEntity.ok().contentType(MediaType.parseMediaType(entity.getContentType())).header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + entity.getFileName() + "\"").body(resource);
    }
}

