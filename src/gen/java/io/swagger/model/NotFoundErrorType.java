package io.swagger.model;

import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets NotFoundErrorType
 */
public enum NotFoundErrorType {
  ORGID_NOT_FOUND("OrgId not found"),
  
  USERID_NOT_FOUND("UserId not found"),
  
  ORGNAME_NOT_FOUND("OrgName not found"),
  
  ORGWEBSITE_NOT_FOUND("OrgWebsite not found");

  private String value;

  NotFoundErrorType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static NotFoundErrorType fromValue(String text) {
    for (NotFoundErrorType b : NotFoundErrorType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}
