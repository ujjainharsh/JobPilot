package com.jobpilot.mapper.persistence;

import com.jobpilot.model.domain.UserDocument;
import com.jobpilot.persistence.entity.UserDocumentEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserDocumentPersistenceMapper {

    UserDocumentEntity toEntity(UserDocument domain);

    UserDocument toDomain(UserDocumentEntity entity);
}
