package com.jobpilot.controller;

import com.jobpilot.model.api.UserProfileRequest;
import com.jobpilot.model.api.UserProfileResponse;
import com.jobpilot.model.api.UserProfilePatchRequest;
import com.jobpilot.service.UserProfileService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/profile")
@RequiredArgsConstructor
public class UserProfileController {

    private final UserProfileService userProfileService;

    /**
     * Create a new user profile.
     */
    @PostMapping
    public ResponseEntity<UserProfileResponse> createProfile(
            @Valid @RequestBody UserProfileRequest request) {

        UserProfileResponse response =
                userProfileService.createProfile(request);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(response);
    }

    /**
     * Get the current user's profile.
     */
    @GetMapping
    public ResponseEntity<UserProfileResponse> getProfile() {

        UserProfileResponse response =
                userProfileService.getProfile();

        return ResponseEntity.ok(response);
    }

    /**
     * Completely replace the current user's profile.
     */
    @PutMapping
    public ResponseEntity<UserProfileResponse> updateProfile(
            @Valid @RequestBody UserProfileRequest request) {

        UserProfileResponse response =
                userProfileService.updateProfile(request);

        return ResponseEntity.ok(response);
    }

    /**
     * Partially update the current user's profile.
     */
    @PatchMapping
    public ResponseEntity<UserProfileResponse> patchProfile(
            @RequestBody UserProfilePatchRequest request) {

        UserProfileResponse response =
                userProfileService.patchProfile(request);

        return ResponseEntity.ok(response);
    }

    /**
     * Delete the current user's profile.
     */
    @DeleteMapping
    public ResponseEntity<Void> deleteProfile() {

        userProfileService.deleteProfile();

        return ResponseEntity.noContent().build();
    }
}