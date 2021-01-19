/*
 * Xero Payroll NZ
 * This is the Xero Payroll API for orgs in the NZ region.
 *
 * The version of the OpenAPI document: 2.8.2
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.payrollnz;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import java.util.UUID;

/** TrackingCategory */
public class TrackingCategory {
  StringUtil util = new StringUtil();

  @JsonProperty("employeeGroupsTrackingCategoryID")
  private UUID employeeGroupsTrackingCategoryID;

  @JsonProperty("timesheetTrackingCategoryID")
  private UUID timesheetTrackingCategoryID;

  public TrackingCategory employeeGroupsTrackingCategoryID(UUID employeeGroupsTrackingCategoryID) {
    this.employeeGroupsTrackingCategoryID = employeeGroupsTrackingCategoryID;
    return this;
  }

  /**
   * The Xero identifier for Employee groups tracking category.
   *
   * @return employeeGroupsTrackingCategoryID
   */
  @ApiModelProperty(value = "The Xero identifier for Employee groups tracking category.")
  public UUID getEmployeeGroupsTrackingCategoryID() {
    return employeeGroupsTrackingCategoryID;
  }

  public void setEmployeeGroupsTrackingCategoryID(UUID employeeGroupsTrackingCategoryID) {
    this.employeeGroupsTrackingCategoryID = employeeGroupsTrackingCategoryID;
  }

  public TrackingCategory timesheetTrackingCategoryID(UUID timesheetTrackingCategoryID) {
    this.timesheetTrackingCategoryID = timesheetTrackingCategoryID;
    return this;
  }

  /**
   * The Xero identifier for Timesheet tracking category.
   *
   * @return timesheetTrackingCategoryID
   */
  @ApiModelProperty(value = "The Xero identifier for Timesheet tracking category.")
  public UUID getTimesheetTrackingCategoryID() {
    return timesheetTrackingCategoryID;
  }

  public void setTimesheetTrackingCategoryID(UUID timesheetTrackingCategoryID) {
    this.timesheetTrackingCategoryID = timesheetTrackingCategoryID;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackingCategory trackingCategory = (TrackingCategory) o;
    return Objects.equals(
            this.employeeGroupsTrackingCategoryID,
            trackingCategory.employeeGroupsTrackingCategoryID)
        && Objects.equals(
            this.timesheetTrackingCategoryID, trackingCategory.timesheetTrackingCategoryID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employeeGroupsTrackingCategoryID, timesheetTrackingCategoryID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackingCategory {\n");
    sb.append("    employeeGroupsTrackingCategoryID: ")
        .append(toIndentedString(employeeGroupsTrackingCategoryID))
        .append("\n");
    sb.append("    timesheetTrackingCategoryID: ")
        .append(toIndentedString(timesheetTrackingCategoryID))
        .append("\n");
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
