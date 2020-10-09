/*
 * Xero Payroll UK
 * This is the Xero Payroll API for orgs in the UK region.
 *
 * The version of the OpenAPI document: 2.3.3
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.payrolluk;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import java.util.UUID;

/** Benefit */
public class Benefit {
  StringUtil util = new StringUtil();

  @JsonProperty("id")
  private UUID id;

  @JsonProperty("name")
  private String name;
  /** Category type of the employer pension */
  public enum CategoryEnum {
    STAKEHOLDERPENSION("StakeholderPension"),

    OTHER("Other");

    private String value;

    CategoryEnum(String value) {
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
    public static CategoryEnum fromValue(String value) {
      for (CategoryEnum b : CategoryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("category")
  private CategoryEnum category;

  @JsonProperty("liabilityAccountId")
  private UUID liabilityAccountId;

  @JsonProperty("expenseAccountId")
  private UUID expenseAccountId;

  @JsonProperty("standardAmount")
  private Double standardAmount;

  @JsonProperty("percentage")
  private Double percentage;
  /** Calculation Type of the employer pension (FixedAmount or PercentageOfGross). */
  public enum CalculationTypeEnum {
    FIXEDAMOUNT("FixedAmount"),

    PERCENTAGEOFGROSS("PercentageOfGross");

    private String value;

    CalculationTypeEnum(String value) {
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
    public static CalculationTypeEnum fromValue(String value) {
      for (CalculationTypeEnum b : CalculationTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("calculationType")
  private CalculationTypeEnum calculationType;

  @JsonProperty("currentRecord")
  private Boolean currentRecord;

  @JsonProperty("subjectToNIC")
  private Boolean subjectToNIC;

  @JsonProperty("subjectToPension")
  private Boolean subjectToPension;

  @JsonProperty("subjectToTax")
  private Boolean subjectToTax;

  @JsonProperty("isCalculatingOnQualifyingEarnings")
  private Boolean isCalculatingOnQualifyingEarnings;

  @JsonProperty("showBalanceToEmployee")
  private Boolean showBalanceToEmployee;

  public Benefit id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * unique identifier in Xero
   *
   * @return id
   */
  @ApiModelProperty(value = "unique identifier in Xero")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Benefit name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the employer pension
   *
   * @return name
   */
  @ApiModelProperty(required = true, value = "Name of the employer pension")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Benefit category(CategoryEnum category) {
    this.category = category;
    return this;
  }

  /**
   * Category type of the employer pension
   *
   * @return category
   */
  @ApiModelProperty(required = true, value = "Category type of the employer pension")
  public CategoryEnum getCategory() {
    return category;
  }

  public void setCategory(CategoryEnum category) {
    this.category = category;
  }

  public Benefit liabilityAccountId(UUID liabilityAccountId) {
    this.liabilityAccountId = liabilityAccountId;
    return this;
  }

  /**
   * Xero identifier for Liability Account
   *
   * @return liabilityAccountId
   */
  @ApiModelProperty(required = true, value = "Xero identifier for Liability Account")
  public UUID getLiabilityAccountId() {
    return liabilityAccountId;
  }

  public void setLiabilityAccountId(UUID liabilityAccountId) {
    this.liabilityAccountId = liabilityAccountId;
  }

  public Benefit expenseAccountId(UUID expenseAccountId) {
    this.expenseAccountId = expenseAccountId;
    return this;
  }

  /**
   * Xero identifier for Expense Account
   *
   * @return expenseAccountId
   */
  @ApiModelProperty(required = true, value = "Xero identifier for Expense Account")
  public UUID getExpenseAccountId() {
    return expenseAccountId;
  }

  public void setExpenseAccountId(UUID expenseAccountId) {
    this.expenseAccountId = expenseAccountId;
  }

  public Benefit standardAmount(Double standardAmount) {
    this.standardAmount = standardAmount;
    return this;
  }

  /**
   * Standard amount of the employer pension
   *
   * @return standardAmount
   */
  @ApiModelProperty(value = "Standard amount of the employer pension")
  public Double getStandardAmount() {
    return standardAmount;
  }

  public void setStandardAmount(Double standardAmount) {
    this.standardAmount = standardAmount;
  }

  public Benefit percentage(Double percentage) {
    this.percentage = percentage;
    return this;
  }

  /**
   * Percentage of gross of the employer pension
   *
   * @return percentage
   */
  @ApiModelProperty(required = true, value = "Percentage of gross of the employer pension")
  public Double getPercentage() {
    return percentage;
  }

  public void setPercentage(Double percentage) {
    this.percentage = percentage;
  }

  public Benefit calculationType(CalculationTypeEnum calculationType) {
    this.calculationType = calculationType;
    return this;
  }

  /**
   * Calculation Type of the employer pension (FixedAmount or PercentageOfGross).
   *
   * @return calculationType
   */
  @ApiModelProperty(
      required = true,
      value = "Calculation Type of the employer pension (FixedAmount or PercentageOfGross).")
  public CalculationTypeEnum getCalculationType() {
    return calculationType;
  }

  public void setCalculationType(CalculationTypeEnum calculationType) {
    this.calculationType = calculationType;
  }

  public Benefit currentRecord(Boolean currentRecord) {
    this.currentRecord = currentRecord;
    return this;
  }

  /**
   * Identifier of a record is active or not.
   *
   * @return currentRecord
   */
  @ApiModelProperty(value = "Identifier of a record is active or not.")
  public Boolean getCurrentRecord() {
    return currentRecord;
  }

  public void setCurrentRecord(Boolean currentRecord) {
    this.currentRecord = currentRecord;
  }

  public Benefit subjectToNIC(Boolean subjectToNIC) {
    this.subjectToNIC = subjectToNIC;
    return this;
  }

  /**
   * Identifier of subject To NIC
   *
   * @return subjectToNIC
   */
  @ApiModelProperty(value = "Identifier of subject To NIC")
  public Boolean getSubjectToNIC() {
    return subjectToNIC;
  }

  public void setSubjectToNIC(Boolean subjectToNIC) {
    this.subjectToNIC = subjectToNIC;
  }

  public Benefit subjectToPension(Boolean subjectToPension) {
    this.subjectToPension = subjectToPension;
    return this;
  }

  /**
   * Identifier of subject To pension
   *
   * @return subjectToPension
   */
  @ApiModelProperty(value = "Identifier of subject To pension")
  public Boolean getSubjectToPension() {
    return subjectToPension;
  }

  public void setSubjectToPension(Boolean subjectToPension) {
    this.subjectToPension = subjectToPension;
  }

  public Benefit subjectToTax(Boolean subjectToTax) {
    this.subjectToTax = subjectToTax;
    return this;
  }

  /**
   * Identifier of subject To Tax
   *
   * @return subjectToTax
   */
  @ApiModelProperty(value = "Identifier of subject To Tax")
  public Boolean getSubjectToTax() {
    return subjectToTax;
  }

  public void setSubjectToTax(Boolean subjectToTax) {
    this.subjectToTax = subjectToTax;
  }

  public Benefit isCalculatingOnQualifyingEarnings(Boolean isCalculatingOnQualifyingEarnings) {
    this.isCalculatingOnQualifyingEarnings = isCalculatingOnQualifyingEarnings;
    return this;
  }

  /**
   * Identifier of calculating on qualifying earnings
   *
   * @return isCalculatingOnQualifyingEarnings
   */
  @ApiModelProperty(value = "Identifier of calculating on qualifying earnings")
  public Boolean getIsCalculatingOnQualifyingEarnings() {
    return isCalculatingOnQualifyingEarnings;
  }

  public void setIsCalculatingOnQualifyingEarnings(Boolean isCalculatingOnQualifyingEarnings) {
    this.isCalculatingOnQualifyingEarnings = isCalculatingOnQualifyingEarnings;
  }

  public Benefit showBalanceToEmployee(Boolean showBalanceToEmployee) {
    this.showBalanceToEmployee = showBalanceToEmployee;
    return this;
  }

  /**
   * display the balance to employee
   *
   * @return showBalanceToEmployee
   */
  @ApiModelProperty(value = "display the balance to employee")
  public Boolean getShowBalanceToEmployee() {
    return showBalanceToEmployee;
  }

  public void setShowBalanceToEmployee(Boolean showBalanceToEmployee) {
    this.showBalanceToEmployee = showBalanceToEmployee;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Benefit benefit = (Benefit) o;
    return Objects.equals(this.id, benefit.id)
        && Objects.equals(this.name, benefit.name)
        && Objects.equals(this.category, benefit.category)
        && Objects.equals(this.liabilityAccountId, benefit.liabilityAccountId)
        && Objects.equals(this.expenseAccountId, benefit.expenseAccountId)
        && Objects.equals(this.standardAmount, benefit.standardAmount)
        && Objects.equals(this.percentage, benefit.percentage)
        && Objects.equals(this.calculationType, benefit.calculationType)
        && Objects.equals(this.currentRecord, benefit.currentRecord)
        && Objects.equals(this.subjectToNIC, benefit.subjectToNIC)
        && Objects.equals(this.subjectToPension, benefit.subjectToPension)
        && Objects.equals(this.subjectToTax, benefit.subjectToTax)
        && Objects.equals(
            this.isCalculatingOnQualifyingEarnings, benefit.isCalculatingOnQualifyingEarnings)
        && Objects.equals(this.showBalanceToEmployee, benefit.showBalanceToEmployee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        id,
        name,
        category,
        liabilityAccountId,
        expenseAccountId,
        standardAmount,
        percentage,
        calculationType,
        currentRecord,
        subjectToNIC,
        subjectToPension,
        subjectToTax,
        isCalculatingOnQualifyingEarnings,
        showBalanceToEmployee);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Benefit {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    liabilityAccountId: ").append(toIndentedString(liabilityAccountId)).append("\n");
    sb.append("    expenseAccountId: ").append(toIndentedString(expenseAccountId)).append("\n");
    sb.append("    standardAmount: ").append(toIndentedString(standardAmount)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    calculationType: ").append(toIndentedString(calculationType)).append("\n");
    sb.append("    currentRecord: ").append(toIndentedString(currentRecord)).append("\n");
    sb.append("    subjectToNIC: ").append(toIndentedString(subjectToNIC)).append("\n");
    sb.append("    subjectToPension: ").append(toIndentedString(subjectToPension)).append("\n");
    sb.append("    subjectToTax: ").append(toIndentedString(subjectToTax)).append("\n");
    sb.append("    isCalculatingOnQualifyingEarnings: ")
        .append(toIndentedString(isCalculatingOnQualifyingEarnings))
        .append("\n");
    sb.append("    showBalanceToEmployee: ")
        .append(toIndentedString(showBalanceToEmployee))
        .append("\n");
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
