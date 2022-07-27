package com.xworkz.hospital;
import java.util.Scanner;
import com.xworkz.hospital.constant.Gender;
import com.xworkz.hospital.crud.HospitalInf;
import com.xworkz.hospital.crud.impl.HospitalImpl;
import com.xworkz.hospital.dto.PatientDTO;

public class HospitalTester {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		  System.out.println("Enter the number of Patients");     
		  int size=sc.nextInt();
		
		HospitalInf hos=new HospitalImpl(size);
	
		for(int i=0;i<size;i++) {
		PatientDTO dto = new PatientDTO(); 
		
		System.out.println("Enter the id of patient");
		int id=sc.nextInt();
		
		System.out.println("Enter the name of patient");
		String name=sc.next();
		
		System.out.println("Enter the address of the patient");
		String address=sc.next();
		
		System.out.println("Enter the gender of the patient");
		String gender=sc.next();
		
		System.out.println("Enter the contact number of the patient");
		long contactNo=sc.nextLong();
		
		dto.setId(id);
		dto.setName(name);
		dto.setAddress(address);
		dto.setGender(Gender.valueOf(gender));
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
       sc.close();
	 }
	while(option.equals("Yes"));    ///if yes executes do again 
	



}

}
