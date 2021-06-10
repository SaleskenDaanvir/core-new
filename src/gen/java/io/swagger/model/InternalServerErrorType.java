package io.swagger.model;

import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets InternalServerErrorType
 */
public enum InternalServerErrorType {
  DABABASE_CONNECTION_FAILED("Dababase connection Failed"),
  
  CONNECTION_DOES_NOT_EXIST("Connection does not exist");

  private String value;

  InternalServerErrorType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static InternalServerErrorType fromValue(String text) {
    for (InternalServerErrorType b : InternalServerErrorType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}
