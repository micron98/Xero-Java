/*
 * Accounting API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.2.6
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.accounting;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** ManualJournals */
public class ManualJournals {
  StringUtil util = new StringUtil();

  @JsonProperty("ManualJournals")
  private List<ManualJournal> manualJournals = new ArrayList<ManualJournal>();

  public ManualJournals manualJournals(List<ManualJournal> manualJournals) {
    this.manualJournals = manualJournals;
    return this;
  }

  public ManualJournals addManualJournalsItem(ManualJournal manualJournalsItem) {
    if (this.manualJournals == null) {
      this.manualJournals = new ArrayList<ManualJournal>();
    }
    this.manualJournals.add(manualJournalsItem);
    return this;
  }

  /**
   * Get manualJournals
   *
   * @return manualJournals
   */
  @ApiModelProperty(value = "")
  public List<ManualJournal> getManualJournals() {
    return manualJournals;
  }

  public void setManualJournals(List<ManualJournal> manualJournals) {
    this.manualJournals = manualJournals;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManualJournals manualJournals = (ManualJournals) o;
    return Objects.equals(this.manualJournals, manualJournals.manualJournals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(manualJournals);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManualJournals {\n");
    sb.append("    manualJournals: ").append(toIndentedString(manualJournals)).append("\n");
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
