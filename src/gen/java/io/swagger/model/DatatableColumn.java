package io.swagger.model;

import io.swagger.model.DatatableSearch;
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

public class DatatableColumn   {
  
  @Schema(description = "")
  private String data = null;
  
  @Schema(description = "")
  private String name = null;
  
  @Schema(description = "")
  private Boolean searchable = null;
  
  @Schema(description = "")
  private Boolean orderable = null;
  
  @Schema(description = "")
  private DatatableSearch search = null;
 /**
   * Get data
   * @return data
  **/
  @JsonProperty("data")
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public DatatableColumn data(String data) {
    this.data = data;
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

  public DatatableColumn name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get searchable
   * @return searchable
  **/
  @JsonProperty("searchable")
  public Boolean isSearchable() {
    return searchable;
  }

  public void setSearchable(Boolean searchable) {
    this.searchable = searchable;
  }

  public DatatableColumn searchable(Boolean searchable) {
    this.searchable = searchable;
    return this;
  }

 /**
   * Get orderable
   * @return orderable
  **/
  @JsonProperty("orderable")
  public Boolean isOrderable() {
    return orderable;
  }

  public void setOrderable(Boolean orderable) {
    this.orderable = orderable;
  }

  public DatatableColumn orderable(Boolean orderable) {
    this.orderable = orderable;
    return this;
  }

 /**
   * Get search
   * @return search
  **/
  @JsonProperty("search")
  public DatatableSearch getSearch() {
    return search;
  }

  public void setSearch(DatatableSearch search) {
    this.search = search;
  }

  public DatatableColumn search(DatatableSearch search) {
    this.search = search;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatatableColumn {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    searchable: ").append(toIndentedString(searchable)).append("\n");
    sb.append("    orderable: ").append(toIndentedString(orderable)).append("\n");
    sb.append("    search: ").append(toIndentedString(search)).append("\n");
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
