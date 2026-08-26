package com.jobpilot.model.api;

import com.fasterxml.jackson.annotation.JsonValue;


import jakarta.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets AnalysisStatus
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-25T14:00:49.907178+05:30[Asia/Kolkata]", comments = "Generator version: 7.17.0")
public enum AnalysisStatus {
  
  NOT_STARTED("NOT_STARTED"),
  
  IN_PROGRESS("IN_PROGRESS"),
  
  COMPLETED("COMPLETED"),
  
  FAILED("FAILED");

  private final String value;

  AnalysisStatus(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AnalysisStatus fromValue(String value) {
    for (AnalysisStatus b : AnalysisStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

