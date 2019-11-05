package mt.ms.test;

import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONObject;

import mt.ms.utility.Utility;


public class Test
{

	public static void main(String[] args) throws IOException
	{
		
        //Code for reading the data from excel
		
		final String INPUT_PATH="./data/input.xlsx";
		
		int rc=Utility.getExcelRowCount(INPUT_PATH, "demographicdet");
		 
		
			 
		   for(int i=1;i<=rc;i++)
		   {
			   
			   String addrLine1=Utility.getExcelCellValue(INPUT_PATH, "demographicdet",i,1);
			   
			   
			
			   String addrLine2=Utility.getExcelCellValue(INPUT_PATH, "demographicdet",i,2);

			  
			   
			  String addrLine3=Utility.getExcelCellValue(INPUT_PATH, "demographicdet",i,3);
			  
			 
			  
			  String locationCode=Utility.getExcelCellValue(INPUT_PATH, "demographicdet",i,4);
			  
			  
			  
			  String ageval=Utility.getExcelCellValue(INPUT_PATH, "demographicdet",i,5);
			  int age = Integer.parseInt(ageval);
			  
			  
			  
			 
			   String applicantType=Utility.getExcelCellValue(INPUT_PATH, "demographicdet",i,6);
			   
			   
			   
			   String createDateTime=Utility.getExcelCellValue(INPUT_PATH, "demographicdet",i,7);
			   
			  
			   
               String createdBy=Utility.getExcelCellValue(INPUT_PATH, "demographicdet",i,8);
			   
               
			   String deletedDateTime=Utility.getExcelCellValue(INPUT_PATH, "demographicdet",i,9);
			   
			  
			   String dob=Utility.getExcelCellValue(INPUT_PATH, "demographicdet",i,10);
			   
			   
			 
               String genderCode=Utility.getExcelCellValue(INPUT_PATH, "demographicdet",i,11);
			   
              
			   String groupId=Utility.getExcelCellValue(INPUT_PATH, "demographicdet",i,12);
			   
			  
			   String isActive=Utility.getExcelCellValue(INPUT_PATH, "demographicdet",i,13);
			   
			   
               String isDeleted=Utility.getExcelCellValue(INPUT_PATH, "demographicdet",i,14);
			   
               
               String isPrimary=Utility.getExcelCellValue(INPUT_PATH, "demographicdet",i,15);
			   

               String langCode=Utility.getExcelCellValue(INPUT_PATH, "demographicdet",i,16);
               
               
               String nationalid=Utility.getExcelCellValue(INPUT_PATH, "demographicdet",i,17);
               
              
               
              String parentFullName=Utility.getExcelCellValue(INPUT_PATH, "demographicdet",i,18);
			   

              
			   String parentRefId=Utility.getExcelCellValue(INPUT_PATH, "demographicdet",i,19);
			   

               String parentRefIdType=Utility.getExcelCellValue(INPUT_PATH, "demographicdet",i,20);

               
			   String preRegistrationId=Utility.getExcelCellValue(INPUT_PATH, "demographicdet",i,21);

               
			   String statusCode=Utility.getExcelCellValue(INPUT_PATH, "demographicdet",i,22);

               
               String updateDateTime=Utility.getExcelCellValue(INPUT_PATH, "demographicdet",i,23);
               

			   String updatedBy=Utility.getExcelCellValue(INPUT_PATH, "demographicdet",i,24);
			   
			  
			   String userId=Utility.getExcelCellValue(INPUT_PATH, "demographicdet",i,25);
			   
			  
			   
               String email=Utility.getExcelCellValue(INPUT_PATH, "demographicdet",i,26);
              
               
			   String mobile=Utility.getExcelCellValue(INPUT_PATH, "demographicdet",i,27);
			   
			  
			   String familyname=Utility.getExcelCellValue(INPUT_PATH, "demographicdet",i,28);
			   
			  
               String firstname=Utility.getExcelCellValue(INPUT_PATH, "demographicdet",i,29);
               
              
			   String forename=Utility.getExcelCellValue(INPUT_PATH, "demographicdet",i,30);
			   
			  
			   String fullname=Utility.getExcelCellValue(INPUT_PATH, "demographicdet",i,31);
			   
			   
              String givenname=Utility.getExcelCellValue(INPUT_PATH, "demographicdet",i,32);

			   String lastname=Utility.getExcelCellValue(INPUT_PATH, "demographicdet",i,33);
			   

			   String middleinitial=Utility.getExcelCellValue(INPUT_PATH, "demographicdet",i,34);
			  
			   
              String middlename=Utility.getExcelCellValue(INPUT_PATH, "demographicdet",i,35);
              

			   String surname=Utility.getExcelCellValue(INPUT_PATH, "demographicdet",i,36);
			   
			   
			   String filename=Utility.getExcelCellValue(INPUT_PATH, "demographicdet",i,37);
			   
			   boolean isAct = false;

              if(isActive.equals("TRUE"))
              {
            	  isAct= true;
              }else if(isActive.equals("FALSE"))
              {
            	  isAct=false;
              }
			 
			   
			   
              boolean  isPrim = false;
			
              if(isPrimary.equals("TRUE"))
              {
            	  isPrim= true;
              }else if(isActive.equals("FALSE"))
              {
            	  isPrim=false;
              }
			 
              boolean  isDel = false;
  			
              if(isDeleted.equals("TRUE"))
              {
            	  isDel= true;
              }else if(isDeleted.equals("FALSE"))
              {
            	  isDel=false;
              }
			 
              
              
              
			   
			   //Json Object
			   
			 
		      JSONObject jo = new JSONObject(); 
		          
		        
		        
		        // for address data, first create LinkedHashMap 
		        Map addressMap = new LinkedHashMap(4); 
		        addressMap.put("addrLine1", addrLine1);
				addressMap.put("addrLine2", addrLine2);
				addressMap.put("addrLine3", addrLine3);
				addressMap.put("locationCode", locationCode);
				
				jo.put("address", addressMap);
		        
		        // putting data to JSONObject 
		        jo.put("age", age); 
		        jo.put("applicantType",applicantType); 
		        
		        
		        jo.put("createDateTime", createDateTime); 
		        jo.put("createdBy",createdBy); 
		        jo.put("deletedDateTime", deletedDateTime); 
		        jo.put("dob", dob); 
		        jo.put("genderCode", genderCode); 
		        jo.put("groupId", groupId); 
		        jo.put("isActive", isAct); 
		        jo.put("isDeleted", isDel); 
		        jo.put("isPrimary", isPrim); 
		        jo.put("langCode", langCode); 
				
		        
		        jo.put("nationalid", nationalid); 
		        jo.put("parentFullName", parentFullName); 
		        jo.put("parentRefId", parentRefId); 
		        jo.put("parentRefIdType", parentRefIdType); 
		        jo.put("preRegistrationId", preRegistrationId); 
		        jo.put("statusCode", statusCode); 
		        jo.put("updateDateTime", updateDateTime); 
		        jo.put("updatedBy", updatedBy); 
		        jo.put("userId", userId);
				
				
		        
		        //for Contact data, first create LinkedHashMap 
				
		        Map contactMap = new LinkedHashMap(2); 
		        contactMap.put("email", email); 
		        contactMap.put("mobile", mobile); 
				
		        jo.put("contact", contactMap); 
				
		       
		        
				
		        //for Name data, first create LinkedHashMap 
				
		        Map NameMap = new LinkedHashMap(9); 
		        NameMap.put("familyname", familyname); 
		        NameMap.put("firstname", firstname); 
		        NameMap.put("forename", forename); 
		        NameMap.put("fullname", fullname);  
		        NameMap.put("givenname", givenname); 
		        NameMap.put("lastname", lastname); 
		        NameMap.put("middleinitial",middleinitial); 
		        NameMap.put("middlename", middlename); 
		        NameMap.put("surname", surname); 
		        
		        
		     
		        jo.put("name", NameMap); 
				

		       //Creating Json text file
		       
		       
		    	   FileWriter file = new FileWriter("d:\\"+filename+".json");
		           file.write(jo.toJSONString());
		           file.flush();

		        
		        
			   System.out.println("Value:"+jo);
			   
			 
		   }	 
		
		  

		   
		
		
	}

}
