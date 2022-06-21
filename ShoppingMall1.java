class ShoppingMall1{

  String nameOfMall;
  String address;
  long contactNo;
  int noOfShops;
  String[] shopNamesInOrion={"max","manyavar","vero moda","starbucks coffee","zara","PVR"};
  String[] shopNamesInGT={"max","Bata","Dominos","Pantaloons","Trends","US Polo"};
  String[] shopNamesInMantriSquare={"max","Rado","adidas","MCDonald","levis","H and M"};


  
  public static void main (String[] args){
	  ShoppingMall1 shoppingMall=new ShoppingMall1();
	  shoppingMall.nameOfMall="Orion mall";
	  shoppingMall.address="near soap factory";
	  shoppingMall.contactNo=8908907867L;
	  shoppingMall.noOfShops=15;
	   System.out.println("1st shopping mall in blore===============");
	   System.out.println("the name of shopping mall is" +shoppingMall.nameOfMall);
	   System.out.println("the address of shopping mall is "+shoppingMall.address);
	   System.out.println("the contact no is " +shoppingMall.contactNo);
	   System.out.println("the No of shops are " +shoppingMall.noOfShops);
	   shoppingMall.getShopNamesInOrion();
	    
		 
	   ShoppingMall1 shoppingMall1=new ShoppingMall1();
	   shoppingMall1.nameOfMall="GT mall";
	   shoppingMall1.address="Magadi main Road";
	   shoppingMall1.contactNo=8908687688L;
	   shoppingMall1.noOfShops=18;
	   System.out.println("2nd shopping mall in blore===============");
	   System.out.println("the name of shopping mall is" +shoppingMall1.nameOfMall);
	   System.out.println("the address of shopping mall is "+shoppingMall1.address);
	   System.out.println("the contact no is " +shoppingMall1.contactNo);
	   System.out.println("the No of shops are " +shoppingMall1.noOfShops);
	   shoppingMall1.getShopNamesInGT();
	   
	   
	   System.out.println("2nd shopping mall in blore===============");
	   ShoppingMall1 shoppingMall2=new ShoppingMall1();
	   shoppingMall2.nameOfMall="Mantri Square";
	   shoppingMall2.address="Malleswaram";
	   shoppingMall2.contactNo=8497858470L;
	   shoppingMall2.noOfShops=14;
       System.out.println("3rd shopping mall in blore===============");
	   System.out.println("the name of shopping mall is" +shoppingMall2.nameOfMall);
	   System.out.println("the address of shopping mall is "+shoppingMall2.address);
	   System.out.println("the contact no is " +shoppingMall2.contactNo);
	   System.out.println("the No of shops are " +shoppingMall2.noOfShops);
	   shoppingMall2.getShopNamesInMantriSquare(); 
	  
	  
  }
  
  public void getShopNamesInOrion(){
	  for(int z=0;z<shopNamesInOrion.length;z++){
		  System.out.println("shops available in mall are " +shopNamesInOrion[z]);
	  }
  }
  public void getShopNamesInGT(){
	  for(int z=0;z<shopNamesInGT.length;z++){
		  System.out.println("shops available in mall are " +shopNamesInGT[z]);
	  }
  }
  public void getShopNamesInMantriSquare(){
	  for(int z=0;z<shopNamesInMantriSquare.length;z++){
		  System.out.println("shops available in mall are " +shopNamesInMantriSquare[z]);
	  }
  }
	  
  }





