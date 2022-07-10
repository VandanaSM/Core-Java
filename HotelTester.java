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
 }

  }

