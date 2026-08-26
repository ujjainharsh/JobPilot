package com.jobpilot.model.api;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.lang.Nullable;
import jakarta.validation.Valid;
import io.swagger.v3.oas.annotations.media.Schema;


import jakarta.annotation.Generated;

/**
 * ProfessionalLinks
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-25T11:34:44.760111+05:30[Asia/Kolkata]", comments = "Generator version: 7.17.0")
public class ProfessionalLinks {

  private @Nullable URI linkedinUrl = null;

  private @Nullable URI githubUrl = null;

  private @Nullable URI portfolioUrl = null;

  public ProfessionalLinks linkedinUrl(@Nullable URI linkedinUrl) {
    this.linkedinUrl = linkedinUrl;
    return this;
  }

  /**
   * Get linkedinUrl
   * @return linkedinUrl
   */
  @Valid 
  @Schema(name = "linkedinUrl", example = "https://linkedin.com/in/username", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("linkedinUrl")
  public @Nullable URI getLinkedinUrl() {
    return linkedinUrl;
  }

  public void setLinkedinUrl(@Nullable URI linkedinUrl) {
    this.linkedinUrl = linkedinUrl;
  }

  public ProfessionalLinks githubUrl(@Nullable URI githubUrl) {
    this.githubUrl = githubUrl;
    return this;
  }

  /**
   * Get githubUrl
   * @return githubUrl
   */
  @Valid 
  @Schema(name = "githubUrl", example = "https://github.com/username", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("githubUrl")
  public @Nullable URI getGithubUrl() {
    return githubUrl;
  }

  public void setGithubUrl(@Nullable URI githubUrl) {
    this.githubUrl = githubUrl;
  }

  public ProfessionalLinks portfolioUrl(@Nullable URI portfolioUrl) {
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
    ProfessionalLinks professionalLinks = (ProfessionalLinks) o;
    return Objects.equals(this.linkedinUrl, professionalLinks.linkedinUrl) &&
        Objects.equals(this.githubUrl, professionalLinks.githubUrl) &&
        Objects.equals(this.portfolioUrl, professionalLinks.portfolioUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkedinUrl, githubUrl, portfolioUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfessionalLinks {\n");
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

