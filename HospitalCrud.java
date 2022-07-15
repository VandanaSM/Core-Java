import java.util.Arrays;

class HospitalCrud{
  ///has many patients so made as array we know size but not type of data to be stored
  ///has-a relation bet hospital and patient-one to many relationship
  PatientDTO[] dtos;  ///if enter size >6 then nullpointerexception as patientdto is nonprimitive 
                                        ///and def value for it is null 
  ///instance variable
  int index; 
  
  public HospitalCrud(int size){             ///pass value which provided to the size in next line as we want to enter it at run time
	  dtos=new PatientDTO[size];    ///constr called as soon as object is called so init done here so size we need to provide first so done in constr
	  System.out.println("HospitalCrud object is created");
  }
  
  ///another para dto of PatientDTO type entered
  public boolean createPatient(PatientDTO dto){
	  System.out.println("inside create patient method");
	   boolean isAdded=false;
	  if(dto!= null && dto.getName() !=null){      ///&& checks both cond true then only execute if
		  this.dtos[index++]=dto;      ///dto is ref of PatientDTO type
		  isAdded=true; 
		  System.out.println("Patient details added successfully");
	  }
	  else{
		  System.out.println("patient details are null,please add the patient details first");
	  }
	  return isAdded;
  }
  
  public void getPatientDetails(){
	  System.out.println("inside getPatientDetails()");
	  for(int i=0;i<dtos.length;i++){
		  System.out.println(dtos[i].getId() + " " + dtos[i].getName() + " " + dtos[i].getAddress() + " " + dtos[i].getContactNo() +
		                   " " + dtos[i].getGender());
		                      
	  }
  }
  
  public boolean updatePatientAddressById(int id,String address){    ///2 var used 1-to get patient details by unique no,other which has to be changed
	  System.out.println("start of updatePatientAddressById()");
	  boolean updatedAddress=false;
	  for(int i=0;i<dtos.length;i++){      ///used for as patient details are stored in array
		  if(dtos[i].getId()==id){         ///pass id which is stored in getId of dtos array to id 
			  updatedAddress=true;
			  dtos[i].setAddress(address);     ////pass address para to method where we set or enter address
			  System.out.println("Patient Address updated successfully");
		  }
		  else{
			  System.out.println("Couldnot update patient address,please provide proper id");
		  }
	  }
	  return updatedAddress;
  }
  
   public boolean updatePatientContactNoByName(String name,long contactNo){
	  System.out.println("start of updatePatientContactNoByName()");
	  boolean updatedContactNo=false;
	  for(int i=0;i<dtos.length;i++){
		  if(dtos[i].getName().equals(name)){
			  updatedContactNo=true;
			  dtos[i].setContactNo(contactNo);
			  System.out.println("Patient contact no is updated successfully");
			 
		  }
		  else{
			  System.out.println("Couldnot update patient contact no , please enter proper patient name");
		  }
	  }
	  return updatedContactNo;
  }    

   public boolean deletePatientDetailsByName(String name){
	  System.out.println("start of deletePatientDetailsById()");
	   boolean patientDeleted=false;
	   int i,j;
	     for(i=0,j=0;j<dtos.length;j++){
			 ///("Shree").equalsIgnoreCase("shree")  checks data but ignores for case sensitivity  
			 ///.equals -equals class has equals method so called using . ,for string values to compare we use .equals 
			if(!dtos[j].getName().equals(name)){				
			//	dtos[i]=null;  
				dtos[i++]=dtos[j];
				 patientDeleted=true;
            }
			else {
				System.out.println("Patient's name not found");
			}
		}	
		dtos=Arrays.copyOf(dtos,i);
				
	return patientDeleted;
   }

   public boolean deletePatientDetailsById(int id){
	   System.out.println("start of deletePatientDetailsById()");
	   boolean patientDeleted1=false;
	   int i,j;
	   for(i=0,j=0;j<dtos.length;j++){
		   if(dtos[j].getId()!=id){
			   dtos[i++]=dtos[j];
			   patientDeleted1=true;
		   }
		   else{
			   System.out.println("Patient id not found");
		   }
	   }
	   dtos=Arrays.copyOf(dtos,i);
	    return patientDeleted1;
   }   
  
}