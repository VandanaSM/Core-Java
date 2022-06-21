class ShoppingMall2{
  int id;
  String name;
  String address;
  int noOfEmployees;
  long contactNo;
  String openingTime;
  String closingTime;
  int noOfShops;
  boolean offersRunning;
  
  public ShoppingMall2(){
	  
	  System.out.println("ShoppingMall2 object created");
	  
  }
  
  public static void main(String[] args){
	  ShoppingMall2 shoppingMall=new ShoppingMall2();
	  shoppingMall.id=001;
	  shoppingMall.name="Orion mall";
	  shoppingMall.address="near soap factory";
	  shoppingMall.contactNo=8908907867L;
	  shoppingMall.openingTime="10 AM";
	  shoppingMall.closingTime="8 PM";
	  shoppingMall.noOfShops=15;
	  shoppingMall.offersRunning=true;
	  shoppingMall.buyProducts();
	   System.out.println("1st shopping mall in blore===============");
	   System.out.println("registration no or id is" +shoppingMall.id);
	   System.out.println("the name of shopping mall is" +shoppingMall.name);
	   System.out.println("the address of shopping mall is "+shoppingMall.address);
	   System.out.println("the contact no is " +shoppingMall.contactNo);
	   System.out.println("the opening time is" +shoppingMall.openingTime);
	   System.out.println("the closing time is" +shoppingMall.closingTime);
       System.out.println("the No of shops are " +shoppingMall.noOfShops);
	   if(shoppingMall.offersRunning==true){
		   System.out.println("there is offer present");
	   }else{
		   System.out.println("there is no offer present");
	   }
	   
	   ShoppingMall2 shoppingMall1=new ShoppingMall2();
	  shoppingMall1.id=002;
	  shoppingMall1.name="GT mall";
	  shoppingMall1.address="magadi main road";
	  shoppingMall1.contactNo=786786576567L;
	  shoppingMall1.openingTime="10:30 AM";
	  shoppingMall1.closingTime="9 PM";
	  shoppingMall1.noOfShops=20;
	  shoppingMall1.offersRunning=false;
	   System.out.println("2nd shopping mall in blore===============");
	   System.out.println("registration no or id is" +shoppingMall1.id);
	   System.out.println("the name of shopping mall is" +shoppingMall1.name);
	   System.out.println("the address of shopping mall is "+shoppingMall1.address);
	   System.out.println("the contact no is " +shoppingMall1.contactNo);
	   System.out.println("the opening time is" +shoppingMall1.openingTime);
	   System.out.println("the closing time is" +shoppingMall1.closingTime);
       System.out.println("the No of shops are " +shoppingMall1.noOfShops);
	   if(shoppingMall1.offersRunning==true){
		   System.out.println("there is offer present");
	   }else{
		   System.out.println("there is no offer present");
	   }
	   
	   
	   	   
	   ShoppingMall2 shoppingMall2=new ShoppingMall2();
	  shoppingMall2.id=002;
	  shoppingMall2.name="Mantri Square";
	  shoppingMall2.address="malleswaram";
	  shoppingMall2.contactNo=9453458959L;
	  shoppingMall2.openingTime="11 AM";
	  shoppingMall2.closingTime="10 PM";
	  shoppingMall2.noOfShops=22;
	  shoppingMall2.offersRunning=false;
	   System.out.println("3rd shopping mall in blore===============");
	   System.out.println("registration no or id is" +shoppingMall2.id);
	   System.out.println("the name of shopping mall is" +shoppingMall2.name);
	   System.out.println("the address of shopping mall is "+shoppingMall2.address);
	   System.out.println("the contact no is " +shoppingMall2.contactNo);
	   System.out.println("the opening time is" +shoppingMall2.openingTime);
	   System.out.println("the closing time is" +shoppingMall2.closingTime);
       System.out.println("the No of shops are " +shoppingMall2.noOfShops);
	   if(shoppingMall2.offersRunning==true){
		   System.out.println("there is offer present");
	   }else{
		   System.out.println("there is no offer present");
	   }
	   
	  
  }
    public void  buyProducts(){
		System.out.println("to buy products needed at one place and save time");
	}

}