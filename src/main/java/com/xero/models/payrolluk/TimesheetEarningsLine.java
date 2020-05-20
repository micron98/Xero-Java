/*
 * Xero Payroll UK
 * This is the Xero Payroll API for orgs in the UK region.
 *
 * The version of the OpenAPI document: 2.1.5
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.xero.models.payrolluk;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import java.io.IOException;

import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import com.xero.api.StringUtil;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * TimesheetEarningsLine
 */

public class TimesheetEarningsLine {
  StringUtil util = new StringUtil();

  @JsonProperty("earningsRateID")
  private UUID earningsRateID;

  @JsonProperty("ratePerUnit")
  private Double ratePerUnit;

  @JsonProperty("numberOfUnits")
  private Double numberOfUnits;

  @JsonProperty("fixedAmount")
  private Double fixedAmount;

  @JsonProperty("amount")
  private Double amount;

  @JsonProperty("isLinkedToTimesheet")
  private Boolean isLinkedToTimesheet;
  public TimesheetEarningsLine earningsRateID(UUID earningsRateID) {
    this.earningsRateID = earningsRateID;
    return this;
  }

   /**
   * Xero identifier for payroll timesheet earnings rate
   * @return earningsRateID
  **/
  @ApiModelProperty(value = "Xero identifier for payroll timesheet earnings rate")
  public UUID getEarningsRateID() {
    return earningsRateID;
  }

  public void setEarningsRateID(UUID earningsRateID) {
    this.earningsRateID = earningsRateID;
  }

  public TimesheetEarningsLine ratePerUnit(Double ratePerUnit) {
    this.ratePerUnit = ratePerUnit;
    return this;
  }

   /**
   * Rate per unit for timesheet earnings line
   * @return ratePerUnit
  **/
  @ApiModelProperty(value = "Rate per unit for timesheet earnings line")
  public Double getRatePerUnit() {
    return ratePerUnit;
  }

  public void setRatePerUnit(Double ratePerUnit) {
    this.ratePerUnit = ratePerUnit;
  }

  public TimesheetEarningsLine numberOfUnits(Double numberOfUnits) {
    this.numberOfUnits = numberOfUnits;
    return this;
  }

   /**
   * Timesheet earnings number of units
   * @return numberOfUnits
  **/
  @ApiModelProperty(value = "Timesheet earnings number of units")
  public Double getNumberOfUnits() {
    return numberOfUnits;
  }

  public void setNumberOfUnits(Double numberOfUnits) {
    this.numberOfUnits = numberOfUnits;
  }

  public TimesheetEarningsLine fixedAmount(Double fixedAmount) {
    this.fixedAmount = fixedAmount;
    return this;
  }

   /**
   * Timesheet earnings fixed amount. Only applicable if the EarningsRate RateType is Fixed
   * @return fixedAmount
  **/
  @ApiModelProperty(value = "Timesheet earnings fixed amount. Only applicable if the EarningsRate RateType is Fixed")
  public Double getFixedAmount() {
    return fixedAmount;
  }

  public void setFixedAmount(Double fixedAmount) {
    this.fixedAmount = fixedAmount;
  }

  public TimesheetEarningsLine amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * The amount of the timesheet earnings line.
   * @return amount
  **/
  @ApiModelProperty(value = "The amount of the timesheet earnings line.")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public TimesheetEarningsLine isLinkedToTimesheet(Boolean isLinkedToTimesheet) {
    this.isLinkedToTimesheet = isLinkedToTimesheet;
    return this;
  }

   /**
   * Identifies if the timesheet earnings is taken from the timesheet. False for leave earnings line
   * @return isLinkedToTimesheet
  **/
  @ApiModelProperty(value = "Identifies if the timesheet earnings is taken from the timesheet. False for leave earnings line")
  public Boolean getIsLinkedToTimesheet() {
    return isLinkedToTimesheet;
  }

  public void setIsLinkedToTimesheet(Boolean isLinkedToTimesheet) {
    this.isLinkedToTimesheet = isLinkedToTimesheet;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimesheetEarningsLine timesheetEarningsLine = (TimesheetEarningsLine) o;
    return Objects.equals(this.earningsRateID, timesheetEarningsLine.earningsRateID) &&
        Objects.equals(this.ratePerUnit, timesheetEarningsLine.ratePerUnit) &&
        Objects.equals(this.numberOfUnits, timesheetEarningsLine.numberOfUnits) &&
        Objects.equals(this.fixedAmount, timesheetEarningsLine.fixedAmount) &&
        Objects.equals(this.amount, timesheetEarningsLine.amount) &&
        Objects.equals(this.isLinkedToTimesheet, timesheetEarningsLine.isLinkedToTimesheet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(earningsRateID, ratePerUnit, numberOfUnits, fixedAmount, amount, isLinkedToTimesheet);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimesheetEarningsLine {\n");
    sb.append("    earningsRateID: ").append(toIndentedString(earningsRateID)).append("\n");
    sb.append("    ratePerUnit: ").append(toIndentedString(ratePerUnit)).append("\n");
    sb.append("    numberOfUnits: ").append(toIndentedString(numberOfUnits)).append("\n");
    sb.append("    fixedAmount: ").append(toIndentedString(fixedAmount)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    isLinkedToTimesheet: ").append(toIndentedString(isLinkedToTimesheet)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

