/*
 * Xero Payroll UK
 * This is the Xero Payroll API for orgs in the UK region.
 *
 * The version of the OpenAPI document: 2.3.3
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

/** EmployeeStatutoryLeavesSummaries */
public class EmployeeStatutoryLeavesSummaries {
  StringUtil util = new StringUtil();

  @JsonProperty("pagination")
  private Pagination pagination;

  @JsonProperty("problem")
  private Problem problem;

  @JsonProperty("statutoryLeaves")
  private List<EmployeeStatutoryLeaveSummary> statutoryLeaves =
      new ArrayList<EmployeeStatutoryLeaveSummary>();

  public EmployeeStatutoryLeavesSummaries pagination(Pagination pagination) {
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

  public EmployeeStatutoryLeavesSummaries problem(Problem problem) {
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

  public EmployeeStatutoryLeavesSummaries statutoryLeaves(
      List<EmployeeStatutoryLeaveSummary> statutoryLeaves) {
    this.statutoryLeaves = statutoryLeaves;
    return this;
  }

  public EmployeeStatutoryLeavesSummaries addStatutoryLeavesItem(
      EmployeeStatutoryLeaveSummary statutoryLeavesItem) {
    if (this.statutoryLeaves == null) {
      this.statutoryLeaves = new ArrayList<EmployeeStatutoryLeaveSummary>();
    }
    this.statutoryLeaves.add(statutoryLeavesItem);
    return this;
  }

  /**
   * Get statutoryLeaves
   *
   * @return statutoryLeaves
   */
  @ApiModelProperty(value = "")
  public List<EmployeeStatutoryLeaveSummary> getStatutoryLeaves() {
    return statutoryLeaves;
  }

  public void setStatutoryLeaves(List<EmployeeStatutoryLeaveSummary> statutoryLeaves) {
    this.statutoryLeaves = statutoryLeaves;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeeStatutoryLeavesSummaries employeeStatutoryLeavesSummaries =
        (EmployeeStatutoryLeavesSummaries) o;
    return Objects.equals(this.pagination, employeeStatutoryLeavesSummaries.pagination)
        && Objects.equals(this.problem, employeeStatutoryLeavesSummaries.problem)
        && Objects.equals(this.statutoryLeaves, employeeStatutoryLeavesSummaries.statutoryLeaves);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagination, problem, statutoryLeaves);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeStatutoryLeavesSummaries {\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    problem: ").append(toIndentedString(problem)).append("\n");
    sb.append("    statutoryLeaves: ").append(toIndentedString(statutoryLeaves)).append("\n");
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
