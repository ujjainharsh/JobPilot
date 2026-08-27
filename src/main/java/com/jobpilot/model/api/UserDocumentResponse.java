package com.jobpilot.model.api;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDocumentResponse {

    private String id;

    private String profileId;

    private String fileName;

    private String contentType;

    private Long fileSize;

    private String documentType;

    private LocalDateTime uploadedAt;

    private String downloadUrl;
}