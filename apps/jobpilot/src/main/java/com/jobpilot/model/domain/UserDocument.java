package com.jobpilot.model.domain;


import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDocument {

    private String id;

    private String profileId;

    private String fileName;

    private String contentType;

    private Long fileSize;

    private String storageId;

    private String documentType;

    private LocalDateTime uploadedAt;

    private byte[] fileContent;
}
