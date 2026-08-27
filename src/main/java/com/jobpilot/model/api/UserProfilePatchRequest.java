package com.jobpilot.model.api;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Request used to partially update a user profile. Only the fields supplied in the request will be updated. 
 */

@Schema(name = "UserProfilePatchRequest", description = "Request used to partially update a user profile. Only the fields supplied in the request will be updated. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-26T23:57:26.191196+05:30[Asia/Kolkata]", comments = "Generator version: 7.17.0")
public class UserProfilePatchRequest {

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

  public UserProfilePatchRequest firstName(@Nullable String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
   */
  
  @Schema(name = "firstName", example = "Harshvardhan", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("firstName")
  public @Nullable String getFirstName() {
    return firstName;
  }

  public void setFirstName(@Nullable String firstName) {
    this.firstName = firstName;
  }

  public UserProfilePatchRequest middleName(@Nullable String middleName) {
    this.middleName = middleName;
    return this;
  }

  /**
   * Get middleName
   * @return middleName
   */
  
  @Schema(name = "middleName", example = "Kumar", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("middleName")
  public @Nullable String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(@Nullable String middleName) {
    this.middleName = middleName;
  }

  public UserProfilePatchRequest lastName(@Nullable String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
   */
  
  @Schema(name = "lastName", example = "Ujjain", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastName")
  public @Nullable String getLastName() {
    return lastName;
  }

  public void setLastName(@Nullable String lastName) {
    this.lastName = lastName;
  }

  public UserProfilePatchRequest dob(@Nullable LocalDate dob) {
    this.dob = dob;
    return this;
  }

  /**
   * Get dob
   * @return dob
   */
  @Valid 
  @Schema(name = "dob", example = "1992-05-15", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dob")
  public @Nullable LocalDate getDob() {
    return dob;
  }

  public void setDob(@Nullable LocalDate dob) {
    this.dob = dob;
  }

  public UserProfilePatchRequest email(@Nullable String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
   */
  @jakarta.validation.constraints.Email 
  @Schema(name = "email", example = "harsh@example.com", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email")
  public @Nullable String getEmail() {
    return email;
  }

  public void setEmail(@Nullable String email) {
    this.email = email;
  }

  public UserProfilePatchRequest phone(@Nullable String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   * @return phone
   */
  
  @Schema(name = "phone", example = "+919876543210", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("phone")
  public @Nullable String getPhone() {
    return phone;
  }

  public void setPhone(@Nullable String phone) {
    this.phone = phone;
  }

  public UserProfilePatchRequest location(@Nullable String location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
   */
  
  @Schema(name = "location", example = "Bangalore", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("location")
  public @Nullable String getLocation() {
    return location;
  }

  public void setLocation(@Nullable String location) {
    this.location = location;
  }

  public UserProfilePatchRequest preferredLocation(@Nullable String preferredLocation) {
    this.preferredLocation = preferredLocation;
    return this;
  }

  /**
   * Get preferredLocation
   * @return preferredLocation
   */
  
  @Schema(name = "preferredLocation", example = "Hyderabad", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("preferredLocation")
  public @Nullable String getPreferredLocation() {
    return preferredLocation;
  }

  public void setPreferredLocation(@Nullable String preferredLocation) {
    this.preferredLocation = preferredLocation;
  }

  public UserProfilePatchRequest highestQualification(@Nullable String highestQualification) {
    this.highestQualification = highestQualification;
    return this;
  }

  /**
   * Get highestQualification
   * @return highestQualification
   */
  
  @Schema(name = "highestQualification", example = "Master of Technology", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("highestQualification")
  public @Nullable String getHighestQualification() {
    return highestQualification;
  }

  public void setHighestQualification(@Nullable String highestQualification) {
    this.highestQualification = highestQualification;
  }

  public UserProfilePatchRequest linkedinUrl(@Nullable URI linkedinUrl) {
    this.linkedinUrl = linkedinUrl;
    return this;
  }

  /**
   * Get linkedinUrl
   * @return linkedinUrl
   */
  @Valid 
  @Schema(name = "linkedinUrl", example = "https://www.linkedin.com/in/example", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("linkedinUrl")
  public @Nullable URI getLinkedinUrl() {
    return linkedinUrl;
  }

  public void setLinkedinUrl(@Nullable URI linkedinUrl) {
    this.linkedinUrl = linkedinUrl;
  }

  public UserProfilePatchRequest githubUrl(@Nullable URI githubUrl) {
    this.githubUrl = githubUrl;
    return this;
  }

  /**
   * Get githubUrl
   * @return githubUrl
   */
  @Valid 
  @Schema(name = "githubUrl", example = "https://github.com/example", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("githubUrl")
  public @Nullable URI getGithubUrl() {
    return githubUrl;
  }

  public void setGithubUrl(@Nullable URI githubUrl) {
    this.githubUrl = githubUrl;
  }

  public UserProfilePatchRequest portfolioUrl(@Nullable URI portfolioUrl) {
    this.portfolioUrl = portfolioUrl;
    return this;
  }

  /**
   * Get portfolioUrl
   * @return portfolioUrl
   */
  @Valid 
  @Schema(name = "portfolioUrl", example = "https://example.com", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("portfolioUrl")
  public @Nullable URI getPortfolioUrl() {
    return portfolioUrl;
  }

  public void setPortfolioUrl(@Nullable URI portfolioUrl) {
    this.portfolioUrl = portfolioUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserProfilePatchRequest userProfilePatchRequest = (UserProfilePatchRequest) o;
    return Objects.equals(this.firstName, userProfilePatchRequest.firstName) &&
        Objects.equals(this.middleName, userProfilePatchRequest.middleName) &&
        Objects.equals(this.lastName, userProfilePatchRequest.lastName) &&
        Objects.equals(this.dob, userProfilePatchRequest.dob) &&
        Objects.equals(this.email, userProfilePatchRequest.email) &&
        Objects.equals(this.phone, userProfilePatchRequest.phone) &&
        Objects.equals(this.location, userProfilePatchRequest.location) &&
        Objects.equals(this.preferredLocation, userProfilePatchRequest.preferredLocation) &&
        Objects.equals(this.highestQualification, userProfilePatchRequest.highestQualification) &&
        Objects.equals(this.linkedinUrl, userProfilePatchRequest.linkedinUrl) &&
        Objects.equals(this.githubUrl, userProfilePatchRequest.githubUrl) &&
        Objects.equals(this.portfolioUrl, userProfilePatchRequest.portfolioUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, middleName, lastName, dob, email, phone, location, preferredLocation, highestQualification, linkedinUrl, githubUrl, portfolioUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserProfilePatchRequest {\n");
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

