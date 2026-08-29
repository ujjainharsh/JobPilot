package com.jobpilot.ai.client;

import lombok.RequiredArgsConstructor;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;


@Component
@RequiredArgsConstructor
public class JobPilotDocumentClient {

    private final RestClient jobPilotRestClient;

    public Resource downloadDocument(
            String profileId,
            String documentId) {

        return jobPilotRestClient
                .get()
                .uri(
                        "/api/v1/profile/{profileId}/documents/{documentId}/download",
                        profileId,
                        documentId
                )
                .accept(MediaType.APPLICATION_PDF)
                .retrieve()
                .body(Resource.class);
    }
}
