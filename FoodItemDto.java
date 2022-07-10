class FoodItemDto{

   private int id;
   private String name;
   private double price;
   private boolean isAvailable;
   private String itemdetails;

  public FoodItemDto(){
    System.out.println("FoodItemDto object is created");
  }
  
  public int getId(){
   return id;
  }
  
  public void setId(int id){
    this.id=id;
  }
  
  public String getName(){
   return name;
  }
  
  public void setName(String name){
    this.name=name;
  }
  
  public double getPrice(){
   return price;
  }
  
  public void setPrice(double price){
    this.price=price;
  }
  
    public boolean getIsAvailable(){
   return isAvailable;
  }
  
  public void setIsAvailable(boolean isAvailable){
    this.isAvailable=isAvailable;
  }
  
  public String getItemdetails(){
   return itemdetails;
  }
  
  public void setItemdetails(String itemdetails){
    this.itemdetails=itemdetails;
  }
}