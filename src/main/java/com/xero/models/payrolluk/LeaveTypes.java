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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** LeaveTypes */
public class LeaveTypes {
  StringUtil util = new StringUtil();

  @JsonProperty("pagination")
  private Pagination pagination;

  @JsonProperty("problem")
  private Problem problem;

  @JsonProperty("leaveTypes")
  private List<LeaveType> leaveTypes = new ArrayList<LeaveType>();

  public LeaveTypes pagination(Pagination pagination) {
    this.pagination = pagination;
    return this;
  }

  /**
   * Get pagination
   *
   * @return pagination
   */
  @ApiModelProperty(value = "")
  public Pagination getPagination() {
    return pagination;
  }

  public void setPagination(Pagination pagination) {
    this.pagination = pagination;
  }

  public LeaveTypes problem(Problem problem) {
    this.problem = problem;
    return this;
  }

  /**
   * Get problem
   *
   * @return problem
   */
  @ApiModelProperty(value = "")
  public Problem getProblem() {
    return problem;
  }

  public void setProblem(Problem problem) {
    this.problem = problem;
  }

  public LeaveTypes leaveTypes(List<LeaveType> leaveTypes) {
    this.leaveTypes = leaveTypes;
    return this;
  }

  public LeaveTypes addLeaveTypesItem(LeaveType leaveTypesItem) {
    if (this.leaveTypes == null) {
      this.leaveTypes = new ArrayList<LeaveType>();
    }
    this.leaveTypes.add(leaveTypesItem);
    return this;
  }

  /**
   * Get leaveTypes
   *
   * @return leaveTypes
   */
  @ApiModelProperty(value = "")
  public List<LeaveType> getLeaveTypes() {
    return leaveTypes;
  }

  public void setLeaveTypes(List<LeaveType> leaveTypes) {
    this.leaveTypes = leaveTypes;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeaveTypes leaveTypes = (LeaveTypes) o;
    return Objects.equals(this.pagination, leaveTypes.pagination)
        && Objects.equals(this.problem, leaveTypes.problem)
        && Objects.equals(this.leaveTypes, leaveTypes.leaveTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagination, problem, leaveTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeaveTypes {\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    problem: ").append(toIndentedString(problem)).append("\n");
    sb.append("    leaveTypes: ").append(toIndentedString(leaveTypes)).append("\n");
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
