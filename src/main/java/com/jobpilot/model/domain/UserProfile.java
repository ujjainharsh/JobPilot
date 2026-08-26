package com.jobpilot.model.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.net.URI;
import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserProfile {

    private String firstName;
    private String middleName;
    private String lastName;
    private LocalDate dob;

    private String email;
    private String phone;

    private String location;
    private String preferredLocation;
    private String highestQualification;

    private URI linkedinUrl;
    private URI githubUrl;
    private URI portfolioUrl;
}