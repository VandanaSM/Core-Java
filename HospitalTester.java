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
	  Long contactNo=sc.nextLong();
	  System.out.println("Enter Patient Gender");
	  String gender=sc.next();   ///gender enter in console is string type so given as string now we have to convert it from 
	                               ///string to enum type(Gender) we use valueOf
	  dto.setGender(Gender.valueOf(gender));  ///valueOf class contains valueOf method so called to convert from String to enum Gnder type

	  
	 dto.setId(id);
	 dto.setName(name);
	 dto.setAddress(address);
	 dto.setContactNo(contactNo);
	 
	 hos.createPatient(dto);
	 }
	 	 hos.getPatientDetails();   ///only one get details method called as it stores all the object details
		 //invoking updatePatientAddressById() 
		 System.out.println("Enter the existing id for which address has to be updated");
		 int existingId=sc.nextInt();
		 sc.nextLine();
		 System.out.println("Enter the address to be updated");
		 String updatedAddress=sc.next();
		 hos.updatePatientAddressById(existingId,updatedAddress);
		 
		  hos.getPatientDetails();
		 
	 ///invoking updatePatientContactNoByName()
		 System.out.println("Enter the existing name for which contact no has be updated");
		 String existingName=sc.next();
		 System.out.println("Enter the contact no to be updated");
		 long updatedContactNo=sc.nextLong();
		 hos.updatePatientContactNoByName(existingName,updatedContactNo); 
         
		 hos.getPatientDetails();   ///after update need to get details again so used      
        

     ///invoking deletePatientDetailsByName()		
		 System.out.println("Enter the name to be deleted");
		 String availableName=sc.next();
		 hos.deletePatientDetailsByName(availableName);
		 
		 hos.getPatientDetails(); 
		 
	 ///invoking deletePatientDetailsById()		
		 System.out.println("Enter the id to be deleted");
		 int availableId=sc.nextInt();
		 hos.deletePatientDetailsById(availableId);
		 
		 hos.getPatientDetails(); 
		
  }

}