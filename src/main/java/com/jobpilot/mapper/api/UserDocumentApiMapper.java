package com.jobpilot.mapper.api;

import com.jobpilot.model.api.UserDocumentResponse;
import com.jobpilot.model.domain.UserDocument;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.web.multipart.MultipartFile;

@Mapper(componentModel = "spring")
public interface UserDocumentApiMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "profileId", source = "profileId")
    @Mapping(target = "fileName", source = "file.originalFilename")
    @Mapping(target = "contentType", source = "file.contentType")
    @Mapping(target = "fileSize", source = "file.size")
    @Mapping(target = "storageId", source = "storageId")
    @Mapping(target = "documentType", constant = "RESUME")
    @Mapping(target = "uploadedAt", expression = "java(java.time.LocalDateTime.now())")
    UserDocument toDomain(String profileId, MultipartFile file, String storageId);


    @Mapping(target = "downloadUrl", expression = "java(buildDownloadUrl(document))")
    UserDocumentResponse toResponse(UserDocument document);

    default String buildDownloadUrl(UserDocument document) {

        return "/api/v1/profile/" + document.getProfileId() + "/documents/" + document.getId() + "/download";
    }
}