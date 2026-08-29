package com.jobpilot.messaging.producer;

import com.jobpilot.messaging.event.DocumentUploadedEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DocumentUploadedProducer {

    private static final String TOPIC =
            "jobpilot.document.uploaded";

    private final KafkaTemplate<String, DocumentUploadedEvent> kafkaTemplate;

    public void publish(DocumentUploadedEvent event) {

        kafkaTemplate.send(
                TOPIC,
                event.getDocumentId(),
                event
        );
    }
}