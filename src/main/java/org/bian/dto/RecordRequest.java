package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * RecordRequest
 */
public class RecordRequest   {
  private String recordingRecordType = null;

  private Object recordingRecord = null;

  private String recordingRecordDatetime = null;

  private String employeebusinessUnitReference = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text     
   * @return recordingRecordType
  **/

  public String getRecordingRecordType() {
    return recordingRecordType;
  }

  public void setRecordingRecordType(String recordingRecordType) {
    this.recordingRecordType = recordingRecordType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary     
   * @return recordingRecord
  **/

  public Object getRecordingRecord() {
    return recordingRecord;
  }

  public void setRecordingRecord(Object recordingRecord) {
    this.recordingRecord = recordingRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime     
   * @return recordingRecordDatetime
  **/

  public String getRecordingRecordDatetime() {
    return recordingRecordDatetime;
  }

  public void setRecordingRecordDatetime(String recordingRecordDatetime) {
    this.recordingRecordDatetime = recordingRecordDatetime;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier     
   * @return employeebusinessUnitReference
  **/

  public String getEmployeebusinessUnitReference() {
    return employeebusinessUnitReference;
  }

  public void setEmployeebusinessUnitReference(String employeebusinessUnitReference) {
    this.employeebusinessUnitReference = employeebusinessUnitReference;
  }


}

