package com.jobpilot.mapper.event;

import com.jobpilot.messaging.event.DocumentUploadedEvent;
import com.jobpilot.model.domain.UserDocument;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface DocumentEventMapper {

    @Mapping(target = "eventType", constant = "RESUME_UPLOADED")
    @Mapping(target = "documentId", source = "id")
    @Mapping(target = "profileId", source = "profileId")
    @Mapping(target = "fileName", source = "fileName")
    @Mapping(target = "documentType", source = "documentType")
    @Mapping(target = "uploadedAt", source = "uploadedAt")
    DocumentUploadedEvent toDocumentUploadedEvent(UserDocument document);
}