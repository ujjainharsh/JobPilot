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
 * UserProfileRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class UserProfileRequest {

  private String firstName;

  private @Nullable String middleName;

  private String lastName;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private @Nullable LocalDate dob;

  private String email;

  private String phone;

  private @Nullable String location;

  private @Nullable String preferredLocation;

  private @Nullable String highestQualification;

  private @Nullable URI linkedinUrl;

  private @Nullable URI githubUrl;

  private @Nullable URI portfolioUrl;

  public UserProfileRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UserProfileRequest(String firstName, String lastName, String email, String phone) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.phone = phone;
  }

  public UserProfileRequest firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * User's first name
   * @return firstName
   */
  @NotNull 
  @Schema(name = "firstName", example = "Harshvardhan", description = "User's first name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public UserProfileRequest middleName(@Nullable String middleName) {
    this.middleName = middleName;
    return this;
  }

  /**
   * User's middle name
   * @return middleName
   */
  
  @Schema(name = "middleName", example = "Kumar", description = "User's middle name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("middleName")
  public @Nullable String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(@Nullable String middleName) {
    this.middleName = middleName;
  }

  public UserProfileRequest lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * User's last name
   * @return lastName
   */
  @NotNull 
  @Schema(name = "lastName", example = "Ujjain", description = "User's last name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public UserProfileRequest dob(@Nullable LocalDate dob) {
    this.dob = dob;
    return this;
  }

  /**
   * User's date of birth
   * @return dob
   */
  @Valid 
  @Schema(name = "dob", example = "1992-05-15", description = "User's date of birth", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dob")
  public @Nullable LocalDate getDob() {
    return dob;
  }

  public void setDob(@Nullable LocalDate dob) {
    this.dob = dob;
  }

  public UserProfileRequest email(String email) {
    this.email = email;
    return this;
  }

  /**
   * User's email address
   * @return email
   */
  @NotNull @jakarta.validation.constraints.Email 
  @Schema(name = "email", example = "harsh@example.com", description = "User's email address", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserProfileRequest phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * User's phone number
   * @return phone
   */
  @NotNull 
  @Schema(name = "phone", example = "+919876543210", description = "User's phone number", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("phone")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public UserProfileRequest location(@Nullable String location) {
    this.location = location;
    return this;
  }

  /**
   * User's current location
   * @return location
   */
  
  @Schema(name = "location", example = "Bangalore", description = "User's current location", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("location")
  public @Nullable String getLocation() {
    return location;
  }

  public void setLocation(@Nullable String location) {
    this.location = location;
  }

  public UserProfileRequest preferredLocation(@Nullable String preferredLocation) {
    this.preferredLocation = preferredLocation;
    return this;
  }

  /**
   * User's preferred job location
   * @return preferredLocation
   */
  
  @Schema(name = "preferredLocation", example = "Bangalore", description = "User's preferred job location", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("preferredLocation")
  public @Nullable String getPreferredLocation() {
    return preferredLocation;
  }

  public void setPreferredLocation(@Nullable String preferredLocation) {
    this.preferredLocation = preferredLocation;
  }

  public UserProfileRequest highestQualification(@Nullable String highestQualification) {
    this.highestQualification = highestQualification;
    return this;
  }

  /**
   * User's highest qualification
   * @return highestQualification
   */
  
  @Schema(name = "highestQualification", example = "Bachelor of Technology", description = "User's highest qualification", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("highestQualification")
  public @Nullable String getHighestQualification() {
    return highestQualification;
  }

  public void setHighestQualification(@Nullable String highestQualification) {
    this.highestQualification = highestQualification;
  }

  public UserProfileRequest linkedinUrl(@Nullable URI linkedinUrl) {
    this.linkedinUrl = linkedinUrl;
    return this;
  }

  /**
   * LinkedIn profile URL
   * @return linkedinUrl
   */
  @Valid 
  @Schema(name = "linkedinUrl", example = "https://www.linkedin.com/in/example", description = "LinkedIn profile URL", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("linkedinUrl")
  public @Nullable URI getLinkedinUrl() {
    return linkedinUrl;
  }

  public void setLinkedinUrl(@Nullable URI linkedinUrl) {
    this.linkedinUrl = linkedinUrl;
  }

  public UserProfileRequest githubUrl(@Nullable URI githubUrl) {
    this.githubUrl = githubUrl;
    return this;
  }

  /**
   * GitHub profile URL
   * @return githubUrl
   */
  @Valid 
  @Schema(name = "githubUrl", example = "https://github.com/example", description = "GitHub profile URL", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("githubUrl")
  public @Nullable URI getGithubUrl() {
    return githubUrl;
  }

  public void setGithubUrl(@Nullable URI githubUrl) {
    this.githubUrl = githubUrl;
  }

  public UserProfileRequest portfolioUrl(@Nullable URI portfolioUrl) {
    this.portfolioUrl = portfolioUrl;
    return this;
  }

  /**
   * Portfolio URL
   * @return portfolioUrl
   */
  @Valid 
  @Schema(name = "portfolioUrl", example = "https://example.com", description = "Portfolio URL", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    UserProfileRequest userProfileRequest = (UserProfileRequest) o;
    return Objects.equals(this.firstName, userProfileRequest.firstName) &&
        Objects.equals(this.middleName, userProfileRequest.middleName) &&
        Objects.equals(this.lastName, userProfileRequest.lastName) &&
        Objects.equals(this.dob, userProfileRequest.dob) &&
        Objects.equals(this.email, userProfileRequest.email) &&
        Objects.equals(this.phone, userProfileRequest.phone) &&
        Objects.equals(this.location, userProfileRequest.location) &&
        Objects.equals(this.preferredLocation, userProfileRequest.preferredLocation) &&
        Objects.equals(this.highestQualification, userProfileRequest.highestQualification) &&
        Objects.equals(this.linkedinUrl, userProfileRequest.linkedinUrl) &&
        Objects.equals(this.githubUrl, userProfileRequest.githubUrl) &&
        Objects.equals(this.portfolioUrl, userProfileRequest.portfolioUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, middleName, lastName, dob, email, phone, location, preferredLocation, highestQualification, linkedinUrl, githubUrl, portfolioUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserProfileRequest {\n");
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

