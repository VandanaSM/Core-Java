import java.util.Arrays;

//implementation cls-implements abstract methods
class HospitalCrudImpl implements HospitalCrud{
  ///has many patients so made as array we know size but not type of data to be stored
  ///has-a relation bet hospital and patient-one to many relationship
  PatientDTO[] dtos;  ///if enter size >6 then nullpointerexception as patientdto is nonprimitive 
                                        ///and def value for it is null 
  ///instance variable
  int index; 
  
  public HospitalCrudImpl(int size){             ///pass value which provided to the size in next line as we want to enter it at run time
	  dtos=new PatientDTO[size];    ///constr called as soon as object is called so init done here so size we need to provide first so done in constr
	  System.out.println("HospitalCrud object is created");
  }
  
  ///another para dto of PatientDTO type entered
  @Override
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
  
  @Override
  public void getPatientDetails(){
	  System.out.println("inside getPatientDetails()");
	  for(int i=0;i<dtos.length;i++){
		  System.out.println(dtos[i]);
		                      
	  }
  }
  
  @Override
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
  
  @Override
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

  @Override
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

   @Override
   public boolean deletePatientDetailsById(int id){
	   System.out.println("start of deletePatientDetailsById()");
	   boolean patientDeleted1=false;
	   int i,j;         ///decl outside for loop to reduce index value after deleting one object and we cannot access i outside for loop
	   for(i=0,j=0;j<dtos.length;j++){
		   if(dtos[j].getId()!=id){
			   //dtos[0]=dtos[0]
			   dtos[i++]=dtos[j];     /// j holds previous data i holds new data after deletion
			   patientDeleted1=true;
		   }
		   else{
			   System.out.println("Patient id not found");
		   }
	   }
	    dtos=Arrays.copyOf(dtos,i);   ///(dtos,i)dtos-previous array i-new data after deletion values copy to new dtos var
	    return patientDeleted1;
   }  

   @Override
  public String getPatientNameById(int id){
	System.out.println("start of getPatientNameById()");
	  String name=null;
	for(int i=0;i<dtos.length;i++){
		if(dtos[i].getId()!=id){
			System.out.println(dtos[i].getName());
		}
		else{
			System.out.println("Enter valid id to get Patient Name ");
		}
	}  
   return name;	
  }  

  @Override
  public long getPatientContactNoByName(String name){
	  System.out.println("Start of getPatientContactNoByName()");
	  long contactNo=0;;
	    for(int i=0;i<dtos.length;i++){
			if(dtos[i].getName().equals (name)){
				System.out.println(dtos[i].getContactNo());
			}
			else{
				System.out.println("Enter proper name to get patient contact no ");
			}
		}
   return contactNo;
  }  
  
  @Override
  public boolean deletePatientByGender(Gender gender){
	  System.out.println("start of deletePatientByGender()");
	   boolean deletedPatient=false;
	   int i,j;
	   for(i=0,j=0;j<dtos.length;j++){
          if(!dtos[j].getGender() .equals (gender)){	    ///can use == and equals() for enum type	  
			  dtos[i++]=dtos[j];
			   deletedPatient=true;
		  }
		  else{
			  System.out.println("Enter the valid gender to delete patient");
		  }
	   }
	   dtos=Arrays.copyOf(dtos,i);
	  return deletedPatient;
  }
  
}