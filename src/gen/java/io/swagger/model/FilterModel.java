package io.swagger.model;

import io.swagger.model.DatatableOrder;
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

public class FilterModel   {
  
  @Schema(description = "")
  private Integer id = null;
  
  @Schema(example = "1", description = "")
  private Integer limit = null;
  
  @Schema(example = "0", description = "")
  private Integer offset = null;
  
  @Schema(description = "")
  private List<DatatableOrder> order = null;
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

  public FilterModel order(List<DatatableOrder> order) {
    this.order = order;
    return this;
  }

  public FilterModel addOrderItem(DatatableOrder orderItem) {
    this.order.add(orderItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilterModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
