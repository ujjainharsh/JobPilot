package com.jobpilot.controller;


import com.jobpilot.model.api.UserDocumentResponse;
import com.jobpilot.service.UserDocumentService;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/api/v1/profile/{profileId}")
@RequiredArgsConstructor
public class UserDocumentController {

    private final UserDocumentService userDocumentService;

    @PostMapping(
            value = "/documents",
            consumes = "multipart/form-data"
    )
    public ResponseEntity<UserDocumentResponse> uploadDocument(
            @PathVariable String profileId,
            @RequestParam("file") MultipartFile file) throws IOException {

        UserDocumentResponse document =
                userDocumentService.uploadDocument(profileId, file);

        return ResponseEntity.ok(document);
    }

    @GetMapping("/documents/{documentId}/download")
    public ResponseEntity<Resource> downloadDocument(
            @PathVariable String documentId) throws IOException {
            return  userDocumentService.downloadDocument(documentId);
    }
}
