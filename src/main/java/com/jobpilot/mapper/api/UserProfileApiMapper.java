package com.jobpilot.mapper.api;


import com.jobpilot.model.api.UserProfilePatchRequest;
import com.jobpilot.model.api.UserProfileRequest;
import com.jobpilot.model.api.UserProfileResponse;
import com.jobpilot.model.domain.UserProfile;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.net.URI;

@Mapper(componentModel = "spring")
public interface UserProfileApiMapper {

    UserProfile toDomain(UserProfileRequest request);

    UserProfile toDomain(UserProfilePatchRequest request);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "resume", ignore = true)
    UserProfileResponse toResponse(UserProfile domain);

    default String map(URI value) {
        return value != null ? value.toString() : null;
    }

    default URI map(String value) {
        return value != null ? URI.create(value) : null;
    }
}
