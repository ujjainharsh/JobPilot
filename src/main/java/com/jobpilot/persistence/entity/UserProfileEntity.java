package com.jobpilot.persistence.entity;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "user_profiles")
public class UserProfileEntity {

    @Id
    private String id;

    private String firstName;
    private String middleName;
    private String lastName;
    private LocalDate dob;

    private String email;
    private String phone;

    private String location;
    private String preferredLocation;
    private String highestQualification;

    private String linkedinUrl;
    private String githubUrl;
    private String portfolioUrl;
}
