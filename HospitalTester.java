import java.util.Scanner ;

class HospitalTester{

  public static void main(String[] args){
	  
	  
	 Scanner sc=new Scanner(System.in);
	  
	  System.out.println("Enter the number of Patients");      ///first we need to know size as we want that value at runtime
	  int size=sc.nextInt();

     
	 HospitalCrudImpl hos=new HospitalCrudImpl(size);   ///call size here as it is created with HospitalCrud  constr and init above
	 
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
	 
	 String option=null;   ///init here as we need to enter it in while condition 
	 do{
	    System.out.println("Enter 1 to fetch all the details");
	    System.out.println("Enter 2 to update Patient Address By Id");
		System.out.println("Enter 3 to update Patient Contact No By Name");
		System.out.println("Enter 4 to delete Patient Details By Name");
		System.out.println("Enter 5 to delete Patient Details By Id");   
		System.out.println("Enter 6 to fetch Patient Name By Id ");
		System.out.println("Enter 7 to delete patient by gender");
		System.out.println("Please enter choice to proceed ");
		
		int choice=sc.nextInt();
	
	 switch(choice){
		 case 1 : hos.getPatientDetails();   ///only one get details method called as it stores all the object details
                   break;
         case 2 :  System.out.println("Enter the existing id for which address has to be updated");
					 int existingId=sc.nextInt();
					 sc.nextLine();
					 System.out.println("Enter the address to be updated");
					 String updatedAddress=sc.next();
					 hos.updatePatientAddressById(existingId,updatedAddress);	
					 break;
         case 3 : System.out.println("Enter the existing name for which contact no has be updated");
					 String existingName=sc.next();
					 System.out.println("Enter the contact no to be updated");
					 long updatedContactNo=sc.nextLong();
					 hos.updatePatientContactNoByName(existingName,updatedContactNo);
                     break;
         case 4 :  System.out.println("Enter the name to be deleted");
					 String availableName=sc.next();
					 hos.deletePatientDetailsByName(availableName);	
                     break;
         case 5 :  System.out.println("Enter the id to be deleted");
					 int availableId=sc.nextInt();
					 hos.deletePatientDetailsById(availableId);	
                     break;	
		 case 6:  System.out.println("Enter the id to search/get name");
		             int availableId1=sc.nextInt();
					 hos.getPatientNameById(availableId1);
					 break;
		 case 7:  System.out.println("Enter the gender to delete patient");
		             String availableGender=sc.next();
					 hos.deletePatientByGender(Gender.valueOf(availableGender));
                     break;					 
         default : System.out.println("Please enter valid choices from above");
                     break;
	}				 
    System.out.println("Do you want to continue further Yes/No");
        option =sc.next();
	
	 }
	while(option.equals("Yes"));    ///if yes excutes do again 
	
 
  }
}