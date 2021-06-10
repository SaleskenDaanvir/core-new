package io.swagger.model;

import io.swagger.model.ErrorType;
import io.swagger.model.NotFoundErrorType;
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

public class NotFoundException   {
  
  @Schema(example = "405", required = true, description = "")
  private Integer responseCode = null;
  
  @Schema(required = true, description = "")
  private String errorCode = null;
  
  @Schema(required = true, description = "")
  private NotFoundErrorType responseMessage = null;
  
  @Schema(required = true, description = "")
  private ErrorType responseType = null;
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

  public NotFoundException responseCode(Integer responseCode) {
    this.responseCode = responseCode;
    return this;
  }

 /**
   * Get errorCode
   * @return errorCode
  **/
  @JsonProperty("errorCode")
  @NotNull
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public NotFoundException errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

 /**
   * Get responseMessage
   * @return responseMessage
  **/
  @JsonProperty("responseMessage")
  @NotNull
  public NotFoundErrorType getResponseMessage() {
    return responseMessage;
  }

  public void setResponseMessage(NotFoundErrorType responseMessage) {
    this.responseMessage = responseMessage;
  }

  public NotFoundException responseMessage(NotFoundErrorType responseMessage) {
    this.responseMessage = responseMessage;
    return this;
  }

 /**
   * Get responseType
   * @return responseType
  **/
  @JsonProperty("responseType")
  @NotNull
  public ErrorType getResponseType() {
    return responseType;
  }

  public void setResponseType(ErrorType responseType) {
    this.responseType = responseType;
  }

  public NotFoundException responseType(ErrorType responseType) {
    this.responseType = responseType;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotFoundException {\n");
    
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
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
