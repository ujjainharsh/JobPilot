package com.jobpilot.persistence.repository;


import com.jobpilot.persistence.entity.UserDocumentEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserDocumentRepository
        extends MongoRepository<UserDocumentEntity, String> {

    List<UserDocumentEntity> findByProfileId(String profileId);
}
