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

public class Address   {
  
  @Schema(example = "This is address line 1 of the organization.", description = "")
  private String addressLine1 = null;
  
  @Schema(example = "This is address line 2 of the organization.", description = "")
  private String addressLine2 = null;
  
  @Schema(example = "Near XYZ", description = "")
  private String landmark = null;
  
  @Schema(example = "560008", description = "")
  private Integer pincode = null;
  
  @Schema(example = "Bengaluru", description = "")
  private String city = null;
  
  @Schema(example = "Karnataka", description = "")
  private String state = null;
  
  @Schema(example = "India", description = "")
  private String country = null;
 /**
   * Get addressLine1
   * @return addressLine1
  **/
  @JsonProperty("addressLine1")
 @Pattern(regexp="^[#.0-9a-zA-Z\\s,-]+$")  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public Address addressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

 /**
   * Get addressLine2
   * @return addressLine2
  **/
  @JsonProperty("addressLine2")
 @Pattern(regexp="^[#.0-9a-zA-Z\\s,-]+$")  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public Address addressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }

 /**
   * Get landmark
   * @return landmark
  **/
  @JsonProperty("landmark")
 @Pattern(regexp="^[#.0-9a-zA-Z\\s,-]+$")  public String getLandmark() {
    return landmark;
  }

  public void setLandmark(String landmark) {
    this.landmark = landmark;
  }

  public Address landmark(String landmark) {
    this.landmark = landmark;
    return this;
  }

 /**
   * Get pincode
   * minimum: 10
   * maximum: 9999999999
   * @return pincode
  **/
  @JsonProperty("pincode")
 @Min(10) @Max(9999999999)  public Integer getPincode() {
    return pincode;
  }

  public void setPincode(Integer pincode) {
    this.pincode = pincode;
  }

  public Address pincode(Integer pincode) {
    this.pincode = pincode;
    return this;
  }

 /**
   * Get city
   * @return city
  **/
  @JsonProperty("city")
 @Pattern(regexp="^[0-9a-zA-Z]+$")  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Address city(String city) {
    this.city = city;
    return this;
  }

 /**
   * Get state
   * @return state
  **/
  @JsonProperty("state")
 @Pattern(regexp="^[0-9a-zA-Z]+$")  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Address state(String state) {
    this.state = state;
    return this;
  }

 /**
   * Get country
   * @return country
  **/
  @JsonProperty("country")
 @Pattern(regexp="^[0-9a-zA-Z]+$")  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Address country(String country) {
    this.country = country;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    landmark: ").append(toIndentedString(landmark)).append("\n");
    sb.append("    pincode: ").append(toIndentedString(pincode)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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
