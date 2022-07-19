import java.util.Arrays;

//implementation cls-implements abstract methods
class HotelCrudImpl implements HotelCrud{

   FoodItemDto dtos[];
   int index;
   
   public HotelCrudImpl(int size){
	   dtos=new FoodItemDto[size];
	   System.out.println("HotelCrud object created");
   }
   
   @Override
   public boolean createFoodItem(FoodItemDto dto){
	   System.out.println("Start of createFoodItem()");
	    boolean isAdded=false;
	 if(dto!=null && dto.getName()!= null){
		 this.dtos[index++]=dto;
		 isAdded=true;
		 System.out.println("Food Item created succesfully");
	 }else{
		 System.out.println("Enter the Food item details first");
	 }
	 return isAdded;
	   
   }

   @Override
    public void getFoodItem(){
	  System.out.println("Start of getFoodItem()");
	  
	  for(int i=0;i<dtos.length;i++){
		  System.out.println(dtos[i]) ; 
	  }
    }
	
	@Override
  public boolean updatePriceById(int id,double price){    
	  System.out.println("start of updatePriceById()");
	  boolean updatedPrice=false;
	  for(int i=0;i<dtos.length;i++){      
		  if(dtos[i].getId()==id){        
			  updatedPrice=true;
			  dtos[i].setPrice(price);    
			  System.out.println("Price updated successfully");
		  }
		  else{
			  System.out.println("Couldnot update price,please provide proper id");
		  }
	  }
	  return updatedPrice;
  }
  
  @Override
   public boolean updateIsAvailableByName(String name,boolean isAvailable){
	  System.out.println("start of updateIsAvailableByName()");
	  boolean updatedIsAvailable=false;
	  for(int i=0;i<dtos.length;i++){
		  if(dtos[i].getName().equals(name)){
			  updatedIsAvailable=true;
			  dtos[i].setIsAvailable(isAvailable);
			  System.out.println("isAvailable is updated successfully");
		  }
		  else{
			  System.out.println("Couldnot update isAvailable , please enter proper food item name");
		  }
	  }
	  return updatedIsAvailable;
  } 
  
  @Override
     public boolean deleteFoodItemDetailsById(int id){
	   System.out.println("start of deleteFoodItemDetailsById()");
	   boolean FoodItemDeleted=false;
	   int i,j;
	   for(i=0,j=0;j<dtos.length;j++){
		   if(dtos[j].getId()!=id){
			   dtos[i++]=dtos[j];
			   FoodItemDeleted=true;
		   }
		   else{
			   System.out.println("FoodItem id not found");
		   }
	   }
	   dtos=Arrays.copyOf(dtos,i);
	    return FoodItemDeleted;
   }   
   
   @Override
    public boolean deleteFoodItemDetailsByName(String name){
	   System.out.println("start of deleteFoodItemDetailsByName()");
	   boolean FoodItemDeleted1=false;
	   int i,j;
	   for(i=0,j=0;j<dtos.length;j++){
		   if(!dtos[j].getName().equals(name)){
			   dtos[i++]=dtos[j];
			   FoodItemDeleted1=true;
		   }
		   else{
			   System.out.println("Food Item name not found");
		   }
	   }
	   dtos=Arrays.copyOf(dtos,i);
	    return FoodItemDeleted1;
   } 
  
   @Override
     public boolean updateFoodPriceByName(String name,double price){
		 System.out.println("Start of updateFoodPriceByName");
		 boolean updatedPrice=false;
		 for(int i=0;i<dtos.length;i++){
			 if(dtos[i].getName().equals (name)){
				 dtos[i].setPrice(price);
				 updatedPrice=true;
				 System.out.println("updated price successfully");
			 }
			 else{
				 System.out.println("couldnot update price ,please enter proper id");
			 }
		 }
		 return updatedPrice;
	 }
	 
	 @Override
	 public String[] getAllFoodNames(){
		 System.out.println("Start of getAllFoodNames()");
		 int i,j;
		 for(i=0,j=0;i<dtos.length;i++){
			System.out.println(dtos[i].getName());
            j++;
		 }
	     String[] allFoodItemNames=new String[j];
        for(int y=0,z=0;y<dtos.length;y++){
			 allFoodItemNames[z++] = dtos[y].getName(); 
		  } 
		 return allFoodItemNames;
	 }
	 
	 @Override
	 public boolean deleteFoodTypeById(int id){
		 System.out.println("Start of deleteFoodTypeById");
		 boolean deleteFoodType=false;
		 int i,j;
		 for(i=0,j=0;j<dtos.length;j++){
			 if(dtos[i].getId()!= id){
				 dtos[i++]=dtos[j];
				 deleteFoodType=true;
			 }
			 else{
				 System.out.println("Food Item not found,enter proper id");
			 }
		 }
		 dtos=Arrays.copyOf(dtos,i);
		 return deleteFoodType;
	 }
	 
	 @Override
	 public boolean deleteFoodItemByType(String type){
		 System.out.println("Start of deleteFoodItemByType()");
		  boolean deleteFoodType=false;
		 int i,j;
		 for(i=0,j=0;j<dtos.length;j++){
			 if(!dtos[j].getType() .equals (type)){
				 dtos[i++]=dtos[j];
				 deleteFoodType=true;
				 System.out.println("type de;eted successfully");
			 }
			 else{
				 System.out.println("Food Item not found,enter proper id");
			 }
		 }
		 dtos=Arrays.copyOf(dtos,i);
		 return deleteFoodType;
	 }
     


}