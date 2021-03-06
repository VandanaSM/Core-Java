package com.xworkz.hotel;

import java.util.Scanner;

import com.xworkz.hotel.crud.Hotel;
import com.xworkz.hotel.crud.impl.HotelImpl;
import com.xworkz.hotel.dto.FoodItemDTO;

public class HotelTester {

	public static void main(String[] args) {
		
	  Scanner sc=new Scanner(System.in);
	  
	  System.out.println("Enter the number of Food items");
	  int size=sc.nextInt();
	  Hotel hotel=new HotelImpl(size);
		
		for(int i=0;i<size;i++) {
		
		FoodItemDTO dto=new FoodItemDTO();
		System.out.println("Enter the id of food item");
		int id=sc.nextInt();
		
		System.out.println("Enter the name of the food item");
		String name=sc.next();
		
		System.out.println("Enter the type of the food item");
		String type=sc.next();
		
		System.out.println("Enter the price of the food item");
		double price=sc.nextDouble();
		
		System.out.println("check if the food item is available");
		boolean isAvailable=sc.nextBoolean();
		
		System.out.println("Enter the details of the food item");
		String itemDetails=sc.next();
		
		dto.setId(id);
		dto.setName(name);
		dto.setType(type);
		dto.setIsAvailable(isAvailable);
		dto.setItemDetails(itemDetails);
		dto.setPrice(price);
		
		hotel.createFoodItem(dto);
	  }
	  
	  String option=null;
	  do{
		System.out.println("Enter 1 to get Food Items");
      System.out.println("Enter 2 to update Price By Id");
      System.out.println("Enter 3 to update IsAvailable By Name");
      System.out.println("Enter 4 to delete Food Item Details By Id");
      System.out.println("Enter 5 to delete Food Item Details By Name");
      System.out.println("Enter 6 to update Food Price By Name");
      System.out.println("Enter 7 to get All Food Names");	
      System.out.println("Enter 8 to delete Food Type By Id");
		System.out.println("Enter 9 to delete Food Item By Type");
      System.out.println("Enter the choice to proceed");
		
		int choice=sc.nextInt();
		
	 switch(choice){
		  case 1 :  hotel.getFoodItem();
		             break;
		  case 2 :  System.out.println("Enter the existing id ");
					 int existingId=sc.nextInt();
					 sc.nextLine();
					 System.out.println("Enter the price to be updated");
					 double updatedPrice=sc.nextDouble();
					 hotel.updatePriceById(existingId,updatedPrice);
					 break;
		  case 3 :  System.out.println("Enter the existing name ");
					 String existingName=sc.next();
					 System.out.println("Enter if food item avalable to be updated");
					 boolean updatedIsAvailable=sc.nextBoolean();
					 hotel.updateIsAvailableByName(existingName,updatedIsAvailable); 
					 break;
		  case 4 :  System.out.println("Enter the id to be deleted");
					 int availableId=sc.nextInt();
					 hotel.deleteFoodItemDetailsById(availableId);
					 break;
		  case 5 :  System.out.println("Enter the name to be deleted");
					 String availableName=sc.next();
					 hotel.deleteFoodItemDetailsByName(availableName);
					 break;
		  case 6 : System.out.println("Enter the name of food item");
		             String name1=sc.next();
					 System.out.println("Enter the price to be updated");
		             double updatedPrice1=sc.nextDouble();
					 hotel.updateFoodPriceByName(name1,updatedPrice1);
					 break;
		  case 7 : hotel.getAllFoodNames();
		             break;
		  case 8 : System.out.println("Enter id to delete type of food item");
		             int id=sc.nextInt();
					 sc.nextLine();
					 hotel.deleteFoodTypeById(id);
					 break;
		  case 9 : System.out.println("Enter type to delete the food items ");
		             String type=sc.next();
					 //sc.nextLine();
					 hotel.deleteFoodItemByType(type);
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
	




