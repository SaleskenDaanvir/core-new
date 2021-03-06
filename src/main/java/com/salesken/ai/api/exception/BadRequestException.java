package com.salesken.ai.api.exception;

import javax.validation.constraints.*;

import io.swagger.v3.oas.annotations.media.Schema;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonCreator;

public class BadRequestException   {
  
  @Schema(example = "400", required = true, description = "")
  private Integer responseCode = null;
  
  @Schema(example = "Either Nullability / Bad request", required = true, description = "")
  private String responseMessage = null;
  public enum ResponseTypeEnum {
    EITHER_NULLABILITY("Either Nullability"),
    BAD_REQUEST("Bad request");

    private String value;

    ResponseTypeEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static ResponseTypeEnum fromValue(String text) {
      for (ResponseTypeEnum b : ResponseTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }  
  @Schema(description = "")
  private ResponseTypeEnum responseType = null;
 /**
   * Get responseCode
   * @return responseCode
  **/
  @JsonProperty("responseCode")
  @NotNull
  public Integer getResponseCode() {
    return responseCode;
  }

  public void setResponseCode(Integer responseCode) {
    this.responseCode = responseCode;
  }

  public BadRequestException responseCode(Integer responseCode) {
    this.responseCode = responseCode;
    return this;
  }

 /**
   * Get responseMessage
   * @return responseMessage
  **/
  @JsonProperty("responseMessage")
  @NotNull
  public String getResponseMessage() {
    return responseMessage;
  }

  public void setResponseMessage(String responseMessage) {
    this.responseMessage = responseMessage;
  }

  public BadRequestException responseMessage(String responseMessage) {
    this.responseMessage = responseMessage;
    return this;
  }

 /**
   * Get responseType
   * @return responseType
  **/
  @JsonProperty("responseType")
  public String getResponseType() {
    if (responseType == null) {
      return null;
    }
    return responseType.getValue();
  }

  public void setResponseType(ResponseTypeEnum responseType) {
    this.responseType = responseType;
  }

  public BadRequestException responseType(ResponseTypeEnum responseType) {
    this.responseType = responseType;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BadRequestException {\n");
    
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    responseMessage: ").append(toIndentedString(responseMessage)).append("\n");
    sb.append("    responseType: ").append(toIndentedString(responseType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
