package com.jobpilot.persistence.service;

import com.jobpilot.mapper.persistence.UserDocumentPersistenceMapper;
import com.jobpilot.model.domain.UserDocument;
import com.jobpilot.persistence.entity.UserDocumentEntity;
import com.jobpilot.persistence.repository.UserDocumentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@RequiredArgsConstructor
public class UserDocumentEntityService {

    private final UserDocumentRepository userDocumentRepository;

    private final UserDocumentPersistenceMapper persistenceMapper;

    public UserDocument uploadDocument(UserDocument userDocument) throws IOException {
        UserDocumentEntity entity = persistenceMapper.toEntity(userDocument);
        return persistenceMapper.toDomain(userDocumentRepository.save(entity));
    }

    public UserDocumentEntity downloadDocument(String documentId) throws IOException {
        return userDocumentRepository.findById(documentId).orElseThrow(() -> new IllegalArgumentException("Document not found: " + documentId));
    }
}
