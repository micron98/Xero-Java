/*
 * Xero Payroll NZ
 * This is the Xero Payroll API for orgs in the NZ region.
 *
 * The version of the OpenAPI document: 2.3.3
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
import org.threeten.bp.LocalDate;

/** EmployeeOpeningBalance */
public class EmployeeOpeningBalance {
  StringUtil util = new StringUtil();

  @JsonProperty("periodEndDate")
  private LocalDate periodEndDate;

  @JsonProperty("daysPaid")
  private Integer daysPaid;

  @JsonProperty("unpaidWeeks")
  private Integer unpaidWeeks;

  @JsonProperty("grossEarnings")
  private Double grossEarnings;

  public EmployeeOpeningBalance periodEndDate(LocalDate periodEndDate) {
    this.periodEndDate = periodEndDate;
    return this;
  }

  /**
   * The opening balance period end date.
   *
   * @return periodEndDate
   */
  @ApiModelProperty(value = "The opening balance period end date.")
  public LocalDate getPeriodEndDate() {
    return periodEndDate;
  }

  public void setPeriodEndDate(LocalDate periodEndDate) {
    this.periodEndDate = periodEndDate;
  }

  public EmployeeOpeningBalance daysPaid(Integer daysPaid) {
    this.daysPaid = daysPaid;
    return this;
  }

  /**
   * The paid number of days.
   *
   * @return daysPaid
   */
  @ApiModelProperty(value = "The paid number of days.")
  public Integer getDaysPaid() {
    return daysPaid;
  }

  public void setDaysPaid(Integer daysPaid) {
    this.daysPaid = daysPaid;
  }

  public EmployeeOpeningBalance unpaidWeeks(Integer unpaidWeeks) {
    this.unpaidWeeks = unpaidWeeks;
    return this;
  }

  /**
   * The number of unpaid weeks.
   *
   * @return unpaidWeeks
   */
  @ApiModelProperty(value = "The number of unpaid weeks.")
  public Integer getUnpaidWeeks() {
    return unpaidWeeks;
  }

  public void setUnpaidWeeks(Integer unpaidWeeks) {
    this.unpaidWeeks = unpaidWeeks;
  }

  public EmployeeOpeningBalance grossEarnings(Double grossEarnings) {
    this.grossEarnings = grossEarnings;
    return this;
  }

  /**
   * The gross earnings during the period.
   *
   * @return grossEarnings
   */
  @ApiModelProperty(value = "The gross earnings during the period.")
  public Double getGrossEarnings() {
    return grossEarnings;
  }

  public void setGrossEarnings(Double grossEarnings) {
    this.grossEarnings = grossEarnings;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeeOpeningBalance employeeOpeningBalance = (EmployeeOpeningBalance) o;
    return Objects.equals(this.periodEndDate, employeeOpeningBalance.periodEndDate)
        && Objects.equals(this.daysPaid, employeeOpeningBalance.daysPaid)
        && Objects.equals(this.unpaidWeeks, employeeOpeningBalance.unpaidWeeks)
        && Objects.equals(this.grossEarnings, employeeOpeningBalance.grossEarnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(periodEndDate, daysPaid, unpaidWeeks, grossEarnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeOpeningBalance {\n");
    sb.append("    periodEndDate: ").append(toIndentedString(periodEndDate)).append("\n");
    sb.append("    daysPaid: ").append(toIndentedString(daysPaid)).append("\n");
    sb.append("    unpaidWeeks: ").append(toIndentedString(unpaidWeeks)).append("\n");
    sb.append("    grossEarnings: ").append(toIndentedString(grossEarnings)).append("\n");
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
