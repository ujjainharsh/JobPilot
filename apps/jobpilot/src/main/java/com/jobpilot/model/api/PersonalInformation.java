package com.jobpilot.model.api;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import jakarta.annotation.Generated;

/**
 * PersonalInformation
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-25T11:34:44.760111+05:30[Asia/Kolkata]", comments = "Generator version: 7.17.0")
public class PersonalInformation {

  private String firstName;

  private @Nullable String middleName = null;

  private String lastName;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private @Nullable LocalDate dob;

  private @Nullable String highestQualification;

  private @Nullable String location;

  private @Nullable String preferredLocation;

  public PersonalInformation() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PersonalInformation(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public PersonalInformation firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
   */
  @NotNull @Size(min = 1, max = 100) 
  @Schema(name = "firstName", example = "Harshvardhan", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public PersonalInformation middleName(@Nullable String middleName) {
    this.middleName = middleName;
    return this;
  }

  /**
   * Get middleName
   * @return middleName
   */
  @Size(max = 100) 
  @Schema(name = "middleName", example = "Kumar", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("middleName")
  public @Nullable String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(@Nullable String middleName) {
    this.middleName = middleName;
  }

  public PersonalInformation lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
   */
  @NotNull @Size(min = 1, max = 100) 
  @Schema(name = "lastName", example = "Ujjain", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public PersonalInformation dob(@Nullable LocalDate dob) {
    this.dob = dob;
    return this;
  }

  /**
   * Get dob
   * @return dob
   */
  @Valid 
  @Schema(name = "dob", example = "1990-05-15", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dob")
  public @Nullable LocalDate getDob() {
    return dob;
  }

  public void setDob(@Nullable LocalDate dob) {
    this.dob = dob;
  }

  public PersonalInformation highestQualification(@Nullable String highestQualification) {
    this.highestQualification = highestQualification;
    return this;
  }

  /**
   * Get highestQualification
   * @return highestQualification
   */
  
  @Schema(name = "highestQualification", example = "Bachelor of Technology", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("highestQualification")
  public @Nullable String getHighestQualification() {
    return highestQualification;
  }

  public void setHighestQualification(@Nullable String highestQualification) {
    this.highestQualification = highestQualification;
  }

  public PersonalInformation location(@Nullable String location) {
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

  public PersonalInformation preferredLocation(@Nullable String preferredLocation) {
    this.preferredLocation = preferredLocation;
    return this;
  }

  /**
   * Get preferredLocation
   * @return preferredLocation
   */
  
  @Schema(name = "preferredLocation", example = "Bangalore", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("preferredLocation")
  public @Nullable String getPreferredLocation() {
    return preferredLocation;
  }

  public void setPreferredLocation(@Nullable String preferredLocation) {
    this.preferredLocation = preferredLocation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonalInformation personalInformation = (PersonalInformation) o;
    return Objects.equals(this.firstName, personalInformation.firstName) &&
        Objects.equals(this.middleName, personalInformation.middleName) &&
        Objects.equals(this.lastName, personalInformation.lastName) &&
        Objects.equals(this.dob, personalInformation.dob) &&
        Objects.equals(this.highestQualification, personalInformation.highestQualification) &&
        Objects.equals(this.location, personalInformation.location) &&
        Objects.equals(this.preferredLocation, personalInformation.preferredLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, middleName, lastName, dob, highestQualification, location, preferredLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalInformation {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    dob: ").append(toIndentedString(dob)).append("\n");
    sb.append("    highestQualification: ").append(toIndentedString(highestQualification)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    preferredLocation: ").append(toIndentedString(preferredLocation)).append("\n");
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

