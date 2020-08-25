/*
 * Xero Payroll AU
 * This is the Xero Payroll API for orgs in Australia region.
 *
 * The version of the OpenAPI document: 2.2.13
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.payrollau;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import java.util.UUID;

/** Account */
public class Account {
  StringUtil util = new StringUtil();

  @JsonProperty("AccountID")
  private UUID accountID;

  @JsonProperty("Type")
  private AccountType type;

  @JsonProperty("Code")
  private String code;

  @JsonProperty("Name")
  private String name;

  public Account accountID(UUID accountID) {
    this.accountID = accountID;
    return this;
  }

  /**
   * Xero identifier for accounts
   *
   * @return accountID
   */
  @ApiModelProperty(
      example = "c56b19ef-75bf-45e8-98a4-e699a96609f7",
      value = "Xero identifier for accounts")
  public UUID getAccountID() {
    return accountID;
  }

  public void setAccountID(UUID accountID) {
    this.accountID = accountID;
  }

  public Account type(AccountType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   *
   * @return type
   */
  @ApiModelProperty(value = "")
  public AccountType getType() {
    return type;
  }

  public void setType(AccountType type) {
    this.type = type;
  }

  public Account code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Customer defined account code
   *
   * @return code
   */
  @ApiModelProperty(example = "420", value = "Customer defined account code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Account name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of account
   *
   * @return name
   */
  @ApiModelProperty(example = "General expenses", value = "Name of account")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(this.accountID, account.accountID)
        && Objects.equals(this.type, account.type)
        && Objects.equals(this.code, account.code)
        && Objects.equals(this.name, account.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountID, type, code, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    sb.append("    accountID: ").append(toIndentedString(accountID)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
