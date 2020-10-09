/*
 * Xero Payroll AU
 * This is the Xero Payroll API for orgs in Australia region.
 *
 * The version of the OpenAPI document: 2.3.3
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.payrollau;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Gets or Sets SuperannuationCalculationType */
public enum SuperannuationCalculationType {
  FIXEDAMOUNT("FIXEDAMOUNT"),

  PERCENTAGEOFEARNINGS("PERCENTAGEOFEARNINGS"),

  STATUTORY("STATUTORY");

  private String value;

  SuperannuationCalculationType(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static SuperannuationCalculationType fromValue(String value) {
    for (SuperannuationCalculationType b : SuperannuationCalculationType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
