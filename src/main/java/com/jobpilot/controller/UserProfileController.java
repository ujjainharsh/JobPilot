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

    @PostMapping
    public ResponseEntity<UserProfileResponse> createProfile(
            @Valid @RequestBody UserProfileRequest request) {

        UserProfileResponse response =
                userProfileService.createProfile(request);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(response);
    }

//    @GetMapping
//    public ResponseEntity<UserProfileResponse> getProfile() {
//
//        UserProfileResponse response =
//                userProfileService.getProfile();
//
//        return ResponseEntity.ok(response);
//    }
//
//    @PutMapping
//    public ResponseEntity<UserProfileResponse> updateProfile(
//            @Valid @RequestBody UserProfileRequest request) {
//
//        UserProfileResponse response =
//                userProfileService.updateProfile(request);
//
//        return ResponseEntity.ok(response);
//    }
//
//    @PatchMapping
//    public ResponseEntity<UserProfileResponse> patchProfile(
//            @RequestBody UserProfilePatchRequest request) {
//
//        UserProfileResponse response =
//                userProfileService.patchProfile(request);
//
//        return ResponseEntity.ok(response);
//    }
//
//    @DeleteMapping
//    public ResponseEntity<Void> deleteProfile() {
//
//        userProfileService.deleteProfile();
//
//        return ResponseEntity.noContent().build();
//    }
}