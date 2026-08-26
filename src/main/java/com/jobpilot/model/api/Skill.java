package com.jobpilot.model.api;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.lang.Nullable;
import io.swagger.v3.oas.annotations.media.Schema;


import jakarta.annotation.Generated;

/**
 * Skill
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-25T14:00:49.907178+05:30[Asia/Kolkata]", comments = "Generator version: 7.17.0")
public class Skill {

  private @Nullable String name;

  private @Nullable String category;

  private @Nullable String proficiency;

  public Skill name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  
  @Schema(name = "name", example = "Java", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public Skill category(@Nullable String category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
   */
  
  @Schema(name = "category", example = "Programming Language", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("category")
  public @Nullable String getCategory() {
    return category;
  }

  public void setCategory(@Nullable String category) {
    this.category = category;
  }

  public Skill proficiency(@Nullable String proficiency) {
    this.proficiency = proficiency;
    return this;
  }

  /**
   * Get proficiency
   * @return proficiency
   */
  
  @Schema(name = "proficiency", example = "Advanced", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("proficiency")
  public @Nullable String getProficiency() {
    return proficiency;
  }

  public void setProficiency(@Nullable String proficiency) {
    this.proficiency = proficiency;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Skill skill = (Skill) o;
    return Objects.equals(this.name, skill.name) &&
        Objects.equals(this.category, skill.category) &&
        Objects.equals(this.proficiency, skill.proficiency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, category, proficiency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Skill {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    proficiency: ").append(toIndentedString(proficiency)).append("\n");
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

