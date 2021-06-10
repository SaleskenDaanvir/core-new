package io.swagger.model;

import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets BadRequestErrorType
 */
public enum BadRequestErrorType {
  ORGID_IS_INVALID("OrgId is invalid"),
  
  USERID_IS_INVALID("UserId is Invalid"),
  
  ORGNAME_IS_INVALID("OrgName is Invalid"),
  
  ORGDESCRIPTION_IS_INVALID("OrgDescription is Invalid"),
  
  ORGPROFILE_IS_INVALID("OrgProfile is Invalid"),
  
  ORGWEBSITE_IS_INVALID("OrgWebsite is Invalid"),
  
  ORGCONTACTNAME_IS_INVALID("OrgContactName is Invalid"),
  
  ORGCONTACTEMAIL_IS_INVALID("OrgContactEmail is Invalid"),
  
  ORGCONTACTPHONE_IS_INVALID("OrgContactPhone is Invalid"),
  
  ADDRESS_LINE_1_IS_INVALID("Address Line 1 is Invalid"),
  
  ADDRESS_LINE_2_IS_INVALID("Address Line 2 is Invalid"),
  
  LANDMARK_IS_INVALID("Landmark is Invalid"),
  
  CITY_IS_INVALID("City is Invalid"),
  
  STATE_ID_INVALID("State id Invalid"),
  
  COUNTRY_IS_INVALID("Country is Invalid");

  private String value;

  BadRequestErrorType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static BadRequestErrorType fromValue(String text) {
    for (BadRequestErrorType b : BadRequestErrorType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}
