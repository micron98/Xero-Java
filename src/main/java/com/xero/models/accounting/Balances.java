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
import com.xero.models.accounting.AccountsPayable;
import com.xero.models.accounting.AccountsReceivable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The raw AccountsReceivable(sales invoices) and AccountsPayable(bills) outstanding and overdue amounts, not converted to base currency (read only)
 */
@ApiModel(description = "The raw AccountsReceivable(sales invoices) and AccountsPayable(bills) outstanding and overdue amounts, not converted to base currency (read only)")

public class Balances {
  @JsonProperty("AccountsReceivable")
  private AccountsReceivable accountsReceivable = null;

  @JsonProperty("AccountsPayable")
  private AccountsPayable accountsPayable = null;

  public Balances accountsReceivable(AccountsReceivable accountsReceivable) {
    this.accountsReceivable = accountsReceivable;
    return this;
  }

   /**
   * Get accountsReceivable
   * @return accountsReceivable
  **/
  @ApiModelProperty(value = "")
  public AccountsReceivable getAccountsReceivable() {
    return accountsReceivable;
  }

  public void setAccountsReceivable(AccountsReceivable accountsReceivable) {
    this.accountsReceivable = accountsReceivable;
  }

  public Balances accountsPayable(AccountsPayable accountsPayable) {
    this.accountsPayable = accountsPayable;
    return this;
  }

   /**
   * Get accountsPayable
   * @return accountsPayable
  **/
  @ApiModelProperty(value = "")
  public AccountsPayable getAccountsPayable() {
    return accountsPayable;
  }

  public void setAccountsPayable(AccountsPayable accountsPayable) {
    this.accountsPayable = accountsPayable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Balances balances = (Balances) o;
    return Objects.equals(this.accountsReceivable, balances.accountsReceivable) &&
        Objects.equals(this.accountsPayable, balances.accountsPayable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountsReceivable, accountsPayable);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Balances {\n");
    
    sb.append("    accountsReceivable: ").append(toIndentedString(accountsReceivable)).append("\n");
    sb.append("    accountsPayable: ").append(toIndentedString(accountsPayable)).append("\n");
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

