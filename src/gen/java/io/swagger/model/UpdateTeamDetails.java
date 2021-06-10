package io.swagger.model;

import io.swagger.model.Team;
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

public class UpdateTeamDetails   {
  
  @Schema(example = "200", required = true, description = "")
  private Integer responseCode = null;
  
  @Schema(example = "Successfully updated team", required = true, description = "")
  private String responseMessage = null;
  
  @Schema(required = true, description = "")
  private Team response = null;
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

  public UpdateTeamDetails responseCode(Integer responseCode) {
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

  public UpdateTeamDetails responseMessage(String responseMessage) {
    this.responseMessage = responseMessage;
    return this;
  }

 /**
   * Get response
   * @return response
  **/
  @JsonProperty("response")
  @NotNull
  public Team getResponse() {
    return response;
  }

  public void setResponse(Team response) {
    this.response = response;
  }

  public UpdateTeamDetails response(Team response) {
    this.response = response;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateTeamDetails {\n");
    
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    responseMessage: ").append(toIndentedString(responseMessage)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
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
