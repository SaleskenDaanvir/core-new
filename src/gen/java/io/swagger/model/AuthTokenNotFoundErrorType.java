package io.swagger.model;

import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets AuthTokenNotFoundErrorType
 */
public enum AuthTokenNotFoundErrorType {
  USER("Auth token not supplied for user");

  private String value;

  AuthTokenNotFoundErrorType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AuthTokenNotFoundErrorType fromValue(String text) {
    for (AuthTokenNotFoundErrorType b : AuthTokenNotFoundErrorType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}
