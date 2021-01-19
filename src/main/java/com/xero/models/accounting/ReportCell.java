/*
 * Accounting API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.8.2
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.accounting;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** ReportCell */
public class ReportCell {
  StringUtil util = new StringUtil();

  @JsonProperty("Value")
  private String value;

  @JsonProperty("Attributes")
  private List<ReportAttribute> attributes = new ArrayList<ReportAttribute>();

  public ReportCell value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   *
   * @return value
   */
  @ApiModelProperty(value = "")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public ReportCell attributes(List<ReportAttribute> attributes) {
    this.attributes = attributes;
    return this;
  }

  public ReportCell addAttributesItem(ReportAttribute attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<ReportAttribute>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

  /**
   * Get attributes
   *
   * @return attributes
   */
  @ApiModelProperty(value = "")
  public List<ReportAttribute> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<ReportAttribute> attributes) {
    this.attributes = attributes;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportCell reportCell = (ReportCell) o;
    return Objects.equals(this.value, reportCell.value)
        && Objects.equals(this.attributes, reportCell.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportCell {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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
