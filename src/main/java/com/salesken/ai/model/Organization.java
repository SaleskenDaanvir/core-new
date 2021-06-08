package com.salesken.ai.model;


import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

public class Organization   {
  
  @Schema(description = "")
  private Long id = null;
  
  @Schema(example = "Abc", required = true, description = "")
  private String name = null;
  
  @Schema(example = "This is the description for the Abc organization", description = "")
  private String description = null;
  
  @Schema(description = "")
  private OrganizationProfiles profile = null;
  
  @Schema(example = "https://www.example.com/", required = true, description = "")
  private String website = null;
  
  @Schema(example = "Xyz", description = "")
  private String contactName = null;
  
  @Schema(example = "xyz@abc.com", description = "")
  private String contactEmail = null;
  
  @Schema(example = "919999999999", description = "")
  private String contactPhone = null;
  
  @Schema(description = "")
  private Address address = null;
 /**
   * Get id
   * minimum: 1
   * @return id
  **/
  @JsonProperty("id")
 @Min(1L)  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Organization id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  @NotNull
 @Pattern(regexp="^[A-Za-z0-9]*[A-Za-z0-9][A-Za-z0-9]*$") @Size(min=3)  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Organization name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get description
   * @return description
  **/
  @JsonProperty("description")
 @Size(min=3,max=250)  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Organization description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get profile
   * @return profile
  **/
  @JsonProperty("profile")
  public OrganizationProfiles getProfile() {
    return profile;
  }

  public void setProfile(OrganizationProfiles profile) {
    this.profile = profile;
  }

  public Organization profile(OrganizationProfiles profile) {
    this.profile = profile;
    return this;
  }

 /**
   * Get website
   * @return website
  **/
  @JsonProperty("website")
  @NotNull
 @Pattern(regexp="^(https?://)?(www.)?[a-z0-9]+\\.[a-z]+(/[a-zA-Z0-9#]+/?)*$")  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }

  public Organization website(String website) {
    this.website = website;
    return this;
  }

 /**
   * Get contactName
   * @return contactName
  **/
  @JsonProperty("contactName")
 @Pattern(regexp="^[A-Za-z0-9]*[A-Za-z0-9][A-Za-z0-9]*$") @Size(min=3,max=46)  public String getContactName() {
    return contactName;
  }

  public void setContactName(String contactName) {
    this.contactName = contactName;
  }

  public Organization contactName(String contactName) {
    this.contactName = contactName;
    return this;
  }

 /**
   * Get contactEmail
   * @return contactEmail
  **/
  @JsonProperty("contactEmail")
 @Pattern(regexp="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$") @Size(max=254)  public String getContactEmail() {
    return contactEmail;
  }

  public void setContactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
  }

  public Organization contactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
    return this;
  }

 /**
   * Get contactPhone
   * @return contactPhone
  **/
  @JsonProperty("contactPhone")
  public String getContactPhone() {
    return contactPhone;
  }

  public void setContactPhone(String contactPhone) {
    this.contactPhone = contactPhone;
  }

  public Organization contactPhone(String contactPhone) {
    this.contactPhone = contactPhone;
    return this;
  }

 /**
   * Get address
   * @return address
  **/
  @JsonProperty("address")
  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public Organization address(Address address) {
    this.address = address;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Organization {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    contactName: ").append(toIndentedString(contactName)).append("\n");
    sb.append("    contactEmail: ").append(toIndentedString(contactEmail)).append("\n");
    sb.append("    contactPhone: ").append(toIndentedString(contactPhone)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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
