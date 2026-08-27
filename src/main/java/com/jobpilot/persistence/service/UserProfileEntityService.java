package com.jobpilot.persistence.service;


import com.jobpilot.mapper.persistence.UserProfilePersistenceMapper;
import com.jobpilot.model.domain.UserProfile;
import com.jobpilot.persistence.entity.UserProfileEntity;
import com.jobpilot.persistence.repository.UserProfileRepository;
import lombok.RequiredArgsConstructor;
import org.mapstruct.control.MappingControl;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserProfileEntityService {

    private final UserProfileRepository userProfileRepository;

    private final UserProfilePersistenceMapper persistenceMapper;

    public UserProfile createProfile(UserProfile userProfile) {
        UserProfileEntity entity = persistenceMapper.toEntity(userProfile);
        return persistenceMapper.toDomain(userProfileRepository.save(entity));
    }

    public UserProfile getUserProfile(String profileId) {
        return persistenceMapper.toDomain(userProfileRepository.findById(profileId).orElseThrow());
    }

    public UserProfile updateProfile(UserProfile userProfile) {
        UserProfileEntity entity = persistenceMapper.toEntity(userProfile);
        return persistenceMapper.toDomain(userProfileRepository.save(entity));
    }

    public void deleteProfile(String profileId) {
        userProfileRepository.deleteById(profileId);
    }
}
