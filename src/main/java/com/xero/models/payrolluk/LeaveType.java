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
import org.threeten.bp.OffsetDateTime;
import java.io.IOException;

import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import com.xero.api.StringUtil;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * LeaveType
 */

public class LeaveType {
  StringUtil util = new StringUtil();

  @JsonProperty("leaveID")
  private UUID leaveID;

  @JsonProperty("leaveTypeID")
  private UUID leaveTypeID;

  @JsonProperty("name")
  private String name;

  @JsonProperty("isPaidLeave")
  private Boolean isPaidLeave;

  @JsonProperty("showOnPayslip")
  private Boolean showOnPayslip;

  @JsonProperty("updatedDateUTC")
  private LocalDateTime updatedDateUTC;

  @JsonProperty("isActive")
  private Boolean isActive;

  @JsonProperty("isStatutoryLeave")
  private Boolean isStatutoryLeave;
  public LeaveType leaveID(UUID leaveID) {
    this.leaveID = leaveID;
    return this;
  }

   /**
   * Xero unique identifier for the leave
   * @return leaveID
  **/
  @ApiModelProperty(value = "Xero unique identifier for the leave")
  public UUID getLeaveID() {
    return leaveID;
  }

  public void setLeaveID(UUID leaveID) {
    this.leaveID = leaveID;
  }

  public LeaveType leaveTypeID(UUID leaveTypeID) {
    this.leaveTypeID = leaveTypeID;
    return this;
  }

   /**
   * Xero unique identifier for the leave type
   * @return leaveTypeID
  **/
  @ApiModelProperty(value = "Xero unique identifier for the leave type")
  public UUID getLeaveTypeID() {
    return leaveTypeID;
  }

  public void setLeaveTypeID(UUID leaveTypeID) {
    this.leaveTypeID = leaveTypeID;
  }

  public LeaveType name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the leave type
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the leave type")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LeaveType isPaidLeave(Boolean isPaidLeave) {
    this.isPaidLeave = isPaidLeave;
    return this;
  }

   /**
   * Indicate that an employee will be paid when taking this type of leave
   * @return isPaidLeave
  **/
  @ApiModelProperty(required = true, value = "Indicate that an employee will be paid when taking this type of leave")
  public Boolean getIsPaidLeave() {
    return isPaidLeave;
  }

  public void setIsPaidLeave(Boolean isPaidLeave) {
    this.isPaidLeave = isPaidLeave;
  }

  public LeaveType showOnPayslip(Boolean showOnPayslip) {
    this.showOnPayslip = showOnPayslip;
    return this;
  }

   /**
   * Indicate that a balance for this leave type to be shown on the employee’s payslips
   * @return showOnPayslip
  **/
  @ApiModelProperty(required = true, value = "Indicate that a balance for this leave type to be shown on the employee’s payslips")
  public Boolean getShowOnPayslip() {
    return showOnPayslip;
  }

  public void setShowOnPayslip(Boolean showOnPayslip) {
    this.showOnPayslip = showOnPayslip;
  }

  public LeaveType updatedDateUTC(LocalDateTime updatedDateUTC) {
    this.updatedDateUTC = updatedDateUTC;
    return this;
  }

   /**
   * UTC timestamp of last update to the leave type note
   * @return updatedDateUTC
  **/
  @ApiModelProperty(value = "UTC timestamp of last update to the leave type note")
  public LocalDateTime getUpdatedDateUTC() {
    return updatedDateUTC;
  }

  public void setUpdatedDateUTC(LocalDateTime updatedDateUTC) {
    this.updatedDateUTC = updatedDateUTC;
  }

  public LeaveType isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * Shows whether the leave type is active or not
   * @return isActive
  **/
  @ApiModelProperty(value = "Shows whether the leave type is active or not")
  public Boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public LeaveType isStatutoryLeave(Boolean isStatutoryLeave) {
    this.isStatutoryLeave = isStatutoryLeave;
    return this;
  }

   /**
   * Shows whether the leave type is a statutory leave type or not
   * @return isStatutoryLeave
  **/
  @ApiModelProperty(value = "Shows whether the leave type is a statutory leave type or not")
  public Boolean getIsStatutoryLeave() {
    return isStatutoryLeave;
  }

  public void setIsStatutoryLeave(Boolean isStatutoryLeave) {
    this.isStatutoryLeave = isStatutoryLeave;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeaveType leaveType = (LeaveType) o;
    return Objects.equals(this.leaveID, leaveType.leaveID) &&
        Objects.equals(this.leaveTypeID, leaveType.leaveTypeID) &&
        Objects.equals(this.name, leaveType.name) &&
        Objects.equals(this.isPaidLeave, leaveType.isPaidLeave) &&
        Objects.equals(this.showOnPayslip, leaveType.showOnPayslip) &&
        Objects.equals(this.updatedDateUTC, leaveType.updatedDateUTC) &&
        Objects.equals(this.isActive, leaveType.isActive) &&
        Objects.equals(this.isStatutoryLeave, leaveType.isStatutoryLeave);
  }

  @Override
  public int hashCode() {
    return Objects.hash(leaveID, leaveTypeID, name, isPaidLeave, showOnPayslip, updatedDateUTC, isActive, isStatutoryLeave);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeaveType {\n");
    sb.append("    leaveID: ").append(toIndentedString(leaveID)).append("\n");
    sb.append("    leaveTypeID: ").append(toIndentedString(leaveTypeID)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isPaidLeave: ").append(toIndentedString(isPaidLeave)).append("\n");
    sb.append("    showOnPayslip: ").append(toIndentedString(showOnPayslip)).append("\n");
    sb.append("    updatedDateUTC: ").append(toIndentedString(updatedDateUTC)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    isStatutoryLeave: ").append(toIndentedString(isStatutoryLeave)).append("\n");
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

