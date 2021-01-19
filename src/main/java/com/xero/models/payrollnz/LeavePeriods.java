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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** LeavePeriods */
public class LeavePeriods {
  StringUtil util = new StringUtil();

  @JsonProperty("pagination")
  private Pagination pagination;

  @JsonProperty("problem")
  private Problem problem;

  @JsonProperty("periods")
  private List<LeavePeriod> periods = new ArrayList<LeavePeriod>();

  public LeavePeriods pagination(Pagination pagination) {
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

  public LeavePeriods problem(Problem problem) {
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

  public LeavePeriods periods(List<LeavePeriod> periods) {
    this.periods = periods;
    return this;
  }

  public LeavePeriods addPeriodsItem(LeavePeriod periodsItem) {
    if (this.periods == null) {
      this.periods = new ArrayList<LeavePeriod>();
    }
    this.periods.add(periodsItem);
    return this;
  }

  /**
   * Get periods
   *
   * @return periods
   */
  @ApiModelProperty(value = "")
  public List<LeavePeriod> getPeriods() {
    return periods;
  }

  public void setPeriods(List<LeavePeriod> periods) {
    this.periods = periods;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeavePeriods leavePeriods = (LeavePeriods) o;
    return Objects.equals(this.pagination, leavePeriods.pagination)
        && Objects.equals(this.problem, leavePeriods.problem)
        && Objects.equals(this.periods, leavePeriods.periods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagination, problem, periods);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeavePeriods {\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    problem: ").append(toIndentedString(problem)).append("\n");
    sb.append("    periods: ").append(toIndentedString(periods)).append("\n");
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
