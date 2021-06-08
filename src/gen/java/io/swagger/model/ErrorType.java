package io.swagger.model;

import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ErrorType
 */
public enum ErrorType {
  BADREQUESTERROR("BadRequestError"),
  
  UNAUTHORIZETOKENERROR("UnAuthorizeTokenError"),
  
  DBERROR("DBError"),
  
  DATEPARSINGERROR("DateParsingError"),
  
  TIMEPARSINGERROR("TimeParsingError"),
  
  AUTHTOKENNOTFOUND("AuthTokenNotFound"),
  
  INTERNALSERVERERROR("InternalServerError"),
  
  NOTFOUNDERROR("NotFoundError");

  private String value;

  ErrorType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ErrorType fromValue(String text) {
    for (ErrorType b : ErrorType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}
