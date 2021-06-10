package io.swagger.model;

import java.util.ArrayList;
import java.util.List;
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

public class DatatableSearchResults   {
  
  @Schema(description = "")
  private List<Object> data = null;
  
  @Schema(description = "")
  private Integer draw = null;
  
  @Schema(description = "")
  private Integer recordsFiltered = null;
  
  @Schema(description = "")
  private Integer recordsTotal = null;
 /**
   * Get data
   * @return data
  **/
  @JsonProperty("data")
  public List<Object> getData() {
    return data;
  }

  public void setData(List<Object> data) {
    this.data = data;
  }

  public DatatableSearchResults data(List<Object> data) {
    this.data = data;
    return this;
  }

  public DatatableSearchResults addDataItem(Object dataItem) {
    this.data.add(dataItem);
    return this;
  }

 /**
   * Get draw
   * @return draw
  **/
  @JsonProperty("draw")
  public Integer getDraw() {
    return draw;
  }

  public void setDraw(Integer draw) {
    this.draw = draw;
  }

  public DatatableSearchResults draw(Integer draw) {
    this.draw = draw;
    return this;
  }

 /**
   * Get recordsFiltered
   * @return recordsFiltered
  **/
  @JsonProperty("recordsFiltered")
  public Integer getRecordsFiltered() {
    return recordsFiltered;
  }

  public void setRecordsFiltered(Integer recordsFiltered) {
    this.recordsFiltered = recordsFiltered;
  }

  public DatatableSearchResults recordsFiltered(Integer recordsFiltered) {
    this.recordsFiltered = recordsFiltered;
    return this;
  }

 /**
   * Get recordsTotal
   * @return recordsTotal
  **/
  @JsonProperty("recordsTotal")
  public Integer getRecordsTotal() {
    return recordsTotal;
  }

  public void setRecordsTotal(Integer recordsTotal) {
    this.recordsTotal = recordsTotal;
  }

  public DatatableSearchResults recordsTotal(Integer recordsTotal) {
    this.recordsTotal = recordsTotal;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatatableSearchResults {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    draw: ").append(toIndentedString(draw)).append("\n");
    sb.append("    recordsFiltered: ").append(toIndentedString(recordsFiltered)).append("\n");
    sb.append("    recordsTotal: ").append(toIndentedString(recordsTotal)).append("\n");
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
