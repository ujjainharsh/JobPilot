package com.jobpilot.persistence.entity;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "user_documents")
public class UserDocumentEntity {

    @Id
    private String id;

    private String profileId;

    private String fileName;

    private String contentType;

    private Long fileSize;

    private String storageId;

    private String documentType;

    private LocalDateTime uploadedAt;

    private String downloadUrl;
}
