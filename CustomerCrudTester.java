import java.util.Scanner;

class CustomerCrudTester{

 public static void main(String[] args){
	 
	 Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the number of customers ");
	   int size=sc.nextInt();
	   
	 CustomerCrud cus=new CustomerCrud(size);
   
	  for(int i=0;i<size;i++){
		  OrderDTO dto=new OrderDTO();
		  
		  System.out.println("Enter customer id");
		  int id=sc.nextInt();
		  System.out.println("Enter customer name");
		  String name=sc.next();
		  System.out.println("Enter address of customer");
		  String address=sc.next();
		  System.out.println("Enter orderNo ");
		  String orderNo=sc.next();
		  System.out.println("Enter contact Number of customer");
		  long contactNo=sc.nextLong();
		  System.out.println("Enter bill amount of the order");
		  double billAmount=sc.nextDouble();
		    dto.setId(id);
			dto.setName(name);
			dto.setAddress(address);
			dto.setContactNo(contactNo);
			dto.setBillAmount(billAmount);
			dto.setOrderNo(orderNo);
			
		cus.createCustomerDetails(dto);
	  }
	 	 cus.getCustomerDetails();   
		 //invoking updateCustomerAddressById() 
		 System.out.println("Enter the existing id for which address has to be updated");
		 int existingId=sc.nextInt();
		 sc.nextLine();
		 System.out.println("Enter the address to be updated");
		 String updatedAddress=sc.next();
		 cus.updateCustomerAddressById(existingId,updatedAddress);
		 
		  cus.getCustomerDetails();
		 
	 ///invoking updateCustomerContactNoByName()
		 System.out.println("Enter the existing name for which contact no has be updated");
		 String existingName=sc.next();
		 System.out.println("Enter the contact no to be updated");
		 long updatedContactNo=sc.nextLong();
		 cus.updateCustomerContactNoByName(existingName,updatedContactNo); 
         
		 cus.getCustomerDetails();   
		 
		 ///invoking deleteCustomerById()		
		 System.out.println("Enter the id to be deleted");
		 int availableId=sc.nextInt();
		 cus.deleteCustomerById(availableId);
		 
		 cus.getCustomerDetails(); 
		 
		///invoking deleteCustomerByOrderNo()		
		 System.out.println("Enter the orderNO to be deleted");
		 String availableOrderNo=sc.next();
		 cus.deleteCustomerByOrderNo(availableOrderNo);
		 
		 cus.getCustomerDetails(); 
  }
 }


