package com.xworkz.customer;

import java.util.Scanner;

import com.xworkz.customer.crud.Customer;
import com.xworkz.customer.crud.impl.CustomerImpl;
import com.xworkz.customer.dto.OrderDTO;

public class CustomerTester {
 
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no of orders to be stored");
	int size=sc.nextInt();
	
	Customer cus=new CustomerImpl(size);
	
	for(int i=0;i<size;i++) {
	OrderDTO dto=new OrderDTO();
	System.out.println("Enter the id of the order");
	int id=sc.nextInt();
	
	System.out.println("Enter the name of the customer");
	String name=sc.next();
	
	System.out.println("Enter the address of the customer");
	String address=sc.next();
	
	System.out.println("Enter the contact number");
	long contactNo=sc.nextLong();
	
	System.out.println("Enter the type of order");
	String type=sc.next();
	
	System.out.println("Enter the quantity of order");
	int quantity=sc.nextInt();
	
	System.out.println("Enter the bill amount");
	double billAmount=sc.nextLong();
	
	dto.setId(id);
	dto.setName(name);
	dto.setAddress(address);
	dto.setType(type);
	dto.setBillAmount(billAmount);
	dto.setQuantity(quantity);
	dto.setContactNo(contactNo);
	
	cus.createOrderDetails(dto);
}
	 String option=null;
 do{
	System.out.println("Enter 1 to get Customer Details");
   System.out.println("Enter 2 to update Customer Address By Id");
   System.out.println("Enter 3 to update Customer Contact No By Name");
   System.out.println("Enter 4 to delete Customer By Id");
   System.out.println("Enter 5 to delete Customer By Name");
   System.out.println("Enter 6 to get Order Name By Id");
   System.out.println("Enter 7 to get Order Type By Name");	
   System.out.println("Enter 8 to get All Quantities");
	System.out.println("Enter 9 to getAllOrderName");
   System.out.println("Enter the choice to proceed");
	
	int choice=sc.nextInt();
	
switch(choice){
	  case 1 :  cus.getCustomerDetails();
                break;
     case 2 : 	System.out.println("Enter the existing id for which address has to be updated");
				 int existingId=sc.nextInt();
				 sc.nextLine();
				 System.out.println("Enter the address to be updated");
				 String updatedAddress=sc.next();
				 cus.updateCustomerAddressById(existingId,updatedAddress);				 
                 break;
	  case 3 :  System.out.println("Enter the existing name for which contact no has be updated");
				 String existingName=sc.next();
				 System.out.println("Enter the contact no to be updated");
				 long updatedContactNo=sc.nextLong();
				 cus.updateCustomerContactNoByName(existingName,updatedContactNo);
				   break;
     case 4 : 	System.out.println("Enter the id to be deleted");
				 int availableId=sc.nextInt();
				 cus.deleteCustomerById(availableId);
                 break;
	  case 5 : 	System.out.println("Enter the name to be deleted");
				 String availableName=sc.next();
				 cus.deleteCustomerByName(availableName);
                 break;
	  case 6 :  System.out.println("Enter Id to get Order Name ");
				 int availableId1=sc.nextInt();
				 cus.getOrderNameById(availableId1);
                 break;
	  case 7 :  System.out.println("Enter name to get Order type");
				 String availableName1=sc.next();
				 cus.getOrderTypeByName(availableName1);
                 break;
	  case 8 :  cus.getAllQuantities();
                 break;
	  case 9 : cus.getAllOrderName();
	             break;
	  default:  System.out.println("Please enter valid choices from above");
	             break;
 }
 	 System.out.println("Do you want to continue further Yes/No");
   option =sc.next();
   sc.close();
 
 }
while(option.equalsIgnoreCase("Yes"));
 }
}


