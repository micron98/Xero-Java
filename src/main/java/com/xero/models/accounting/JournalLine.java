/*
 * Accounting API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0.0
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
import com.xero.models.accounting.TrackingCategory;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * JournalLine
 */

public class JournalLine {
  @JsonProperty("LineAmount")
  private String lineAmount = null;

  @JsonProperty("AccountCode")
  private String accountCode = null;

  @JsonProperty("Description")
  private String description = null;

  @JsonProperty("TaxType")
  private String taxType = null;

  @JsonProperty("Tracking")
  private List<TrackingCategory> tracking = null;

  @JsonProperty("TaxAmount")
  private Float taxAmount = null;

  public JournalLine lineAmount(String lineAmount) {
    this.lineAmount = lineAmount;
    return this;
  }

   /**
   * total for line. Debits are positive, credits are negative value
   * @return lineAmount
  **/
  @ApiModelProperty(required = true, value = "total for line. Debits are positive, credits are negative value")
  public String getLineAmount() {
    return lineAmount;
  }

  public void setLineAmount(String lineAmount) {
    this.lineAmount = lineAmount;
  }

  public JournalLine accountCode(String accountCode) {
    this.accountCode = accountCode;
    return this;
  }

   /**
   * See Accounts
   * @return accountCode
  **/
  @ApiModelProperty(required = true, value = "See Accounts")
  public String getAccountCode() {
    return accountCode;
  }

  public void setAccountCode(String accountCode) {
    this.accountCode = accountCode;
  }

  public JournalLine description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description for journal line
   * @return description
  **/
  @ApiModelProperty(value = "Description for journal line")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public JournalLine taxType(String taxType) {
    this.taxType = taxType;
    return this;
  }

   /**
   * Used as an override if the default Tax Code for the selected &lt;AccountCode&gt; is not correct – see TaxTypes.
   * @return taxType
  **/
  @ApiModelProperty(value = "Used as an override if the default Tax Code for the selected <AccountCode> is not correct – see TaxTypes.")
  public String getTaxType() {
    return taxType;
  }

  public void setTaxType(String taxType) {
    this.taxType = taxType;
  }

  public JournalLine tracking(List<TrackingCategory> tracking) {
    this.tracking = tracking;
    return this;
  }

  public JournalLine addTrackingItem(TrackingCategory trackingItem) {
    if (this.tracking == null) {
      this.tracking = new ArrayList<TrackingCategory>();
    }
    this.tracking.add(trackingItem);
    return this;
  }

   /**
   * Optional Tracking Category – see Tracking. Any JournalLine can have a maximum of 2 &lt;TrackingCategory&gt; elements.
   * @return tracking
  **/
  @ApiModelProperty(value = "Optional Tracking Category – see Tracking. Any JournalLine can have a maximum of 2 <TrackingCategory> elements.")
  public List<TrackingCategory> getTracking() {
    return tracking;
  }

  public void setTracking(List<TrackingCategory> tracking) {
    this.tracking = tracking;
  }

   /**
   * The calculated tax amount based on the TaxType and LineAmount
   * @return taxAmount
  **/
  @ApiModelProperty(value = "The calculated tax amount based on the TaxType and LineAmount")
  public Float getTaxAmount() {
    return taxAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JournalLine journalLine = (JournalLine) o;
    return Objects.equals(this.lineAmount, journalLine.lineAmount) &&
        Objects.equals(this.accountCode, journalLine.accountCode) &&
        Objects.equals(this.description, journalLine.description) &&
        Objects.equals(this.taxType, journalLine.taxType) &&
        Objects.equals(this.tracking, journalLine.tracking) &&
        Objects.equals(this.taxAmount, journalLine.taxAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineAmount, accountCode, description, taxType, tracking, taxAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JournalLine {\n");
    
    sb.append("    lineAmount: ").append(toIndentedString(lineAmount)).append("\n");
    sb.append("    accountCode: ").append(toIndentedString(accountCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    taxType: ").append(toIndentedString(taxType)).append("\n");
    sb.append("    tracking: ").append(toIndentedString(tracking)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
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

