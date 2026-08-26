package com.jobpilot.persistence.repository;

import com.jobpilot.persistence.entity.UserProfileEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserProfileRepository
        extends MongoRepository<UserProfileEntity, String> {
}