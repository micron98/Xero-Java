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
import java.io.IOException;
import java.util.Objects;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/** ReimbursementType */
public class ReimbursementType {
  StringUtil util = new StringUtil();

  @JsonProperty("Name")
  private String name;

  @JsonProperty("AccountCode")
  private String accountCode;

  @JsonProperty("ReimbursementTypeID")
  private UUID reimbursementTypeID;

  @JsonProperty("UpdatedDateUTC")
  private String updatedDateUTC;

  @JsonProperty("CurrentRecord")
  private Boolean currentRecord;

  public ReimbursementType name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the earnings rate (max length &#x3D; 100)
   *
   * @return name
   */
  @ApiModelProperty(example = "PTO", value = "Name of the earnings rate (max length = 100)")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ReimbursementType accountCode(String accountCode) {
    this.accountCode = accountCode;
    return this;
  }

  /**
   * See Accounts
   *
   * @return accountCode
   */
  @ApiModelProperty(example = "720", value = "See Accounts")
  public String getAccountCode() {
    return accountCode;
  }

  public void setAccountCode(String accountCode) {
    this.accountCode = accountCode;
  }

  public ReimbursementType reimbursementTypeID(UUID reimbursementTypeID) {
    this.reimbursementTypeID = reimbursementTypeID;
    return this;
  }

  /**
   * Xero identifier
   *
   * @return reimbursementTypeID
   */
  @ApiModelProperty(example = "e0eb6747-7c17-4075-b804-989f8d4e5d39", value = "Xero identifier")
  public UUID getReimbursementTypeID() {
    return reimbursementTypeID;
  }

  public void setReimbursementTypeID(UUID reimbursementTypeID) {
    this.reimbursementTypeID = reimbursementTypeID;
  }

  /**
   * Last modified timestamp
   *
   * @return updatedDateUTC
   */
  @ApiModelProperty(example = "/Date(1583967733054+0000)/", value = "Last modified timestamp")
  public String getUpdatedDateUTC() {
    return updatedDateUTC;
  }

  public OffsetDateTime getUpdatedDateUTCAsDate() {
    if (this.updatedDateUTC != null) {
      try {
        return util.convertStringToOffsetDateTime(this.updatedDateUTC);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return null;
  }

  public ReimbursementType currentRecord(Boolean currentRecord) {
    this.currentRecord = currentRecord;
    return this;
  }

  /**
   * Is the current record
   *
   * @return currentRecord
   */
  @ApiModelProperty(example = "true", value = "Is the current record")
  public Boolean getCurrentRecord() {
    return currentRecord;
  }

  public void setCurrentRecord(Boolean currentRecord) {
    this.currentRecord = currentRecord;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReimbursementType reimbursementType = (ReimbursementType) o;
    return Objects.equals(this.name, reimbursementType.name)
        && Objects.equals(this.accountCode, reimbursementType.accountCode)
        && Objects.equals(this.reimbursementTypeID, reimbursementType.reimbursementTypeID)
        && Objects.equals(this.updatedDateUTC, reimbursementType.updatedDateUTC)
        && Objects.equals(this.currentRecord, reimbursementType.currentRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, accountCode, reimbursementTypeID, updatedDateUTC, currentRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReimbursementType {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    accountCode: ").append(toIndentedString(accountCode)).append("\n");
    sb.append("    reimbursementTypeID: ")
        .append(toIndentedString(reimbursementTypeID))
        .append("\n");
    sb.append("    updatedDateUTC: ").append(toIndentedString(updatedDateUTC)).append("\n");
    sb.append("    currentRecord: ").append(toIndentedString(currentRecord)).append("\n");
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
