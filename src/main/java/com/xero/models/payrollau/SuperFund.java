/*
 * Xero Payroll AU
 * This is the Xero Payroll API for orgs in Australia region.
 *
 * The version of the OpenAPI document: 2.0.5
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.xero.models.payrollau;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.xero.models.payrollau.SuperFundType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import java.io.IOException;

import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import com.xero.api.StringUtil;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * SuperFund
 */

public class SuperFund {
  StringUtil util = new StringUtil();

  
  @JsonProperty("SuperFundID")
  private UUID superFundID;

  
  @JsonProperty("Type")
  private SuperFundType type;

  
  @JsonProperty("Name")
  private String name;

  
  @JsonProperty("ABN")
  private String ABN;

  
  @JsonProperty("BSB")
  private String BSB;

  
  @JsonProperty("AccountNumber")
  private String accountNumber;

  
  @JsonProperty("AccountName")
  private String accountName;

  
  @JsonProperty("ElectronicServiceAddress")
  private String electronicServiceAddress;

  
  @JsonProperty("EmployerNumber")
  private String employerNumber;

  
  @JsonProperty("SPIN")
  private String SPIN;

  
  @JsonProperty("USI")
  private String USI;

  
  @JsonProperty("UpdatedDateUTC")
  private String updatedDateUTC;
  public SuperFund superFundID(UUID superFundID) {
    this.superFundID = superFundID;
    return this;
  }

   /**
   * Xero identifier for a super fund
   * @return superFundID
  **/
  @ApiModelProperty(example = "bfac31bd-ea62-4fc8-a5e7-7965d9504b15", value = "Xero identifier for a super fund")
  public UUID getSuperFundID() {
    return superFundID;
  }

  public void setSuperFundID(UUID superFundID) {
    this.superFundID = superFundID;
  }

  public SuperFund type(SuperFundType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")
  public SuperFundType getType() {
    return type;
  }

  public void setType(SuperFundType type) {
    this.type = type;
  }

  public SuperFund name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the super fund
   * @return name
  **/
  @ApiModelProperty(example = "MLC Navigator Retirement Plan - Superannuation Service (including Series 2) (MLC Superannuation Fund)", value = "Name of the super fund")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SuperFund ABN(String ABN) {
    this.ABN = ABN;
    return this;
  }

   /**
   * ABN of the self managed super fund
   * @return ABN
  **/
  @ApiModelProperty(example = "40022701955", value = "ABN of the self managed super fund")
  public String getABN() {
    return ABN;
  }

  public void setABN(String ABN) {
    this.ABN = ABN;
  }

  public SuperFund BSB(String BSB) {
    this.BSB = BSB;
    return this;
  }

   /**
   * BSB of the self managed super fund
   * @return BSB
  **/
  @ApiModelProperty(example = "234324", value = "BSB of the self managed super fund")
  public String getBSB() {
    return BSB;
  }

  public void setBSB(String BSB) {
    this.BSB = BSB;
  }

  public SuperFund accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * The account number for the self managed super fund.
   * @return accountNumber
  **/
  @ApiModelProperty(example = "234234234", value = "The account number for the self managed super fund.")
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public SuperFund accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

   /**
   * The account name for the self managed super fund.
   * @return accountName
  **/
  @ApiModelProperty(example = "Money account", value = "The account name for the self managed super fund.")
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public SuperFund electronicServiceAddress(String electronicServiceAddress) {
    this.electronicServiceAddress = electronicServiceAddress;
    return this;
  }

   /**
   * The electronic service address for the self managed super fund.
   * @return electronicServiceAddress
  **/
  @ApiModelProperty(example = "12345678", value = "The electronic service address for the self managed super fund.")
  public String getElectronicServiceAddress() {
    return electronicServiceAddress;
  }

  public void setElectronicServiceAddress(String electronicServiceAddress) {
    this.electronicServiceAddress = electronicServiceAddress;
  }

  public SuperFund employerNumber(String employerNumber) {
    this.employerNumber = employerNumber;
    return this;
  }

   /**
   * Some funds assign a unique number to each employer
   * @return employerNumber
  **/
  @ApiModelProperty(example = "324324", value = "Some funds assign a unique number to each employer")
  public String getEmployerNumber() {
    return employerNumber;
  }

  public void setEmployerNumber(String employerNumber) {
    this.employerNumber = employerNumber;
  }

  public SuperFund SPIN(String SPIN) {
    this.SPIN = SPIN;
    return this;
  }

   /**
   * The SPIN of the Regulated SuperFund. This field has been deprecated. It will only be present for legacy superfunds. New superfunds will not have a SPIN value. The USI field should be used instead of SPIN.
   * @return SPIN
  **/
  @ApiModelProperty(example = "4545445454", value = "The SPIN of the Regulated SuperFund. This field has been deprecated. It will only be present for legacy superfunds. New superfunds will not have a SPIN value. The USI field should be used instead of SPIN.")
  public String getSPIN() {
    return SPIN;
  }

  public void setSPIN(String SPIN) {
    this.SPIN = SPIN;
  }

  public SuperFund USI(String USI) {
    this.USI = USI;
    return this;
  }

   /**
   * The USI of the Regulated SuperFund
   * @return USI
  **/
  @ApiModelProperty(example = "40022701955001", value = "The USI of the Regulated SuperFund")
  public String getUSI() {
    return USI;
  }

  public void setUSI(String USI) {
    this.USI = USI;
  }

   /**
   * Last modified timestamp
   * @return updatedDateUTC
  **/
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuperFund superFund = (SuperFund) o;
    return Objects.equals(this.superFundID, superFund.superFundID) &&
        Objects.equals(this.type, superFund.type) &&
        Objects.equals(this.name, superFund.name) &&
        Objects.equals(this.ABN, superFund.ABN) &&
        Objects.equals(this.BSB, superFund.BSB) &&
        Objects.equals(this.accountNumber, superFund.accountNumber) &&
        Objects.equals(this.accountName, superFund.accountName) &&
        Objects.equals(this.electronicServiceAddress, superFund.electronicServiceAddress) &&
        Objects.equals(this.employerNumber, superFund.employerNumber) &&
        Objects.equals(this.SPIN, superFund.SPIN) &&
        Objects.equals(this.USI, superFund.USI) &&
        Objects.equals(this.updatedDateUTC, superFund.updatedDateUTC);
  }

  @Override
  public int hashCode() {
    return Objects.hash(superFundID, type, name, ABN, BSB, accountNumber, accountName, electronicServiceAddress, employerNumber, SPIN, USI, updatedDateUTC);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuperFund {\n");
    sb.append("    superFundID: ").append(toIndentedString(superFundID)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ABN: ").append(toIndentedString(ABN)).append("\n");
    sb.append("    BSB: ").append(toIndentedString(BSB)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    electronicServiceAddress: ").append(toIndentedString(electronicServiceAddress)).append("\n");
    sb.append("    employerNumber: ").append(toIndentedString(employerNumber)).append("\n");
    sb.append("    SPIN: ").append(toIndentedString(SPIN)).append("\n");
    sb.append("    USI: ").append(toIndentedString(USI)).append("\n");
    sb.append("    updatedDateUTC: ").append(toIndentedString(updatedDateUTC)).append("\n");
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

