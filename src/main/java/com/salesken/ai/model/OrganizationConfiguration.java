package com.salesken.ai.model;

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

public class OrganizationConfiguration   {
  
  @Schema(description = "")
  private Integer id = null;
  
  @Schema(description = "")
  private Integer organziationId = null;
  
  @Schema(description = "")
  private String propertyName = null;
  
  @Schema(description = "")
  private String propertyValue = null;
  
  @Schema(description = "")
  private String propertyDataType = null;
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public OrganizationConfiguration id(Integer id) {
    this.id = id;
    return this;
  }

 /**
   * Get organziationId
   * @return organziationId
  **/
  @JsonProperty("organziationId")
  public Integer getOrganziationId() {
    return organziationId;
  }

  public void setOrganziationId(Integer organziationId) {
    this.organziationId = organziationId;
  }

  public OrganizationConfiguration organziationId(Integer organziationId) {
    this.organziationId = organziationId;
    return this;
  }

 /**
   * Get propertyName
   * @return propertyName
  **/
  @JsonProperty("propertyName")
  public String getPropertyName() {
    return propertyName;
  }

  public void setPropertyName(String propertyName) {
    this.propertyName = propertyName;
  }

  public OrganizationConfiguration propertyName(String propertyName) {
    this.propertyName = propertyName;
    return this;
  }

 /**
   * Get propertyValue
   * @return propertyValue
  **/
  @JsonProperty("propertyValue")
  public String getPropertyValue() {
    return propertyValue;
  }

  public void setPropertyValue(String propertyValue) {
    this.propertyValue = propertyValue;
  }

  public OrganizationConfiguration propertyValue(String propertyValue) {
    this.propertyValue = propertyValue;
    return this;
  }

 /**
   * Get propertyDataType
   * @return propertyDataType
  **/
  @JsonProperty("propertyDataType")
  public String getPropertyDataType() {
    return propertyDataType;
  }

  public void setPropertyDataType(String propertyDataType) {
    this.propertyDataType = propertyDataType;
  }

  public OrganizationConfiguration propertyDataType(String propertyDataType) {
    this.propertyDataType = propertyDataType;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationConfiguration {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    organziationId: ").append(toIndentedString(organziationId)).append("\n");
    sb.append("    propertyName: ").append(toIndentedString(propertyName)).append("\n");
    sb.append("    propertyValue: ").append(toIndentedString(propertyValue)).append("\n");
    sb.append("    propertyDataType: ").append(toIndentedString(propertyDataType)).append("\n");
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
