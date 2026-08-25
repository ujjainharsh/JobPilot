package com.jobpilot.service;

import com.jobpilot.model.UserProfilePatchRequest;
import com.jobpilot.model.UserProfileRequest;
import com.jobpilot.model.UserProfileResponse;
import org.springframework.stereotype.Service;

@Service
public class UserProfileService {

    /**
     * Creates a new profile for the currently authenticated user.
     */
    public UserProfileResponse createProfile(UserProfileRequest request) {

        // TODO:
        // 1. Get current authenticated user
        // 2. Check if profile already exists
        // 3. Convert request DTO -> UserProfile entity
        // 4. Save entity
        // 5. Convert entity -> response DTO

        return null;
    }

    /**
     * Returns the profile of the currently authenticated user.
     */
    public UserProfileResponse getProfile() {

        // TODO:
        // 1. Get current authenticated user
        // 2. Find profile
        // 3. Convert entity -> response DTO

        return null;
    }

    /**
     * Completely replaces the current user's profile.
     */
    public UserProfileResponse updateProfile(UserProfileRequest request) {

        // TODO:
        // 1. Get current authenticated user
        // 2. Find existing profile
        // 3. Replace profile information
        // 4. Save entity
        // 5. Convert entity -> response DTO

        return null;
    }

    /**
     * Partially updates the current user's profile.
     */
    public UserProfileResponse patchProfile(
            UserProfilePatchRequest request) {

        // TODO:
        // 1. Get current authenticated user
        // 2. Find existing profile
        // 3. Update only fields supplied in request
        // 4. Save entity
        // 5. Convert entity -> response DTO

        return null;
    }

    /**
     * Deletes the current user's profile.
     */
    public void deleteProfile() {

        // TODO:
        // 1. Get current authenticated user
        // 2. Find existing profile
        // 3. Delete profile
    }
}