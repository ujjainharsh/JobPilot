package com.jobpilot.model.api;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.jobpilot.model.api.AnalysisStatus;
import com.jobpilot.model.api.Education;
import com.jobpilot.model.api.Experience;
import com.jobpilot.model.api.ResumeSummary;
import com.jobpilot.model.api.Skill;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ResumeAnalysisResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-26T23:00:58.793955+05:30[Asia/Kolkata]", comments = "Generator version: 7.17.0")
public class ResumeAnalysisResponse {

  private @Nullable UUID id;

  private @Nullable UUID resumeId;

  private @Nullable AnalysisStatus status;

  @Valid
  private List<@Valid Skill> skills = new ArrayList<>();

  @Valid
  private List<@Valid Experience> experience = new ArrayList<>();

  @Valid
  private List<@Valid Education> education = new ArrayList<>();

  private @Nullable ResumeSummary resumeSummary;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime analyzedAt;

  public ResumeAnalysisResponse id(@Nullable UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @Valid 
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable UUID getId() {
    return id;
  }

  public void setId(@Nullable UUID id) {
    this.id = id;
  }

  public ResumeAnalysisResponse resumeId(@Nullable UUID resumeId) {
    this.resumeId = resumeId;
    return this;
  }

  /**
   * Get resumeId
   * @return resumeId
   */
  @Valid 
  @Schema(name = "resumeId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resumeId")
  public @Nullable UUID getResumeId() {
    return resumeId;
  }

  public void setResumeId(@Nullable UUID resumeId) {
    this.resumeId = resumeId;
  }

  public ResumeAnalysisResponse status(@Nullable AnalysisStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public @Nullable AnalysisStatus getStatus() {
    return status;
  }

  public void setStatus(@Nullable AnalysisStatus status) {
    this.status = status;
  }

  public ResumeAnalysisResponse skills(List<@Valid Skill> skills) {
    this.skills = skills;
    return this;
  }

  public ResumeAnalysisResponse addSkillsItem(Skill skillsItem) {
    if (this.skills == null) {
      this.skills = new ArrayList<>();
    }
    this.skills.add(skillsItem);
    return this;
  }

  /**
   * Get skills
   * @return skills
   */
  @Valid 
  @Schema(name = "skills", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("skills")
  public List<@Valid Skill> getSkills() {
    return skills;
  }

  public void setSkills(List<@Valid Skill> skills) {
    this.skills = skills;
  }

  public ResumeAnalysisResponse experience(List<@Valid Experience> experience) {
    this.experience = experience;
    return this;
  }

  public ResumeAnalysisResponse addExperienceItem(Experience experienceItem) {
    if (this.experience == null) {
      this.experience = new ArrayList<>();
    }
    this.experience.add(experienceItem);
    return this;
  }

  /**
   * Get experience
   * @return experience
   */
  @Valid 
  @Schema(name = "experience", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("experience")
  public List<@Valid Experience> getExperience() {
    return experience;
  }

  public void setExperience(List<@Valid Experience> experience) {
    this.experience = experience;
  }

  public ResumeAnalysisResponse education(List<@Valid Education> education) {
    this.education = education;
    return this;
  }

  public ResumeAnalysisResponse addEducationItem(Education educationItem) {
    if (this.education == null) {
      this.education = new ArrayList<>();
    }
    this.education.add(educationItem);
    return this;
  }

  /**
   * Get education
   * @return education
   */
  @Valid 
  @Schema(name = "education", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("education")
  public List<@Valid Education> getEducation() {
    return education;
  }

  public void setEducation(List<@Valid Education> education) {
    this.education = education;
  }

  public ResumeAnalysisResponse resumeSummary(@Nullable ResumeSummary resumeSummary) {
    this.resumeSummary = resumeSummary;
    return this;
  }

  /**
   * Get resumeSummary
   * @return resumeSummary
   */
  @Valid 
  @Schema(name = "resumeSummary", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resumeSummary")
  public @Nullable ResumeSummary getResumeSummary() {
    return resumeSummary;
  }

  public void setResumeSummary(@Nullable ResumeSummary resumeSummary) {
    this.resumeSummary = resumeSummary;
  }

  public ResumeAnalysisResponse analyzedAt(@Nullable OffsetDateTime analyzedAt) {
    this.analyzedAt = analyzedAt;
    return this;
  }

  /**
   * Get analyzedAt
   * @return analyzedAt
   */
  @Valid 
  @Schema(name = "analyzedAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("analyzedAt")
  public @Nullable OffsetDateTime getAnalyzedAt() {
    return analyzedAt;
  }

  public void setAnalyzedAt(@Nullable OffsetDateTime analyzedAt) {
    this.analyzedAt = analyzedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumeAnalysisResponse resumeAnalysisResponse = (ResumeAnalysisResponse) o;
    return Objects.equals(this.id, resumeAnalysisResponse.id) &&
        Objects.equals(this.resumeId, resumeAnalysisResponse.resumeId) &&
        Objects.equals(this.status, resumeAnalysisResponse.status) &&
        Objects.equals(this.skills, resumeAnalysisResponse.skills) &&
        Objects.equals(this.experience, resumeAnalysisResponse.experience) &&
        Objects.equals(this.education, resumeAnalysisResponse.education) &&
        Objects.equals(this.resumeSummary, resumeAnalysisResponse.resumeSummary) &&
        Objects.equals(this.analyzedAt, resumeAnalysisResponse.analyzedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, resumeId, status, skills, experience, education, resumeSummary, analyzedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeAnalysisResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    resumeId: ").append(toIndentedString(resumeId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    skills: ").append(toIndentedString(skills)).append("\n");
    sb.append("    experience: ").append(toIndentedString(experience)).append("\n");
    sb.append("    education: ").append(toIndentedString(education)).append("\n");
    sb.append("    resumeSummary: ").append(toIndentedString(resumeSummary)).append("\n");
    sb.append("    analyzedAt: ").append(toIndentedString(analyzedAt)).append("\n");
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

