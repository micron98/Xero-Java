/*
 * Xero oAuth 2 identity service
 * This specifing endpoints related to managing authentication tokens and identity for Xero API
 *
 * The version of the OpenAPI document: 2.3.3
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.identity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** RefreshToken */
public class RefreshToken {
  StringUtil util = new StringUtil();

  @JsonProperty("grant_type")
  private String grantType;

  @JsonProperty("refresh_token")
  private String refreshToken;

  @JsonProperty("client_id")
  private String clientId;

  @JsonProperty("client_secret")
  private String clientSecret;

  public RefreshToken grantType(String grantType) {
    this.grantType = grantType;
    return this;
  }

  /**
   * Xero grant type
   *
   * @return grantType
   */
  @ApiModelProperty(value = "Xero grant type")
  public String getGrantType() {
    return grantType;
  }

  public void setGrantType(String grantType) {
    this.grantType = grantType;
  }

  public RefreshToken refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

  /**
   * refresh token provided during authentication flow
   *
   * @return refreshToken
   */
  @ApiModelProperty(value = "refresh token provided during authentication flow")
  public String getRefreshToken() {
    return refreshToken;
  }

  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }

  public RefreshToken clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * client id for Xero app
   *
   * @return clientId
   */
  @ApiModelProperty(value = "client id for Xero app")
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public RefreshToken clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

  /**
   * client secret for Xero app 2
   *
   * @return clientSecret
   */
  @ApiModelProperty(value = "client secret for Xero app 2")
  public String getClientSecret() {
    return clientSecret;
  }

  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefreshToken refreshToken = (RefreshToken) o;
    return Objects.equals(this.grantType, refreshToken.grantType)
        && Objects.equals(this.refreshToken, refreshToken.refreshToken)
        && Objects.equals(this.clientId, refreshToken.clientId)
        && Objects.equals(this.clientSecret, refreshToken.clientSecret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grantType, refreshToken, clientId, clientSecret);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefreshToken {\n");
    sb.append("    grantType: ").append(toIndentedString(grantType)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
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
