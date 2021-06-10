package io.swagger.model;

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

public class OrganizationBilling   {
  
  @Schema(description = "")
  private Integer id = null;
  
  @Schema(description = "")
  private Integer organziationId = null;
  
  @Schema(description = "")
  private Integer userId = null;
  
  @Schema(description = "")
  private Integer billingCost = null;
  
  @Schema(description = "")
  private Integer billingMonth = null;
  
  @Schema(description = "")
  private Integer overageMinutes = null;
  
  @Schema(description = "")
  private Integer activeUsers = null;
  
  @Schema(description = "")
  private Integer internationalMinutes = null;
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

  public OrganizationBilling id(Integer id) {
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

  public OrganizationBilling organziationId(Integer organziationId) {
    this.organziationId = organziationId;
    return this;
  }

 /**
   * Get userId
   * @return userId
  **/
  @JsonProperty("userId")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public OrganizationBilling userId(Integer userId) {
    this.userId = userId;
    return this;
  }

 /**
   * Get billingCost
   * @return billingCost
  **/
  @JsonProperty("billingCost")
  public Integer getBillingCost() {
    return billingCost;
  }

  public void setBillingCost(Integer billingCost) {
    this.billingCost = billingCost;
  }

  public OrganizationBilling billingCost(Integer billingCost) {
    this.billingCost = billingCost;
    return this;
  }

 /**
   * Get billingMonth
   * @return billingMonth
  **/
  @JsonProperty("billingMonth")
  public Integer getBillingMonth() {
    return billingMonth;
  }

  public void setBillingMonth(Integer billingMonth) {
    this.billingMonth = billingMonth;
  }

  public OrganizationBilling billingMonth(Integer billingMonth) {
    this.billingMonth = billingMonth;
    return this;
  }

 /**
   * Get overageMinutes
   * @return overageMinutes
  **/
  @JsonProperty("overageMinutes")
  public Integer getOverageMinutes() {
    return overageMinutes;
  }

  public void setOverageMinutes(Integer overageMinutes) {
    this.overageMinutes = overageMinutes;
  }

  public OrganizationBilling overageMinutes(Integer overageMinutes) {
    this.overageMinutes = overageMinutes;
    return this;
  }

 /**
   * Get activeUsers
   * @return activeUsers
  **/
  @JsonProperty("activeUsers")
  public Integer getActiveUsers() {
    return activeUsers;
  }

  public void setActiveUsers(Integer activeUsers) {
    this.activeUsers = activeUsers;
  }

  public OrganizationBilling activeUsers(Integer activeUsers) {
    this.activeUsers = activeUsers;
    return this;
  }

 /**
   * Get internationalMinutes
   * @return internationalMinutes
  **/
  @JsonProperty("internationalMinutes")
  public Integer getInternationalMinutes() {
    return internationalMinutes;
  }

  public void setInternationalMinutes(Integer internationalMinutes) {
    this.internationalMinutes = internationalMinutes;
  }

  public OrganizationBilling internationalMinutes(Integer internationalMinutes) {
    this.internationalMinutes = internationalMinutes;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationBilling {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    organziationId: ").append(toIndentedString(organziationId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    billingCost: ").append(toIndentedString(billingCost)).append("\n");
    sb.append("    billingMonth: ").append(toIndentedString(billingMonth)).append("\n");
    sb.append("    overageMinutes: ").append(toIndentedString(overageMinutes)).append("\n");
    sb.append("    activeUsers: ").append(toIndentedString(activeUsers)).append("\n");
    sb.append("    internationalMinutes: ").append(toIndentedString(internationalMinutes)).append("\n");
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
