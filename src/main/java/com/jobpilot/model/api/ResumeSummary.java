package com.jobpilot.model.api;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import org.springframework.lang.Nullable;
import jakarta.validation.Valid;
import io.swagger.v3.oas.annotations.media.Schema;


import jakarta.annotation.Generated;

/**
 * ResumeSummary
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-25T14:00:49.907178+05:30[Asia/Kolkata]", comments = "Generator version: 7.17.0")
public class ResumeSummary {

  private @Nullable String summary;

  private @Nullable Double yearsOfExperience;

  @Valid
  private List<String> strengths = new ArrayList<>();

  @Valid
  private List<String> areasForImprovement = new ArrayList<>();

  public ResumeSummary summary(@Nullable String summary) {
    this.summary = summary;
    return this;
  }

  /**
   * Get summary
   * @return summary
   */
  
  @Schema(name = "summary", example = "Experienced Java developer with strong expertise in Spring Boot, microservices and distributed systems. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("summary")
  public @Nullable String getSummary() {
    return summary;
  }

  public void setSummary(@Nullable String summary) {
    this.summary = summary;
  }

  public ResumeSummary yearsOfExperience(@Nullable Double yearsOfExperience) {
    this.yearsOfExperience = yearsOfExperience;
    return this;
  }

  /**
   * Get yearsOfExperience
   * @return yearsOfExperience
   */
  
  @Schema(name = "yearsOfExperience", example = "10.0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("yearsOfExperience")
  public @Nullable Double getYearsOfExperience() {
    return yearsOfExperience;
  }

  public void setYearsOfExperience(@Nullable Double yearsOfExperience) {
    this.yearsOfExperience = yearsOfExperience;
  }

  public ResumeSummary strengths(List<String> strengths) {
    this.strengths = strengths;
    return this;
  }

  public ResumeSummary addStrengthsItem(String strengthsItem) {
    if (this.strengths == null) {
      this.strengths = new ArrayList<>();
    }
    this.strengths.add(strengthsItem);
    return this;
  }

  /**
   * Get strengths
   * @return strengths
   */
  
  @Schema(name = "strengths", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("strengths")
  public List<String> getStrengths() {
    return strengths;
  }

  public void setStrengths(List<String> strengths) {
    this.strengths = strengths;
  }

  public ResumeSummary areasForImprovement(List<String> areasForImprovement) {
    this.areasForImprovement = areasForImprovement;
    return this;
  }

  public ResumeSummary addAreasForImprovementItem(String areasForImprovementItem) {
    if (this.areasForImprovement == null) {
      this.areasForImprovement = new ArrayList<>();
    }
    this.areasForImprovement.add(areasForImprovementItem);
    return this;
  }

  /**
   * Get areasForImprovement
   * @return areasForImprovement
   */
  
  @Schema(name = "areasForImprovement", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("areasForImprovement")
  public List<String> getAreasForImprovement() {
    return areasForImprovement;
  }

  public void setAreasForImprovement(List<String> areasForImprovement) {
    this.areasForImprovement = areasForImprovement;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumeSummary resumeSummary = (ResumeSummary) o;
    return Objects.equals(this.summary, resumeSummary.summary) &&
        Objects.equals(this.yearsOfExperience, resumeSummary.yearsOfExperience) &&
        Objects.equals(this.strengths, resumeSummary.strengths) &&
        Objects.equals(this.areasForImprovement, resumeSummary.areasForImprovement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(summary, yearsOfExperience, strengths, areasForImprovement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeSummary {\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    yearsOfExperience: ").append(toIndentedString(yearsOfExperience)).append("\n");
    sb.append("    strengths: ").append(toIndentedString(strengths)).append("\n");
    sb.append("    areasForImprovement: ").append(toIndentedString(areasForImprovement)).append("\n");
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

