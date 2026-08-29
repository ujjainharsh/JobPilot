package com.jobpilot.ai.messaging.event;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DocumentUploadedEvent {

    private String eventType;

    private String documentId;

    private String profileId;

    private String fileName;

    private String documentType;

    private LocalDateTime uploadedAt;
}