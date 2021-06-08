package com.salesken.ai.api.exception;

import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets TimeParsingErrorType
 */
public enum TimeParsingErrorType {
  FORMAT("Time is not in parcing format");

  private String value;

  TimeParsingErrorType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TimeParsingErrorType fromValue(String text) {
    for (TimeParsingErrorType b : TimeParsingErrorType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}
