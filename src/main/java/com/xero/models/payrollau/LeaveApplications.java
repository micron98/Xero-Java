/*
 * Xero Payroll AU
 * This is the Xero Payroll API for orgs in Australia region.
 *
 * The version of the OpenAPI document: 2.2.6
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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** LeaveApplications */
public class LeaveApplications {
  StringUtil util = new StringUtil();

  @JsonProperty("LeaveApplications")
  private List<LeaveApplication> leaveApplications = new ArrayList<LeaveApplication>();

  public LeaveApplications leaveApplications(List<LeaveApplication> leaveApplications) {
    this.leaveApplications = leaveApplications;
    return this;
  }

  public LeaveApplications addLeaveApplicationsItem(LeaveApplication leaveApplicationsItem) {
    if (this.leaveApplications == null) {
      this.leaveApplications = new ArrayList<LeaveApplication>();
    }
    this.leaveApplications.add(leaveApplicationsItem);
    return this;
  }

  /**
   * Get leaveApplications
   *
   * @return leaveApplications
   */
  @ApiModelProperty(value = "")
  public List<LeaveApplication> getLeaveApplications() {
    return leaveApplications;
  }

  public void setLeaveApplications(List<LeaveApplication> leaveApplications) {
    this.leaveApplications = leaveApplications;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeaveApplications leaveApplications = (LeaveApplications) o;
    return Objects.equals(this.leaveApplications, leaveApplications.leaveApplications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(leaveApplications);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeaveApplications {\n");
    sb.append("    leaveApplications: ").append(toIndentedString(leaveApplications)).append("\n");
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
