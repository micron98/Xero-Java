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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.UUID;

/**
 * Attachment
 */

public class Attachment {
  @JsonProperty("AttachmentID")
  private UUID attachmentID = null;

  @JsonProperty("FileName")
  private String fileName = null;

  @JsonProperty("Url")
  private String url = null;

  @JsonProperty("MimeType")
  private String mimeType = null;

  @JsonProperty("ContentLength")
  private BigDecimal contentLength = null;

  @JsonProperty("IncludeOnline")
  private Boolean includeOnline = null;

  public Attachment attachmentID(UUID attachmentID) {
    this.attachmentID = attachmentID;
    return this;
  }

   /**
   * Unique ID for the file
   * @return attachmentID
  **/
  @ApiModelProperty(value = "Unique ID for the file")
  public UUID getAttachmentID() {
    return attachmentID;
  }

  public void setAttachmentID(UUID attachmentID) {
    this.attachmentID = attachmentID;
  }

  public Attachment fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * Name of the file
   * @return fileName
  **/
  @ApiModelProperty(value = "Name of the file")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public Attachment url(String url) {
    this.url = url;
    return this;
  }

   /**
   * URL to the file on xero.com
   * @return url
  **/
  @ApiModelProperty(value = "URL to the file on xero.com")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Attachment mimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

   /**
   * Type of file
   * @return mimeType
  **/
  @ApiModelProperty(value = "Type of file")
  public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  public Attachment contentLength(BigDecimal contentLength) {
    this.contentLength = contentLength;
    return this;
  }

   /**
   * Length of the file content
   * @return contentLength
  **/
  @ApiModelProperty(value = "Length of the file content")
  public BigDecimal getContentLength() {
    return contentLength;
  }

  public void setContentLength(BigDecimal contentLength) {
    this.contentLength = contentLength;
  }

  public Attachment includeOnline(Boolean includeOnline) {
    this.includeOnline = includeOnline;
    return this;
  }

   /**
   * Include the file with the online invoice
   * @return includeOnline
  **/
  @ApiModelProperty(value = "Include the file with the online invoice")
  public Boolean getIncludeOnline() {
    return includeOnline;
  }

  public void setIncludeOnline(Boolean includeOnline) {
    this.includeOnline = includeOnline;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Attachment attachment = (Attachment) o;
    return Objects.equals(this.attachmentID, attachment.attachmentID) &&
        Objects.equals(this.fileName, attachment.fileName) &&
        Objects.equals(this.url, attachment.url) &&
        Objects.equals(this.mimeType, attachment.mimeType) &&
        Objects.equals(this.contentLength, attachment.contentLength) &&
        Objects.equals(this.includeOnline, attachment.includeOnline);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachmentID, fileName, url, mimeType, contentLength, includeOnline);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Attachment {\n");
    
    sb.append("    attachmentID: ").append(toIndentedString(attachmentID)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    contentLength: ").append(toIndentedString(contentLength)).append("\n");
    sb.append("    includeOnline: ").append(toIndentedString(includeOnline)).append("\n");
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

