package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ContactWithIds
 */
public class ContactWithIds   {
  private String dunningReference = null;

  private String dunningContactReference = null;

  private String dunningAnalysisReference = null;

  private String productInstanceReference = null;

  private String customerReference = null;

  private String dunningContactSchedule = null;

  private String dunningMessagescript = null;

  private String dunningContactLog = null;

  private String dunningContactResult = null;

  private String paymentTransactionReference = null;

  private String transactionAmount = null;

  private String transactionValueDate = null;

  private String loanStatus = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier     
   * @return dunningReference
  **/

  public String getDunningReference() {
    return dunningReference;
  }

  public void setDunningReference(String dunningReference) {
    this.dunningReference = dunningReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier     
   * @return dunningContactReference
  **/

  public String getDunningContactReference() {
    return dunningContactReference;
  }

  public void setDunningContactReference(String dunningContactReference) {
    this.dunningContactReference = dunningContactReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier     
   * @return dunningAnalysisReference
  **/

  public String getDunningAnalysisReference() {
    return dunningAnalysisReference;
  }

  public void setDunningAnalysisReference(String dunningAnalysisReference) {
    this.dunningAnalysisReference = dunningAnalysisReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier     
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier    
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime     
   * @return dunningContactSchedule
  **/

  public String getDunningContactSchedule() {
    return dunningContactSchedule;
  }

  public void setDunningContactSchedule(String dunningContactSchedule) {
    this.dunningContactSchedule = dunningContactSchedule;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text     
   * @return dunningMessagescript
  **/

  public String getDunningMessagescript() {
    return dunningMessagescript;
  }

  public void setDunningMessagescript(String dunningMessagescript) {
    this.dunningMessagescript = dunningMessagescript;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text     
   * @return dunningContactLog
  **/

  public String getDunningContactLog() {
    return dunningContactLog;
  }

  public void setDunningContactLog(String dunningContactLog) {
    this.dunningContactLog = dunningContactLog;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text     
   * @return dunningContactResult
  **/

  public String getDunningContactResult() {
    return dunningContactResult;
  }

  public void setDunningContactResult(String dunningContactResult) {
    this.dunningContactResult = dunningContactResult;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier     
   * @return paymentTransactionReference
  **/

  public String getPaymentTransactionReference() {
    return paymentTransactionReference;
  }

  public void setPaymentTransactionReference(String paymentTransactionReference) {
    this.paymentTransactionReference = paymentTransactionReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount     
   * @return transactionAmount
  **/

  public String getTransactionAmount() {
    return transactionAmount;
  }

  public void setTransactionAmount(String transactionAmount) {
    this.transactionAmount = transactionAmount;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Date     
   * @return transactionValueDate
  **/

  public String getTransactionValueDate() {
    return transactionValueDate;
  }

  public void setTransactionValueDate(String transactionValueDate) {
    this.transactionValueDate = transactionValueDate;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text     
   * @return loanStatus
  **/

  public String getLoanStatus() {
    return loanStatus;
  }

  public void setLoanStatus(String loanStatus) {
    this.loanStatus = loanStatus;
  }


}

