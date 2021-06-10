package io.swagger.model;

import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets DateParsingErrorType
 */
public enum DateParsingErrorType {
  FORMAT("Date is not in parcing format");

  private String value;

  DateParsingErrorType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static DateParsingErrorType fromValue(String text) {
    for (DateParsingErrorType b : DateParsingErrorType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}
