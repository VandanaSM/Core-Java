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
		  this.dtos[index++]=dto;
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

    



}