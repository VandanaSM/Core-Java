class Restaurant{
  int id;
  String name;
  String address;
  long contactNo;
  String ownerName;
  
  public Restaurant(){
	  
	  System.out.println("object Restaurant is created");
  }
  
  public static void main (String[] args){
	  Restaurant restaurant=new Restaurant();
	  restaurant.id=001;
	  restaurant.name="Sagar";
	  restaurant.address="rajajinagar";
	  restaurant.contactNo=9804859456L;
	  restaurant.ownerName="abc";
	  restaurant.toEatFood();
	   System.out.println("id of restaurantis "+restaurant.id);
	   System.out.println("name of restaurantis "+restaurant.name);
	   System.out.println("the address of restaurant is "+restaurant.address);
	   System.out.println("the contact no is " +restaurant.contactNo);
	   System.out.println("the owner name is " +restaurant.ownerName);
	   
	  Restaurant restaurant1=new Restaurant();
	  restaurant1.id=002;
	  restaurant1.name="paakashala";
	  restaurant1.address="Malleswaram";
	  restaurant1.contactNo=9397589047L;
	  restaurant1.ownerName="jfghd";
	   System.out.println("id of restaurantis "+restaurant1.id);
	   System.out.println("name of restaurantis "+restaurant1.name);
	   System.out.println("the address of restaurant is "+restaurant1.address);
	   System.out.println("the contact no is " +restaurant1.contactNo);
	   System.out.println("the owner name is " +restaurant1.ownerName);
	   
	  Restaurant restaurant2=new Restaurant();
	  restaurant2.id=003;
	  restaurant2.name="1947 restaurant";
	  restaurant2.address="Banashankari";
	  restaurant2.contactNo=9978967856L;
	  restaurant2.ownerName="dfgj";
	   System.out.println("id of restaurantis "+restaurant2.id);
	   System.out.println("name of restaurantis "+restaurant2.name);
	   System.out.println("the address of restaurant is "+restaurant2.address);
	   System.out.println("the contact no is " +restaurant2.contactNo);
	   System.out.println("the owner name is " +restaurant2.ownerName);
	   
	  Restaurant restaurant3=new Restaurant();
	  restaurant3.id=004;
	  restaurant3.name="rotighar";
	  restaurant3.address="near bull temple";
	  restaurant3.contactNo=9978967856L;
	  restaurant3.ownerName="jhjkj";
	   System.out.println("id of restaurantis "+restaurant3.id);
	   System.out.println("name of restaurantis "+restaurant3.name);
	   System.out.println("the address of restaurant is "+restaurant3.address);
	   System.out.println("the contact no is " +restaurant3.contactNo);
	   System.out.println("the owner name is " +restaurant3.ownerName);
	   
	   
	  
  }
  
   public void toEatFood(){
	   
	   System.out.println("restaurant is place to eat differnt types of delicious food");
   }
	
}