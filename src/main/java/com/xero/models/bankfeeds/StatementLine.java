/*
 * Bank Feeds API
 * The Xero Bank Feeds API
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.xero.models.bankfeeds;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.xero.models.bankfeeds.CreditDebitIndicator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.LocalDate;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * StatementLine
 */

public class StatementLine {
  @JsonProperty("postedDate")
  private LocalDate postedDate;

  @JsonProperty("description")
  private String description;

  @JsonProperty("amount")
  private String amount;

  @JsonProperty("creditDebitIndicator")
  private CreditDebitIndicator creditDebitIndicator;

  @JsonProperty("transactionId")
  private String transactionId;

  @JsonProperty("payeeName")
  private String payeeName;

  @JsonProperty("reference")
  private String reference;

  @JsonProperty("chequeNumber")
  private String chequeNumber;

  public StatementLine postedDate(LocalDate postedDate) {
    this.postedDate = postedDate;
    return this;
  }

   /**
   * Get postedDate
   * @return postedDate
  **/
  @ApiModelProperty(value = "")
  public LocalDate getPostedDate() {
    return postedDate;
  }

  public void setPostedDate(LocalDate postedDate) {
    this.postedDate = postedDate;
  }

  public StatementLine description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "Description for statement line 2", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public StatementLine amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(example = "5.00", value = "")
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public StatementLine creditDebitIndicator(CreditDebitIndicator creditDebitIndicator) {
    this.creditDebitIndicator = creditDebitIndicator;
    return this;
  }

   /**
   * Get creditDebitIndicator
   * @return creditDebitIndicator
  **/
  @ApiModelProperty(value = "")
  public CreditDebitIndicator getCreditDebitIndicator() {
    return creditDebitIndicator;
  }

  public void setCreditDebitIndicator(CreditDebitIndicator creditDebitIndicator) {
    this.creditDebitIndicator = creditDebitIndicator;
  }

  public StatementLine transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Get transactionId
   * @return transactionId
  **/
  @ApiModelProperty(example = "transaction-id-2", value = "")
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public StatementLine payeeName(String payeeName) {
    this.payeeName = payeeName;
    return this;
  }

   /**
   * Get payeeName
   * @return payeeName
  **/
  @ApiModelProperty(example = "Payee name for statement line 2", value = "")
  public String getPayeeName() {
    return payeeName;
  }

  public void setPayeeName(String payeeName) {
    this.payeeName = payeeName;
  }

  public StatementLine reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Get reference
   * @return reference
  **/
  @ApiModelProperty(example = "Reference for statement line 2", value = "")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public StatementLine chequeNumber(String chequeNumber) {
    this.chequeNumber = chequeNumber;
    return this;
  }

   /**
   * Get chequeNumber
   * @return chequeNumber
  **/
  @ApiModelProperty(example = "021", value = "")
  public String getChequeNumber() {
    return chequeNumber;
  }

  public void setChequeNumber(String chequeNumber) {
    this.chequeNumber = chequeNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatementLine statementLine = (StatementLine) o;
    return Objects.equals(this.postedDate, statementLine.postedDate) &&
        Objects.equals(this.description, statementLine.description) &&
        Objects.equals(this.amount, statementLine.amount) &&
        Objects.equals(this.creditDebitIndicator, statementLine.creditDebitIndicator) &&
        Objects.equals(this.transactionId, statementLine.transactionId) &&
        Objects.equals(this.payeeName, statementLine.payeeName) &&
        Objects.equals(this.reference, statementLine.reference) &&
        Objects.equals(this.chequeNumber, statementLine.chequeNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(postedDate, description, amount, creditDebitIndicator, transactionId, payeeName, reference, chequeNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatementLine {\n");
    sb.append("    postedDate: ").append(toIndentedString(postedDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    creditDebitIndicator: ").append(toIndentedString(creditDebitIndicator)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    payeeName: ").append(toIndentedString(payeeName)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    chequeNumber: ").append(toIndentedString(chequeNumber)).append("\n");
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

