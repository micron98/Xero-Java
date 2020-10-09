/*
 * Xero Assets API
 * This is the Xero Assets API
 *
 * The version of the OpenAPI document: 2.3.3
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.assets;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Error */
public class Error {
  StringUtil util = new StringUtil();

  @JsonProperty("resourceValidationErrors")
  private List<ResourceValidationErrorsElement> resourceValidationErrors =
      new ArrayList<ResourceValidationErrorsElement>();

  @JsonProperty("fieldValidationErrors")
  private List<FieldValidationErrorsElement> fieldValidationErrors =
      new ArrayList<FieldValidationErrorsElement>();

  @JsonProperty("type")
  private String type;

  @JsonProperty("title")
  private String title;

  @JsonProperty("detail")
  private String detail;

  public Error resourceValidationErrors(
      List<ResourceValidationErrorsElement> resourceValidationErrors) {
    this.resourceValidationErrors = resourceValidationErrors;
    return this;
  }

  public Error addResourceValidationErrorsItem(
      ResourceValidationErrorsElement resourceValidationErrorsItem) {
    if (this.resourceValidationErrors == null) {
      this.resourceValidationErrors = new ArrayList<ResourceValidationErrorsElement>();
    }
    this.resourceValidationErrors.add(resourceValidationErrorsItem);
    return this;
  }

  /**
   * Array of elements of resource validation errors
   *
   * @return resourceValidationErrors
   */
  @ApiModelProperty(value = "Array of elements of resource validation errors")
  public List<ResourceValidationErrorsElement> getResourceValidationErrors() {
    return resourceValidationErrors;
  }

  public void setResourceValidationErrors(
      List<ResourceValidationErrorsElement> resourceValidationErrors) {
    this.resourceValidationErrors = resourceValidationErrors;
  }

  public Error fieldValidationErrors(List<FieldValidationErrorsElement> fieldValidationErrors) {
    this.fieldValidationErrors = fieldValidationErrors;
    return this;
  }

  public Error addFieldValidationErrorsItem(
      FieldValidationErrorsElement fieldValidationErrorsItem) {
    if (this.fieldValidationErrors == null) {
      this.fieldValidationErrors = new ArrayList<FieldValidationErrorsElement>();
    }
    this.fieldValidationErrors.add(fieldValidationErrorsItem);
    return this;
  }

  /**
   * Array of elements of field validation errors
   *
   * @return fieldValidationErrors
   */
  @ApiModelProperty(value = "Array of elements of field validation errors")
  public List<FieldValidationErrorsElement> getFieldValidationErrors() {
    return fieldValidationErrors;
  }

  public void setFieldValidationErrors(List<FieldValidationErrorsElement> fieldValidationErrors) {
    this.fieldValidationErrors = fieldValidationErrors;
  }

  public Error type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The internal type of error, not accessible externally
   *
   * @return type
   */
  @ApiModelProperty(value = "The internal type of error, not accessible externally")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Error title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Title of the error
   *
   * @return title
   */
  @ApiModelProperty(value = "Title of the error")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Error detail(String detail) {
    this.detail = detail;
    return this;
  }

  /**
   * Detail of the error
   *
   * @return detail
   */
  @ApiModelProperty(value = "Detail of the error")
  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.resourceValidationErrors, error.resourceValidationErrors)
        && Objects.equals(this.fieldValidationErrors, error.fieldValidationErrors)
        && Objects.equals(this.type, error.type)
        && Objects.equals(this.title, error.title)
        && Objects.equals(this.detail, error.detail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceValidationErrors, fieldValidationErrors, type, title, detail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    sb.append("    resourceValidationErrors: ")
        .append(toIndentedString(resourceValidationErrors))
        .append("\n");
    sb.append("    fieldValidationErrors: ")
        .append(toIndentedString(fieldValidationErrors))
        .append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
