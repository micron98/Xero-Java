/*
 * Xero Payroll AU
 * This is the Xero Payroll API for orgs in Australia region.
 *
 * The version of the OpenAPI document: 2.2.13
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.payrollau;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import java.util.UUID;

/** DeductionLine */
public class DeductionLine {
  StringUtil util = new StringUtil();

  @JsonProperty("DeductionTypeID")
  private UUID deductionTypeID;

  @JsonProperty("CalculationType")
  private DeductionTypeCalculationType calculationType;

  @JsonProperty("Amount")
  private Double amount;

  @JsonProperty("Percentage")
  private Double percentage;

  @JsonProperty("NumberOfUnits")
  private Double numberOfUnits;

  public DeductionLine deductionTypeID(UUID deductionTypeID) {
    this.deductionTypeID = deductionTypeID;
    return this;
  }

  /**
   * Xero deduction type identifier
   *
   * @return deductionTypeID
   */
  @ApiModelProperty(
      example = "59cd9d04-4521-4cc3-93ac-7841651ff407",
      required = true,
      value = "Xero deduction type identifier")
  public UUID getDeductionTypeID() {
    return deductionTypeID;
  }

  public void setDeductionTypeID(UUID deductionTypeID) {
    this.deductionTypeID = deductionTypeID;
  }

  public DeductionLine calculationType(DeductionTypeCalculationType calculationType) {
    this.calculationType = calculationType;
    return this;
  }

  /**
   * Get calculationType
   *
   * @return calculationType
   */
  @ApiModelProperty(required = true, value = "")
  public DeductionTypeCalculationType getCalculationType() {
    return calculationType;
  }

  public void setCalculationType(DeductionTypeCalculationType calculationType) {
    this.calculationType = calculationType;
  }

  public DeductionLine amount(Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Deduction type amount
   *
   * @return amount
   */
  @ApiModelProperty(example = "10.0", value = "Deduction type amount")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public DeductionLine percentage(Double percentage) {
    this.percentage = percentage;
    return this;
  }

  /**
   * The Percentage of the Deduction
   *
   * @return percentage
   */
  @ApiModelProperty(example = "10.0", value = "The Percentage of the Deduction")
  public Double getPercentage() {
    return percentage;
  }

  public void setPercentage(Double percentage) {
    this.percentage = percentage;
  }

  public DeductionLine numberOfUnits(Double numberOfUnits) {
    this.numberOfUnits = numberOfUnits;
    return this;
  }

  /**
   * Deduction number of units
   *
   * @return numberOfUnits
   */
  @ApiModelProperty(example = "10.0", value = "Deduction number of units")
  public Double getNumberOfUnits() {
    return numberOfUnits;
  }

  public void setNumberOfUnits(Double numberOfUnits) {
    this.numberOfUnits = numberOfUnits;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeductionLine deductionLine = (DeductionLine) o;
    return Objects.equals(this.deductionTypeID, deductionLine.deductionTypeID)
        && Objects.equals(this.calculationType, deductionLine.calculationType)
        && Objects.equals(this.amount, deductionLine.amount)
        && Objects.equals(this.percentage, deductionLine.percentage)
        && Objects.equals(this.numberOfUnits, deductionLine.numberOfUnits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deductionTypeID, calculationType, amount, percentage, numberOfUnits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeductionLine {\n");
    sb.append("    deductionTypeID: ").append(toIndentedString(deductionTypeID)).append("\n");
    sb.append("    calculationType: ").append(toIndentedString(calculationType)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    numberOfUnits: ").append(toIndentedString(numberOfUnits)).append("\n");
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
