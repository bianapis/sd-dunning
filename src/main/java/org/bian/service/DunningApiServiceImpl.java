/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class DunningApiServiceImpl implements DunningApiService {

	public ContactWithIds executePost(Contact request){
		return JsonReader.read("executePost-ContactWithIds.json",new TypeReference<ContactWithIds>(){});
	}
	
	public ContactWithIds executePut(String crReferenceId, Contact request){
		return JsonReader.read("executePut-ContactWithIds.json",new TypeReference<ContactWithIds>(){});
	}
	
	public RecordResponse record(String crReferenceId, RecordRequest request){
		return JsonReader.read("record-RecordResponse.json",new TypeReference<RecordResponse>(){});
	}
	
	public ContactWithIds requestPost(Contact request){
		return JsonReader.read("requestPost-ContactWithIds.json",new TypeReference<ContactWithIds>(){});
	}
	
	public ContactWithIds requestPut(String crReferenceId, Contact request){
		return JsonReader.read("requestPut-ContactWithIds.json",new TypeReference<ContactWithIds>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public DunningProcedureWithIds retrieve(String crReferenceId){
		return JsonReader.read("retrieve-DunningProcedureWithIds.json",new TypeReference<DunningProcedureWithIds>(){});
	}
	
	public Analysis retrieveAnalysis(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-Analysis.json",new TypeReference<Analysis>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public ContactWithIds retrieveContacts(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ContactWithIds.json",new TypeReference<ContactWithIds>(){});
	}
	
	public Record retrieveRecords(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-Record.json",new TypeReference<Record>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public DunningProcedureWithIds update(String crReferenceId, DunningProcedure request){
		return JsonReader.read("update-DunningProcedureWithIds.json",new TypeReference<DunningProcedureWithIds>(){});
	}
	
}
