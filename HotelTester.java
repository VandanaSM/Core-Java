import java.util.Scanner;

class HotelTester{

  public static void main(String[] args){
	  
	 Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the number of Food Items ");
	   int size=sc.nextInt();
	   
	 HotelCrud hotel=new HotelCrud(size);
   
	  for(int i=0;i<size;i++){
		  FoodItemDto dto=new FoodItemDto();
		  
		  System.out.println("Enter food item id");
		  int id=sc.nextInt();
		  System.out.println("Enter food item name");
		  String name=sc.next();
		  System.out.println("Enter food item price");
		  double price=sc.nextDouble();
		  System.out.println("Enter isAvailable");
		  boolean isAvailable=sc.nextBoolean();
		  System.out.println("Enter itemdetails");
		  String itemdetails=sc.next();
		    dto.setId(id);
			dto.setName(name);
			dto.setPrice(price);
			dto.setIsAvailable(isAvailable);
			dto.setItemdetails(itemdetails);
			
		hotel.createFoodItem(dto);
	  }
	    hotel.getFoodItem();
		
		//invoking updatePriceById() 
		 System.out.println("Enter the existing id ");
		 int existingId=sc.nextInt();
		 sc.nextLine();
		 System.out.println("Enter the price to be updated");
		 double updatedPrice=sc.nextDouble();
		 hotel.updatePriceById(existingId,updatedPrice);
		 
		 hotel.getFoodItem();
		 
	 ///invoking updateIsAvailableByName()
		 System.out.println("Enter the existing name ");
		 String existingName=sc.next();
		 //sc.nextLine();
		 System.out.println("Enter if food item avalable to be updated");
		 boolean updatedIsAvailable=sc.nextBoolean();
		// sc.nextLine();
		 hotel.updateIsAvailableByName(existingName,updatedIsAvailable); 
         
		 hotel.getFoodItem(); 
		 
	  ///invoking deleteFoodItemDetailsById()		
		 System.out.println("Enter the id to be deleted");
		 int availableId=sc.nextInt();
		 hotel.deleteFoodItemDetailsById(availableId);
		 
		 hotel.getFoodItem(); 
		 
	  ///invoking deleteFoodItemDetailsByName()		
		 System.out.println("Enter the name to be deleted");
		 String availableName=sc.next();
		 hotel.deleteFoodItemDetailsByName(availableName);
		 
		 hotel.getFoodItem(); 
  }
 }

  

