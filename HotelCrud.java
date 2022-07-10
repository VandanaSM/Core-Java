class HotelCrud{

   FoodItemDto dtos[];
   int index;
   
   public HotelCrud(int size){
	   dtos=new FoodItemDto[size];
	   System.out.println("HotelCrud object created");
   }
   
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

    public void getFoodItem(){
	  System.out.println("Start of getFoodItem()");
	  for(int i=0;i<dtos.length;i++){
		  System.out.println(dtos[i].getId() + " " + dtos[i].getName() + " "  
		              + " " + dtos[i].getPrice() + " " + dtos[i].getIsAvailable()+ " " + dtos[i].getItemdetails()) ; 
	  }
    }
     


}