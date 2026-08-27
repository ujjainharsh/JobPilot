package com.jobpilot.model.api;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * Education
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-26T23:57:26.191196+05:30[Asia/Kolkata]", comments = "Generator version: 7.17.0")
public class Education {

  private @Nullable String institution;

  private @Nullable String degree;

  private @Nullable String fieldOfStudy;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private @Nullable LocalDate startDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private @Nullable LocalDate endDate;

  public Education institution(@Nullable String institution) {
    this.institution = institution;
    return this;
  }

  /**
   * Get institution
   * @return institution
   */
  
  @Schema(name = "institution", example = "XYZ University", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("institution")
  public @Nullable String getInstitution() {
    return institution;
  }

  public void setInstitution(@Nullable String institution) {
    this.institution = institution;
  }

  public Education degree(@Nullable String degree) {
    this.degree = degree;
    return this;
  }

  /**
   * Get degree
   * @return degree
   */
  
  @Schema(name = "degree", example = "Bachelor of Technology", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("degree")
  public @Nullable String getDegree() {
    return degree;
  }

  public void setDegree(@Nullable String degree) {
    this.degree = degree;
  }

  public Education fieldOfStudy(@Nullable String fieldOfStudy) {
    this.fieldOfStudy = fieldOfStudy;
    return this;
  }

  /**
   * Get fieldOfStudy
   * @return fieldOfStudy
   */
  
  @Schema(name = "fieldOfStudy", example = "Computer Science", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fieldOfStudy")
  public @Nullable String getFieldOfStudy() {
    return fieldOfStudy;
  }

  public void setFieldOfStudy(@Nullable String fieldOfStudy) {
    this.fieldOfStudy = fieldOfStudy;
  }

  public Education startDate(@Nullable LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
   */
  @Valid 
  @Schema(name = "startDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startDate")
  public @Nullable LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(@Nullable LocalDate startDate) {
    this.startDate = startDate;
  }

  public Education endDate(@Nullable LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
   */
  @Valid 
  @Schema(name = "endDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endDate")
  public @Nullable LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(@Nullable LocalDate endDate) {
    this.endDate = endDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Education education = (Education) o;
    return Objects.equals(this.institution, education.institution) &&
        Objects.equals(this.degree, education.degree) &&
        Objects.equals(this.fieldOfStudy, education.fieldOfStudy) &&
        Objects.equals(this.startDate, education.startDate) &&
        Objects.equals(this.endDate, education.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(institution, degree, fieldOfStudy, startDate, endDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Education {\n");
    sb.append("    institution: ").append(toIndentedString(institution)).append("\n");
    sb.append("    degree: ").append(toIndentedString(degree)).append("\n");
    sb.append("    fieldOfStudy: ").append(toIndentedString(fieldOfStudy)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

