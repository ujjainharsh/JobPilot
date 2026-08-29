package com.jobpilot.ai.messaging.consumer;

import com.jobpilot.ai.messaging.event.DocumentUploadedEvent;
import com.jobpilot.ai.service.DocumentIngestionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class DocumentUploadedConsumer {

    private final DocumentIngestionService documentIngestionService;

    @KafkaListener(
            topics = "jobpilot.document.uploaded",
            groupId = "jobpilot-ai-ingestion"
    )
    public void consume(DocumentUploadedEvent event) {

        log.info(
                "Received document uploaded event. documentId={}",
                event.getDocumentId()
        );

        documentIngestionService.ingest(event);
    }
}
