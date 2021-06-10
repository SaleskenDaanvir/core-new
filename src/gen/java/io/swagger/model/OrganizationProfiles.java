package io.swagger.model;

import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets OrganizationProfiles
 */
public enum OrganizationProfiles {
  SOFTWARE("Software"),
  
  IT("IT");

  private String value;

  OrganizationProfiles(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OrganizationProfiles fromValue(String text) {
    for (OrganizationProfiles b : OrganizationProfiles.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}
