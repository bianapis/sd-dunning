/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface DunningApiService {

	ContactWithIds executePost(Contact request);
	
	ContactWithIds executePut(String crReferenceId, Contact request);
	
	RecordResponse record(String crReferenceId, RecordRequest request);
	
	ContactWithIds requestPost(Contact request);
	
	ContactWithIds requestPut(String crReferenceId, Contact request);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	DunningProcedureWithIds retrieve(String crReferenceId);
	
	Analysis retrieveAnalysis(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveBQs();
	
	ContactWithIds retrieveContacts(String crReferenceId, String bqReferenceId);
	
	Record retrieveRecords(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds();
	
	DunningProcedureWithIds update(String crReferenceId, DunningProcedure request);
	
}
