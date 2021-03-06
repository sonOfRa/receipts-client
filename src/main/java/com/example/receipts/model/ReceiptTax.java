/*
 * Example API for receipts
 * API for generating receipts and mailing them to users
 *
 * OpenAPI spec version: 1.0.0-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.example.receipts.model;

import java.util.Objects;
import java.util.Arrays;
import com.example.receipts.model.ReceiptTaxItem;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/**
 * ReceiptTax
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-11-26T15:28:50.841+01:00[Europe/Berlin]")
public class ReceiptTax {
  @SerializedName("netSum")
  private BigDecimal netSum = null;

  @SerializedName("taxSum")
  private BigDecimal taxSum = null;

  @SerializedName("bruttoSum")
  private BigDecimal bruttoSum = null;

  @SerializedName("receiptTaxItems")
  private List<ReceiptTaxItem> receiptTaxItems = new ArrayList<ReceiptTaxItem>();

  public ReceiptTax netSum(BigDecimal netSum) {
    this.netSum = netSum;
    return this;
  }

   /**
   * Sum of Receipt without Taxes
   * @return netSum
  **/
  @Schema(required = true, description = "Sum of Receipt without Taxes")
  public BigDecimal getNetSum() {
    return netSum;
  }

  public void setNetSum(BigDecimal netSum) {
    this.netSum = netSum;
  }

  public ReceiptTax taxSum(BigDecimal taxSum) {
    this.taxSum = taxSum;
    return this;
  }

   /**
   * Sum of Taxes of the Receipt
   * @return taxSum
  **/
  @Schema(required = true, description = "Sum of Taxes of the Receipt")
  public BigDecimal getTaxSum() {
    return taxSum;
  }

  public void setTaxSum(BigDecimal taxSum) {
    this.taxSum = taxSum;
  }

  public ReceiptTax bruttoSum(BigDecimal bruttoSum) {
    this.bruttoSum = bruttoSum;
    return this;
  }

   /**
   * Sum of Receipt including Taxes
   * @return bruttoSum
  **/
  @Schema(required = true, description = "Sum of Receipt including Taxes")
  public BigDecimal getBruttoSum() {
    return bruttoSum;
  }

  public void setBruttoSum(BigDecimal bruttoSum) {
    this.bruttoSum = bruttoSum;
  }

  public ReceiptTax receiptTaxItems(List<ReceiptTaxItem> receiptTaxItems) {
    this.receiptTaxItems = receiptTaxItems;
    return this;
  }

  public ReceiptTax addReceiptTaxItemsItem(ReceiptTaxItem receiptTaxItemsItem) {
    this.receiptTaxItems.add(receiptTaxItemsItem);
    return this;
  }

   /**
   * Get receiptTaxItems
   * @return receiptTaxItems
  **/
  @Schema(required = true, description = "")
  public List<ReceiptTaxItem> getReceiptTaxItems() {
    return receiptTaxItems;
  }

  public void setReceiptTaxItems(List<ReceiptTaxItem> receiptTaxItems) {
    this.receiptTaxItems = receiptTaxItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReceiptTax receiptTax = (ReceiptTax) o;
    return Objects.equals(this.netSum, receiptTax.netSum) &&
        Objects.equals(this.taxSum, receiptTax.taxSum) &&
        Objects.equals(this.bruttoSum, receiptTax.bruttoSum) &&
        Objects.equals(this.receiptTaxItems, receiptTax.receiptTaxItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(netSum, taxSum, bruttoSum, receiptTaxItems);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReceiptTax {\n");
    
    sb.append("    netSum: ").append(toIndentedString(netSum)).append("\n");
    sb.append("    taxSum: ").append(toIndentedString(taxSum)).append("\n");
    sb.append("    bruttoSum: ").append(toIndentedString(bruttoSum)).append("\n");
    sb.append("    receiptTaxItems: ").append(toIndentedString(receiptTaxItems)).append("\n");
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
