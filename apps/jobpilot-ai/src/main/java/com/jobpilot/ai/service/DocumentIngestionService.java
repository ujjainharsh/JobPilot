package com.jobpilot.ai.service;

import com.jobpilot.ai.client.JobPilotDocumentClient;
import com.jobpilot.ai.messaging.event.DocumentUploadedEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class DocumentIngestionService {

    private final JobPilotDocumentClient jobPilotDocumentClient;
    private final PdfTextExtractionService pdfTextExtractionService;

    public void ingest(DocumentUploadedEvent event) {

        Resource pdf =
                jobPilotDocumentClient.downloadDocument(
                        event.getProfileId(),
                        event.getDocumentId()
                );

        log.info(
                "PDF downloaded successfully. documentId={}, fileName={}",
                event.getDocumentId(),
                pdf.getFilename()
        );

        String extractedText =
                pdfTextExtractionService.extractText(pdf);

        log.info(
                "Extracted text from document. documentId={}, characters={}",
                event.getDocumentId(),
                extractedText.length()
        );

        log.debug(
                "Extracted PDF text:\n{}",
                extractedText
        );
    }
}
