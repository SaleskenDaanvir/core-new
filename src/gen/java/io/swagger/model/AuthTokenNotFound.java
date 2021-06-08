package io.swagger.model;

import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets AuthTokenNotFound
 */
public enum AuthTokenNotFound {
  USER("Auth token not supplied for user");

  private String value;

  AuthTokenNotFound(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AuthTokenNotFound fromValue(String text) {
    for (AuthTokenNotFound b : AuthTokenNotFound.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}
