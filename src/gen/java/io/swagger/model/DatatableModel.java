package io.swagger.model;

import io.swagger.model.DatatableColumn;
import io.swagger.model.DatatableOrder;
import io.swagger.model.DatatableSearch;
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

public class DatatableModel   {
  
  @Schema(required = true, description = "")
  private Integer draw = 1;
  
  @Schema(required = true, description = "")
  private Integer start = 0;
  
  @Schema(required = true, description = "")
  private Integer length = 1;
  
  @Schema(description = "")
  private DatatableSearch search = null;
  
  @Schema(description = "")
  private List<DatatableColumn> columns = null;
  
  @Schema(description = "")
  private List<DatatableOrder> order = null;
 /**
   * Get draw
   * minimum: 1
   * maximum: 2147483647
   * @return draw
  **/
  @JsonProperty("draw")
  @NotNull
 @Min(1) @Max(2147483647)  public Integer getDraw() {
    return draw;
  }

  public void setDraw(Integer draw) {
    this.draw = draw;
  }

  public DatatableModel draw(Integer draw) {
    this.draw = draw;
    return this;
  }

 /**
   * Get start
   * minimum: 0
   * maximum: 2147483647
   * @return start
  **/
  @JsonProperty("start")
  @NotNull
 @Min(0) @Max(2147483647)  public Integer getStart() {
    return start;
  }

  public void setStart(Integer start) {
    this.start = start;
  }

  public DatatableModel start(Integer start) {
    this.start = start;
    return this;
  }

 /**
   * Get length
   * minimum: -1
   * maximum: 2147483647
   * @return length
  **/
  @JsonProperty("length")
  @NotNull
 @Min(-1) @Max(2147483647)  public Integer getLength() {
    return length;
  }

  public void setLength(Integer length) {
    this.length = length;
  }

  public DatatableModel length(Integer length) {
    this.length = length;
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

  public DatatableModel search(DatatableSearch search) {
    this.search = search;
    return this;
  }

 /**
   * Get columns
   * @return columns
  **/
  @JsonProperty("columns")
  public List<DatatableColumn> getColumns() {
    return columns;
  }

  public void setColumns(List<DatatableColumn> columns) {
    this.columns = columns;
  }

  public DatatableModel columns(List<DatatableColumn> columns) {
    this.columns = columns;
    return this;
  }

  public DatatableModel addColumnsItem(DatatableColumn columnsItem) {
    this.columns.add(columnsItem);
    return this;
  }

 /**
   * Get order
   * @return order
  **/
  @JsonProperty("order")
  public List<DatatableOrder> getOrder() {
    return order;
  }

  public void setOrder(List<DatatableOrder> order) {
    this.order = order;
  }

  public DatatableModel order(List<DatatableOrder> order) {
    this.order = order;
    return this;
  }

  public DatatableModel addOrderItem(DatatableOrder orderItem) {
    this.order.add(orderItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatatableModel {\n");
    
    sb.append("    draw: ").append(toIndentedString(draw)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    search: ").append(toIndentedString(search)).append("\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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
