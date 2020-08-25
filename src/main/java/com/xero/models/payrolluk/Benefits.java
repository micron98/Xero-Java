/*
 * Xero Payroll UK
 * This is the Xero Payroll API for orgs in the UK region.
 *
 * The version of the OpenAPI document: 2.2.13
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

/** Benefits */
public class Benefits {
  StringUtil util = new StringUtil();

  @JsonProperty("pagination")
  private Pagination pagination;

  @JsonProperty("problem")
  private Problem problem;

  @JsonProperty("benefits")
  private List<Benefit> benefits = new ArrayList<Benefit>();

  public Benefits pagination(Pagination pagination) {
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

  public Benefits problem(Problem problem) {
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

  public Benefits benefits(List<Benefit> benefits) {
    this.benefits = benefits;
    return this;
  }

  public Benefits addBenefitsItem(Benefit benefitsItem) {
    if (this.benefits == null) {
      this.benefits = new ArrayList<Benefit>();
    }
    this.benefits.add(benefitsItem);
    return this;
  }

  /**
   * Get benefits
   *
   * @return benefits
   */
  @ApiModelProperty(value = "")
  public List<Benefit> getBenefits() {
    return benefits;
  }

  public void setBenefits(List<Benefit> benefits) {
    this.benefits = benefits;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Benefits benefits = (Benefits) o;
    return Objects.equals(this.pagination, benefits.pagination)
        && Objects.equals(this.problem, benefits.problem)
        && Objects.equals(this.benefits, benefits.benefits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagination, problem, benefits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Benefits {\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    problem: ").append(toIndentedString(problem)).append("\n");
    sb.append("    benefits: ").append(toIndentedString(benefits)).append("\n");
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
