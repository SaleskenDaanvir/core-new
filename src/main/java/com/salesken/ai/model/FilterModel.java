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

public class FilterModel   {
  
  @Schema(description = "")
  private Integer id = null;
  
  @Schema(example = "ABC", description = "")
  private String name = null;
  
  @Schema(example = "1", description = "")
  private Integer limit = null;
  
  @Schema(example = "1", description = "")
  private Integer offset = null;
 /**
   * Get id
   * minimum: 1
   * @return id
  **/
  @JsonProperty("id")
 @Min(1)  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public FilterModel id(Integer id) {
    this.id = id;
    return this;
  }

 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FilterModel name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get limit
   * minimum: 1
   * maximum: 2147483647
   * @return limit
  **/
  @JsonProperty("limit")
 @Min(1) @Max(2147483647)  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public FilterModel limit(Integer limit) {
    this.limit = limit;
    return this;
  }

 /**
   * Get offset
   * minimum: 0
   * maximum: 2147483647
   * @return offset
  **/
  @JsonProperty("offset")
 @Min(0) @Max(2147483647)  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public FilterModel offset(Integer offset) {
    this.offset = offset;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilterModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
