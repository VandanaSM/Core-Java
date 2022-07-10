import java.util.Scanner ;

class HospitalTester{

  public static void main(String[] args){
	  
	 Scanner sc=new Scanner(System.in);
	  
	  System.out.println("Enter the number of Patients");      ///first we need to know size as we want that value at runtime
	  int size=sc.nextInt();

     
	 HospitalCrud hos=new HospitalCrud(size);   ///call size here as it is created with HospitalCrud  constr and init above
	 
	 for(int i=0;i<size;i++){      ///to opti code for loop used -no need to create object for each patient 
		 
	 PatientDTO dto=new PatientDTO();
	  System.out.println("Enter patient name");
	  String name=sc.next();
	  System.out.println("Enter Patient Address");
	  String address=sc.next();
	  System.out.println("Enter patient id");
	  int id=sc.nextInt();
	  System.out.println("Enter patient contact number");
	  long contactNo=sc.nextLong();
	  System.out.println("Enter Patient Gender");
	  Gender gender=sc.nextGender();
	  
	  
	 dto.setId(id);
	 dto.setName(name);
	 dto.setAddress(address);
	 dto.setGender(gender);  ///enter value using enum class name i.e., Gender.male
	 dto.setContactNo(contactNo);
	 
	 hos.createPatient(dto);
	 }
	 
	 hos.getPatientDetails();   ///only one get details method called as it stores all the object details
  }

}