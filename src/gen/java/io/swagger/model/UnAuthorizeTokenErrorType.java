package io.swagger.model;

import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets UnAuthorizeTokenErrorType
 */
public enum UnAuthorizeTokenErrorType {
  INVALID_FOR_USER("Auth token invalid for User"),
  
  HOLDER_IS_NOT_AUTHORIZED("Auth token holder is not authorized");

  private String value;

  UnAuthorizeTokenErrorType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static UnAuthorizeTokenErrorType fromValue(String text) {
    for (UnAuthorizeTokenErrorType b : UnAuthorizeTokenErrorType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}
