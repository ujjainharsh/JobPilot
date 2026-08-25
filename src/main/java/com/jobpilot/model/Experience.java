package com.jobpilot.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Experience
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-25T14:00:49.907178+05:30[Asia/Kolkata]", comments = "Generator version: 7.17.0")
public class Experience {

  private @Nullable String company;

  private @Nullable String jobTitle;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private @Nullable LocalDate startDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private @Nullable LocalDate endDate;

  private @Nullable Boolean currentlyWorking;

  @Valid
  private List<String> responsibilities = new ArrayList<>();

  public Experience company(@Nullable String company) {
    this.company = company;
    return this;
  }

  /**
   * Get company
   * @return company
   */
  
  @Schema(name = "company", example = "ABC Technologies", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("company")
  public @Nullable String getCompany() {
    return company;
  }

  public void setCompany(@Nullable String company) {
    this.company = company;
  }

  public Experience jobTitle(@Nullable String jobTitle) {
    this.jobTitle = jobTitle;
    return this;
  }

  /**
   * Get jobTitle
   * @return jobTitle
   */
  
  @Schema(name = "jobTitle", example = "Senior Software Engineer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jobTitle")
  public @Nullable String getJobTitle() {
    return jobTitle;
  }

  public void setJobTitle(@Nullable String jobTitle) {
    this.jobTitle = jobTitle;
  }

  public Experience startDate(@Nullable LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
   */
  @Valid 
  @Schema(name = "startDate", example = "2018-01-01", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startDate")
  public @Nullable LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(@Nullable LocalDate startDate) {
    this.startDate = startDate;
  }

  public Experience endDate(@Nullable LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
   */
  @Valid 
  @Schema(name = "endDate", example = "2022-12-31", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endDate")
  public @Nullable LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(@Nullable LocalDate endDate) {
    this.endDate = endDate;
  }

  public Experience currentlyWorking(@Nullable Boolean currentlyWorking) {
    this.currentlyWorking = currentlyWorking;
    return this;
  }

  /**
   * Get currentlyWorking
   * @return currentlyWorking
   */
  
  @Schema(name = "currentlyWorking", example = "false", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currentlyWorking")
  public @Nullable Boolean getCurrentlyWorking() {
    return currentlyWorking;
  }

  public void setCurrentlyWorking(@Nullable Boolean currentlyWorking) {
    this.currentlyWorking = currentlyWorking;
  }

  public Experience responsibilities(List<String> responsibilities) {
    this.responsibilities = responsibilities;
    return this;
  }

  public Experience addResponsibilitiesItem(String responsibilitiesItem) {
    if (this.responsibilities == null) {
      this.responsibilities = new ArrayList<>();
    }
    this.responsibilities.add(responsibilitiesItem);
    return this;
  }

  /**
   * Get responsibilities
   * @return responsibilities
   */
  
  @Schema(name = "responsibilities", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("responsibilities")
  public List<String> getResponsibilities() {
    return responsibilities;
  }

  public void setResponsibilities(List<String> responsibilities) {
    this.responsibilities = responsibilities;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Experience experience = (Experience) o;
    return Objects.equals(this.company, experience.company) &&
        Objects.equals(this.jobTitle, experience.jobTitle) &&
        Objects.equals(this.startDate, experience.startDate) &&
        Objects.equals(this.endDate, experience.endDate) &&
        Objects.equals(this.currentlyWorking, experience.currentlyWorking) &&
        Objects.equals(this.responsibilities, experience.responsibilities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(company, jobTitle, startDate, endDate, currentlyWorking, responsibilities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Experience {\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    currentlyWorking: ").append(toIndentedString(currentlyWorking)).append("\n");
    sb.append("    responsibilities: ").append(toIndentedString(responsibilities)).append("\n");
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

