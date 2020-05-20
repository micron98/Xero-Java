/*
 * Accounting API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.1.5
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.xero.models.accounting;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.xero.models.accounting.Employee;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import com.xero.api.StringUtil;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * Employees
 */

public class Employees {
  StringUtil util = new StringUtil();

  @JsonProperty("Employees")
  private List<Employee> employees = new ArrayList<Employee>();
  public Employees employees(List<Employee> employees) {
    this.employees = employees;
    return this;
  }

  public Employees addEmployeesItem(Employee employeesItem) {
    if (this.employees == null) {
      this.employees = new ArrayList<Employee>();
    }
    this.employees.add(employeesItem);
    return this;
  }

   /**
   * Get employees
   * @return employees
  **/
  @ApiModelProperty(value = "")
  public List<Employee> getEmployees() {
    return employees;
  }

  public void setEmployees(List<Employee> employees) {
    this.employees = employees;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Employees employees = (Employees) o;
    return Objects.equals(this.employees, employees.employees);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employees);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Employees {\n");
    sb.append("    employees: ").append(toIndentedString(employees)).append("\n");
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

