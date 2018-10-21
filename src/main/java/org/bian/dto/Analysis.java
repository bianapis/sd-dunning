package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * Analysis
 */
public class Analysis   {
  private String dunningReference = null;

  private String dunningAnalysisReference = null;

  private String productInstanceReference = null;

  private String customerReference = null;

  private String bankBranchlocationReference = null;

  private String involvedPartyReference = null;

  private String involvedPartyObligationentitlement = null;

  private String partyReference = null;

  private String loanType = null;

  private String loanAmount = null;

  private String loanCurrency = null;

  private String loanRepaymentSchedule = null;

  private String stagedRepaymentStatement = null;

  private String loanOutstandingBalance = null;

  private String loanTerminationDate = null;

  private String collateralReference = null;

  private String collateralAllocation = null;

  private String configurationoptions = null;

  private String taxReference = null;

  private String loanAccessTerms = null;

  private String loanStatus = null;

  private String stagedRepaymentTransactionReference = null;

  private String transactionPayerReference = null;

  private String transactionPayerProductInstanceReference = null;

  private String transactionPayerBankReference = null;

  private String transactionAmount = null;

  private String transactionCurrency = null;

  private String transactionValueDate = null;

  private Object dunningAnalysisRecord = null;


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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier     
   * @return bankBranchlocationReference
  **/

  public String getBankBranchlocationReference() {
    return bankBranchlocationReference;
  }

  public void setBankBranchlocationReference(String bankBranchlocationReference) {
    this.bankBranchlocationReference = bankBranchlocationReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier     
   * @return involvedPartyReference
  **/

  public String getInvolvedPartyReference() {
    return involvedPartyReference;
  }

  public void setInvolvedPartyReference(String involvedPartyReference) {
    this.involvedPartyReference = involvedPartyReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text     
   * @return involvedPartyObligationentitlement
  **/

  public String getInvolvedPartyObligationentitlement() {
    return involvedPartyObligationentitlement;
  }

  public void setInvolvedPartyObligationentitlement(String involvedPartyObligationentitlement) {
    this.involvedPartyObligationentitlement = involvedPartyObligationentitlement;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier     
   * @return partyReference
  **/

  public String getPartyReference() {
    return partyReference;
  }

  public void setPartyReference(String partyReference) {
    this.partyReference = partyReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text     
   * @return loanType
  **/

  public String getLoanType() {
    return loanType;
  }

  public void setLoanType(String loanType) {
    this.loanType = loanType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount     
   * @return loanAmount
  **/

  public String getLoanAmount() {
    return loanAmount;
  }

  public void setLoanAmount(String loanAmount) {
    this.loanAmount = loanAmount;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text     
   * @return loanCurrency
  **/

  public String getLoanCurrency() {
    return loanCurrency;
  }

  public void setLoanCurrency(String loanCurrency) {
    this.loanCurrency = loanCurrency;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime     
   * @return loanRepaymentSchedule
  **/

  public String getLoanRepaymentSchedule() {
    return loanRepaymentSchedule;
  }

  public void setLoanRepaymentSchedule(String loanRepaymentSchedule) {
    this.loanRepaymentSchedule = loanRepaymentSchedule;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text     
   * @return stagedRepaymentStatement
  **/

  public String getStagedRepaymentStatement() {
    return stagedRepaymentStatement;
  }

  public void setStagedRepaymentStatement(String stagedRepaymentStatement) {
    this.stagedRepaymentStatement = stagedRepaymentStatement;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount     
   * @return loanOutstandingBalance
  **/

  public String getLoanOutstandingBalance() {
    return loanOutstandingBalance;
  }

  public void setLoanOutstandingBalance(String loanOutstandingBalance) {
    this.loanOutstandingBalance = loanOutstandingBalance;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Date     
   * @return loanTerminationDate
  **/

  public String getLoanTerminationDate() {
    return loanTerminationDate;
  }

  public void setLoanTerminationDate(String loanTerminationDate) {
    this.loanTerminationDate = loanTerminationDate;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier     
   * @return collateralReference
  **/

  public String getCollateralReference() {
    return collateralReference;
  }

  public void setCollateralReference(String collateralReference) {
    this.collateralReference = collateralReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Name    
   * @return collateralAllocation
  **/

  public String getCollateralAllocation() {
    return collateralAllocation;
  }

  public void setCollateralAllocation(String collateralAllocation) {
    this.collateralAllocation = collateralAllocation;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Name     
   * @return configurationoptions
  **/

  public String getConfigurationoptions() {
    return configurationoptions;
  }

  public void setConfigurationoptions(String configurationoptions) {
    this.configurationoptions = configurationoptions;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier     
   * @return taxReference
  **/

  public String getTaxReference() {
    return taxReference;
  }

  public void setTaxReference(String taxReference) {
    this.taxReference = taxReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text     
   * @return loanAccessTerms
  **/

  public String getLoanAccessTerms() {
    return loanAccessTerms;
  }

  public void setLoanAccessTerms(String loanAccessTerms) {
    this.loanAccessTerms = loanAccessTerms;
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


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier     
   * @return stagedRepaymentTransactionReference
  **/

  public String getStagedRepaymentTransactionReference() {
    return stagedRepaymentTransactionReference;
  }

  public void setStagedRepaymentTransactionReference(String stagedRepaymentTransactionReference) {
    this.stagedRepaymentTransactionReference = stagedRepaymentTransactionReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier     
   * @return transactionPayerReference
  **/

  public String getTransactionPayerReference() {
    return transactionPayerReference;
  }

  public void setTransactionPayerReference(String transactionPayerReference) {
    this.transactionPayerReference = transactionPayerReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier     
   * @return transactionPayerProductInstanceReference
  **/

  public String getTransactionPayerProductInstanceReference() {
    return transactionPayerProductInstanceReference;
  }

  public void setTransactionPayerProductInstanceReference(String transactionPayerProductInstanceReference) {
    this.transactionPayerProductInstanceReference = transactionPayerProductInstanceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier     
   * @return transactionPayerBankReference
  **/

  public String getTransactionPayerBankReference() {
    return transactionPayerBankReference;
  }

  public void setTransactionPayerBankReference(String transactionPayerBankReference) {
    this.transactionPayerBankReference = transactionPayerBankReference;
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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text     
   * @return transactionCurrency
  **/

  public String getTransactionCurrency() {
    return transactionCurrency;
  }

  public void setTransactionCurrency(String transactionCurrency) {
    this.transactionCurrency = transactionCurrency;
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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary     
   * @return dunningAnalysisRecord
  **/

  public Object getDunningAnalysisRecord() {
    return dunningAnalysisRecord;
  }

  public void setDunningAnalysisRecord(Object dunningAnalysisRecord) {
    this.dunningAnalysisRecord = dunningAnalysisRecord;
  }


}

