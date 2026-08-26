package com.jobpilot.model.api;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.jobpilot.model.api.AnalysisStatus;
import java.time.OffsetDateTime;
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
 * ResumeResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-26T23:00:58.793955+05:30[Asia/Kolkata]", comments = "Generator version: 7.17.0")
public class ResumeResponse {

  private @Nullable UUID id;

  private @Nullable String fileName;

  private @Nullable String contentType;

  private @Nullable Long fileSize;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime uploadedAt;

  private @Nullable AnalysisStatus analysisStatus;

  public ResumeResponse id(@Nullable UUID id) {
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

  public ResumeResponse fileName(@Nullable String fileName) {
    this.fileName = fileName;
    return this;
  }

  /**
   * Get fileName
   * @return fileName
   */
  
  @Schema(name = "fileName", example = "harsh-resume.pdf", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fileName")
  public @Nullable String getFileName() {
    return fileName;
  }

  public void setFileName(@Nullable String fileName) {
    this.fileName = fileName;
  }

  public ResumeResponse contentType(@Nullable String contentType) {
    this.contentType = contentType;
    return this;
  }

  /**
   * Get contentType
   * @return contentType
   */
  
  @Schema(name = "contentType", example = "application/pdf", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contentType")
  public @Nullable String getContentType() {
    return contentType;
  }

  public void setContentType(@Nullable String contentType) {
    this.contentType = contentType;
  }

  public ResumeResponse fileSize(@Nullable Long fileSize) {
    this.fileSize = fileSize;
    return this;
  }

  /**
   * Get fileSize
   * @return fileSize
   */
  
  @Schema(name = "fileSize", example = "524288", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fileSize")
  public @Nullable Long getFileSize() {
    return fileSize;
  }

  public void setFileSize(@Nullable Long fileSize) {
    this.fileSize = fileSize;
  }

  public ResumeResponse uploadedAt(@Nullable OffsetDateTime uploadedAt) {
    this.uploadedAt = uploadedAt;
    return this;
  }

  /**
   * Get uploadedAt
   * @return uploadedAt
   */
  @Valid 
  @Schema(name = "uploadedAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("uploadedAt")
  public @Nullable OffsetDateTime getUploadedAt() {
    return uploadedAt;
  }

  public void setUploadedAt(@Nullable OffsetDateTime uploadedAt) {
    this.uploadedAt = uploadedAt;
  }

  public ResumeResponse analysisStatus(@Nullable AnalysisStatus analysisStatus) {
    this.analysisStatus = analysisStatus;
    return this;
  }

  /**
   * Get analysisStatus
   * @return analysisStatus
   */
  @Valid 
  @Schema(name = "analysisStatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("analysisStatus")
  public @Nullable AnalysisStatus getAnalysisStatus() {
    return analysisStatus;
  }

  public void setAnalysisStatus(@Nullable AnalysisStatus analysisStatus) {
    this.analysisStatus = analysisStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumeResponse resumeResponse = (ResumeResponse) o;
    return Objects.equals(this.id, resumeResponse.id) &&
        Objects.equals(this.fileName, resumeResponse.fileName) &&
        Objects.equals(this.contentType, resumeResponse.contentType) &&
        Objects.equals(this.fileSize, resumeResponse.fileSize) &&
        Objects.equals(this.uploadedAt, resumeResponse.uploadedAt) &&
        Objects.equals(this.analysisStatus, resumeResponse.analysisStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, fileName, contentType, fileSize, uploadedAt, analysisStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    uploadedAt: ").append(toIndentedString(uploadedAt)).append("\n");
    sb.append("    analysisStatus: ").append(toIndentedString(analysisStatus)).append("\n");
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

