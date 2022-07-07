class HospitalTester{

  public static void main(String[] args){
     
	 HospitalCrud hos=new HospitalCrud();
	 
	 PatientDTO dto=new PatientDTO();
	 dto.setId(001);
	 dto.setName("shri");
	 dto.setAddress("Bangalore");
	 dto.setGender(Gender.male);  ///ente value using enum class name i.e., Gender.male
	 dto.setContactNo(789893990);
	 
	 PatientDTO dto1=new PatientDTO();
	 dto1.setId(002);
	 dto1.setName("vinita");
	 dto1.setAddress("Rajajinagar,Bangalore");
	 dto1.setGender(Gender.female);  
	 dto1.setContactNo(989428989);
	 
	 PatientDTO dto2=new PatientDTO();
	 dto2.setId(003);
	 dto2.setName("vivian");
	 dto2.setAddress("yeshwantpur,Bangalore");
	 dto2.setGender(Gender.male);  
	 dto2.setContactNo(782374090);
	 
	 PatientDTO dto3=new PatientDTO();
	 dto3.setId(004);
	 dto3.setName("nupur");
	 dto3.setAddress("vijaynagar,Bangalore");
	 dto3.setGender(Gender.female);  
	 dto3.setContactNo(878743827);
	 
	 PatientDTO dto4=new PatientDTO();
	 dto4.setId(005);
	 dto4.setName("yashu");
	 dto4.setAddress("banshankari,Bangalore");
	 dto4.setGender(Gender.female);  
	 dto4.setContactNo(879842790);
	 
	 PatientDTO dto5=new PatientDTO();
	 dto5.setId(006);
	 dto5.setName("yashwant");
	 dto5.setAddress("koramangala,Bangalore");
	 dto5.setGender(Gender.male);  
	 dto5.setContactNo(986982399);
	 
	 hos.createPatient(dto);  ///enter para dto as PatientDTO dto -details in dto so directly call dto
	 hos.createPatient(dto1);
	 hos.createPatient(dto2);
	 hos.createPatient(dto3);
	 hos.createPatient(dto4);
     hos.createPatient(dto5);
	 hos.getPatientDetails();
  }

}