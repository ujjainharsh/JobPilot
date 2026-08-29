package com.jobpilot.mapper.persistence;

import com.jobpilot.model.domain.UserProfile;
import com.jobpilot.persistence.entity.UserProfileEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.net.URI;

@Mapper(componentModel = "spring")
public interface UserProfilePersistenceMapper {

    @Mapping(target = "id", ignore = true)
    UserProfileEntity toEntity(UserProfile domain);

    UserProfile toDomain(UserProfileEntity entity);

    default String map(URI value) {
        return value != null ? value.toString() : null;
    }

    default URI map(String value) {
        return value != null ? URI.create(value) : null;
    }
}
