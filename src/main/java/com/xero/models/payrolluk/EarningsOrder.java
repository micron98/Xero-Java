/*
 * Xero Payroll UK
 * This is the Xero Payroll API for orgs in the UK region.
 *
 * The version of the OpenAPI document: 2.8.2
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.payrolluk;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import java.util.UUID;

/** EarningsOrder */
public class EarningsOrder {
  StringUtil util = new StringUtil();

  @JsonProperty("id")
  private UUID id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("statutoryDeductionCategory")
  private StatutoryDeductionCategory statutoryDeductionCategory;

  @JsonProperty("liabilityAccountId")
  private UUID liabilityAccountId;

  @JsonProperty("currentRecord")
  private Boolean currentRecord = true;

  public EarningsOrder id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Xero unique identifier for an earning rate
   *
   * @return id
   */
  @ApiModelProperty(value = "Xero unique identifier for an earning rate")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public EarningsOrder name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the earning order
   *
   * @return name
   */
  @ApiModelProperty(required = true, value = "Name of the earning order")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EarningsOrder statutoryDeductionCategory(
      StatutoryDeductionCategory statutoryDeductionCategory) {
    this.statutoryDeductionCategory = statutoryDeductionCategory;
    return this;
  }

  /**
   * Get statutoryDeductionCategory
   *
   * @return statutoryDeductionCategory
   */
  @ApiModelProperty(value = "")
  public StatutoryDeductionCategory getStatutoryDeductionCategory() {
    return statutoryDeductionCategory;
  }

  public void setStatutoryDeductionCategory(StatutoryDeductionCategory statutoryDeductionCategory) {
    this.statutoryDeductionCategory = statutoryDeductionCategory;
  }

  public EarningsOrder liabilityAccountId(UUID liabilityAccountId) {
    this.liabilityAccountId = liabilityAccountId;
    return this;
  }

  /**
   * Xero identifier for Liability Account
   *
   * @return liabilityAccountId
   */
  @ApiModelProperty(value = "Xero identifier for Liability Account")
  public UUID getLiabilityAccountId() {
    return liabilityAccountId;
  }

  public void setLiabilityAccountId(UUID liabilityAccountId) {
    this.liabilityAccountId = liabilityAccountId;
  }

  public EarningsOrder currentRecord(Boolean currentRecord) {
    this.currentRecord = currentRecord;
    return this;
  }

  /**
   * Identifier of a record is active or not.
   *
   * @return currentRecord
   */
  @ApiModelProperty(value = "Identifier of a record is active or not.")
  public Boolean getCurrentRecord() {
    return currentRecord;
  }

  public void setCurrentRecord(Boolean currentRecord) {
    this.currentRecord = currentRecord;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EarningsOrder earningsOrder = (EarningsOrder) o;
    return Objects.equals(this.id, earningsOrder.id)
        && Objects.equals(this.name, earningsOrder.name)
        && Objects.equals(this.statutoryDeductionCategory, earningsOrder.statutoryDeductionCategory)
        && Objects.equals(this.liabilityAccountId, earningsOrder.liabilityAccountId)
        && Objects.equals(this.currentRecord, earningsOrder.currentRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, statutoryDeductionCategory, liabilityAccountId, currentRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EarningsOrder {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    statutoryDeductionCategory: ")
        .append(toIndentedString(statutoryDeductionCategory))
        .append("\n");
    sb.append("    liabilityAccountId: ").append(toIndentedString(liabilityAccountId)).append("\n");
    sb.append("    currentRecord: ").append(toIndentedString(currentRecord)).append("\n");
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
