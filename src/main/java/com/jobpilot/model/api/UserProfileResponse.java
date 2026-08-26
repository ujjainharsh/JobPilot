package com.jobpilot.model.api;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import jakarta.validation.Valid;
import io.swagger.v3.oas.annotations.media.Schema;


import jakarta.annotation.Generated;

/**
 * UserProfileResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-25T14:00:49.907178+05:30[Asia/Kolkata]", comments = "Generator version: 7.17.0")
public class UserProfileResponse {

  private @Nullable UUID id;

  private @Nullable String firstName;

  private @Nullable String middleName;

  private @Nullable String lastName;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private @Nullable LocalDate dob;

  private @Nullable String email;

  private @Nullable String phone;

  private @Nullable String location;

  private @Nullable String preferredLocation;

  private @Nullable String highestQualification;

  private @Nullable URI linkedinUrl;

  private @Nullable URI githubUrl;

  private @Nullable URI portfolioUrl;

  private @Nullable ResumeResponse resume;

  public UserProfileResponse id(@Nullable UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Unique profile identifier
   * @return id
   */
  @Valid 
  @Schema(name = "id", description = "Unique profile identifier", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable UUID getId() {
    return id;
  }

  public void setId(@Nullable UUID id) {
    this.id = id;
  }

  public UserProfileResponse firstName(@Nullable String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
   */
  
  @Schema(name = "firstName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("firstName")
  public @Nullable String getFirstName() {
    return firstName;
  }

  public void setFirstName(@Nullable String firstName) {
    this.firstName = firstName;
  }

  public UserProfileResponse middleName(@Nullable String middleName) {
    this.middleName = middleName;
    return this;
  }

  /**
   * Get middleName
   * @return middleName
   */
  
  @Schema(name = "middleName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("middleName")
  public @Nullable String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(@Nullable String middleName) {
    this.middleName = middleName;
  }

  public UserProfileResponse lastName(@Nullable String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
   */
  
  @Schema(name = "lastName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastName")
  public @Nullable String getLastName() {
    return lastName;
  }

  public void setLastName(@Nullable String lastName) {
    this.lastName = lastName;
  }

  public UserProfileResponse dob(@Nullable LocalDate dob) {
    this.dob = dob;
    return this;
  }

  /**
   * Get dob
   * @return dob
   */
  @Valid 
  @Schema(name = "dob", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dob")
  public @Nullable LocalDate getDob() {
    return dob;
  }

  public void setDob(@Nullable LocalDate dob) {
    this.dob = dob;
  }

  public UserProfileResponse email(@Nullable String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
   */
  @jakarta.validation.constraints.Email 
  @Schema(name = "email", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email")
  public @Nullable String getEmail() {
    return email;
  }

  public void setEmail(@Nullable String email) {
    this.email = email;
  }

  public UserProfileResponse phone(@Nullable String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   * @return phone
   */
  
  @Schema(name = "phone", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("phone")
  public @Nullable String getPhone() {
    return phone;
  }

  public void setPhone(@Nullable String phone) {
    this.phone = phone;
  }

  public UserProfileResponse location(@Nullable String location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
   */
  
  @Schema(name = "location", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("location")
  public @Nullable String getLocation() {
    return location;
  }

  public void setLocation(@Nullable String location) {
    this.location = location;
  }

  public UserProfileResponse preferredLocation(@Nullable String preferredLocation) {
    this.preferredLocation = preferredLocation;
    return this;
  }

  /**
   * Get preferredLocation
   * @return preferredLocation
   */
  
  @Schema(name = "preferredLocation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("preferredLocation")
  public @Nullable String getPreferredLocation() {
    return preferredLocation;
  }

  public void setPreferredLocation(@Nullable String preferredLocation) {
    this.preferredLocation = preferredLocation;
  }

  public UserProfileResponse highestQualification(@Nullable String highestQualification) {
    this.highestQualification = highestQualification;
    return this;
  }

  /**
   * Get highestQualification
   * @return highestQualification
   */
  
  @Schema(name = "highestQualification", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("highestQualification")
  public @Nullable String getHighestQualification() {
    return highestQualification;
  }

  public void setHighestQualification(@Nullable String highestQualification) {
    this.highestQualification = highestQualification;
  }

  public UserProfileResponse linkedinUrl(@Nullable URI linkedinUrl) {
    this.linkedinUrl = linkedinUrl;
    return this;
  }

  /**
   * Get linkedinUrl
   * @return linkedinUrl
   */
  @Valid 
  @Schema(name = "linkedinUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("linkedinUrl")
  public @Nullable URI getLinkedinUrl() {
    return linkedinUrl;
  }

  public void setLinkedinUrl(@Nullable URI linkedinUrl) {
    this.linkedinUrl = linkedinUrl;
  }

  public UserProfileResponse githubUrl(@Nullable URI githubUrl) {
    this.githubUrl = githubUrl;
    return this;
  }

  /**
   * Get githubUrl
   * @return githubUrl
   */
  @Valid 
  @Schema(name = "githubUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("githubUrl")
  public @Nullable URI getGithubUrl() {
    return githubUrl;
  }

  public void setGithubUrl(@Nullable URI githubUrl) {
    this.githubUrl = githubUrl;
  }

  public UserProfileResponse portfolioUrl(@Nullable URI portfolioUrl) {
    this.portfolioUrl = portfolioUrl;
    return this;
  }

  /**
   * Get portfolioUrl
   * @return portfolioUrl
   */
  @Valid 
  @Schema(name = "portfolioUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("portfolioUrl")
  public @Nullable URI getPortfolioUrl() {
    return portfolioUrl;
  }

  public void setPortfolioUrl(@Nullable URI portfolioUrl) {
    this.portfolioUrl = portfolioUrl;
  }

  public UserProfileResponse resume(@Nullable ResumeResponse resume) {
    this.resume = resume;
    return this;
  }

  /**
   * Get resume
   * @return resume
   */
  @Valid 
  @Schema(name = "resume", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resume")
  public @Nullable ResumeResponse getResume() {
    return resume;
  }

  public void setResume(@Nullable ResumeResponse resume) {
    this.resume = resume;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserProfileResponse userProfileResponse = (UserProfileResponse) o;
    return Objects.equals(this.id, userProfileResponse.id) &&
        Objects.equals(this.firstName, userProfileResponse.firstName) &&
        Objects.equals(this.middleName, userProfileResponse.middleName) &&
        Objects.equals(this.lastName, userProfileResponse.lastName) &&
        Objects.equals(this.dob, userProfileResponse.dob) &&
        Objects.equals(this.email, userProfileResponse.email) &&
        Objects.equals(this.phone, userProfileResponse.phone) &&
        Objects.equals(this.location, userProfileResponse.location) &&
        Objects.equals(this.preferredLocation, userProfileResponse.preferredLocation) &&
        Objects.equals(this.highestQualification, userProfileResponse.highestQualification) &&
        Objects.equals(this.linkedinUrl, userProfileResponse.linkedinUrl) &&
        Objects.equals(this.githubUrl, userProfileResponse.githubUrl) &&
        Objects.equals(this.portfolioUrl, userProfileResponse.portfolioUrl) &&
        Objects.equals(this.resume, userProfileResponse.resume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstName, middleName, lastName, dob, email, phone, location, preferredLocation, highestQualification, linkedinUrl, githubUrl, portfolioUrl, resume);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserProfileResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    dob: ").append(toIndentedString(dob)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    preferredLocation: ").append(toIndentedString(preferredLocation)).append("\n");
    sb.append("    highestQualification: ").append(toIndentedString(highestQualification)).append("\n");
    sb.append("    linkedinUrl: ").append(toIndentedString(linkedinUrl)).append("\n");
    sb.append("    githubUrl: ").append(toIndentedString(githubUrl)).append("\n");
    sb.append("    portfolioUrl: ").append(toIndentedString(portfolioUrl)).append("\n");
    sb.append("    resume: ").append(toIndentedString(resume)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

