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

public class UpdateUser   {
  
  @Schema(required = true, description = "")
  private Long id = null;
  
  @Schema(example = "Abc", description = "")
  private String name = null;
  
  @Schema(example = "xyz@abc.com", description = "")
  private String email = null;
  
  @Schema(example = "919999999999", description = "")
  private String phone = null;
  
  @Schema(description = "")
  private String password = null;
  
  @Schema(description = "")
  private String designation = null;
  
  @Schema(description = "")
  private String imageURL = null;
  
  @Schema(description = "")
  private Long managerId = null;
  
  @Schema(description = "")
  private Integer role = null;
 /**
   * Get id
   * minimum: 1
   * @return id
  **/
  @JsonProperty("id")
  @NotNull
 @Min(1L)  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public UpdateUser id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
 @Pattern(regexp="^[A-Za-z0-9]*[A-Za-z0-9][A-Za-z0-9]*$") @Size(min=3)  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UpdateUser name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get email
   * @return email
  **/
  @JsonProperty("email")
 @Pattern(regexp="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$") @Size(max=254)  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UpdateUser email(String email) {
    this.email = email;
    return this;
  }

 /**
   * Get phone
   * @return phone
  **/
  @JsonProperty("phone")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public UpdateUser phone(String phone) {
    this.phone = phone;
    return this;
  }

 /**
   * Get password
   * @return password
  **/
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public UpdateUser password(String password) {
    this.password = password;
    return this;
  }

 /**
   * Get designation
   * @return designation
  **/
  @JsonProperty("designation")
  public String getDesignation() {
    return designation;
  }

  public void setDesignation(String designation) {
    this.designation = designation;
  }

  public UpdateUser designation(String designation) {
    this.designation = designation;
    return this;
  }

 /**
   * Get imageURL
   * @return imageURL
  **/
  @JsonProperty("imageURL")
  public String getImageURL() {
    return imageURL;
  }

  public void setImageURL(String imageURL) {
    this.imageURL = imageURL;
  }

  public UpdateUser imageURL(String imageURL) {
    this.imageURL = imageURL;
    return this;
  }

 /**
   * Get managerId
   * @return managerId
  **/
  @JsonProperty("managerId")
  public Long getManagerId() {
    return managerId;
  }

  public void setManagerId(Long managerId) {
    this.managerId = managerId;
  }

  public UpdateUser managerId(Long managerId) {
    this.managerId = managerId;
    return this;
  }

 /**
   * Get role
   * @return role
  **/
  @JsonProperty("role")
  public Integer getRole() {
    return role;
  }

  public void setRole(Integer role) {
    this.role = role;
  }

  public UpdateUser role(Integer role) {
    this.role = role;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateUser {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    designation: ").append(toIndentedString(designation)).append("\n");
    sb.append("    imageURL: ").append(toIndentedString(imageURL)).append("\n");
    sb.append("    managerId: ").append(toIndentedString(managerId)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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
