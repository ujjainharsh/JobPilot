package com.jobpilot.service;

import com.jobpilot.model.api.UserProfileRequest;
import com.jobpilot.model.api.UserProfileResponse;
import com.jobpilot.mapper.api.UserProfileApiMapper;
import com.jobpilot.mapper.persistence.UserProfilePersistenceMapper;
import com.jobpilot.model.domain.UserProfile;
import com.jobpilot.persistence.entity.UserProfileEntity;
import com.jobpilot.persistence.repository.UserProfileRepository;
import com.jobpilot.persistence.service.UserProfileEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserProfileService {

    private final UserProfileApiMapper apiMapper;

    private final UserProfileEntityService userProfileEntityService;


    public UserProfileResponse createProfile(UserProfileRequest request) {
        UserProfile domain = apiMapper.toDomain(request);
        return apiMapper.toResponse(userProfileEntityService.createProfile(domain));
    }
}