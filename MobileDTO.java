public class MobileDTO{
  int id;
  String brandName;
  String address;
  String color;
  int price;
  String os;
  int memoryStorage;
  double screenSize;
  
  public Mobile(){
	  
	  System.out.println("object Mobile is created");
	  
  }
  
  public static void main (String[] args){
	  Mobile mobile=new Mobile();
	  mobile.id=001;
	  mobile.brandName="redmi";
	  mobile.address="gulbarga";
	  mobile.color="black";
	  mobile.price=11000;
	  mobile.os="android";
	  mobile.memoryStorage=64;
	  mobile.screenSize=5.5;
	  mobile.toCommunicate();
	   System.out.println("id of mobile "+mobile.id);
	   System.out.println("the name of brand is" +mobile.brandName);
	   System.out.println("the address is "+mobile.address);
	   System.out.println("the color is " +mobile.color);
	   System.out.println("price of mobile is " +mobile.price);
	   System.out.println("the OS is "+mobile.os);
	   System.out.println("the memory storage is " +mobile.memoryStorage);
	   System.out.println("screen size is " +mobile.screenSize);	    
		 
	  Mobile mobile1=new Mobile();
	  mobile1.id=002;
	  mobile1.brandName="samsung galaxy s20 fe 5g";
	  mobile1.address="amazon";
	  mobile1.color="cloud navy";
	  mobile1.price=39990;
	  mobile1.os="android 11.0";
	  mobile1.memoryStorage=128;
	  mobile1.screenSize=6.5;
	   System.out.println("id of mobile "+mobile1.id);
	   System.out.println("the name of brand is" +mobile1.brandName);
	   System.out.println("the address is "+mobile1.address);
	   System.out.println("the color is " +mobile1.color);
	   System.out.println("price of mobile is " +mobile1.price);
	   System.out.println("the OS is "+mobile1.os);
	   System.out.println("the memory storage is " +mobile1.memoryStorage);
	   System.out.println("screen size is " +mobile1.screenSize);
	   
	  Mobile mobile2=new Mobile();
	  mobile2.id=003;
	  mobile2.brandName="Mi 11x pro";
	  mobile2.address="amazon";
	  mobile2.color="cosmic black";
	  mobile2.price=29990;
	  mobile2.os="android 11,MIUI 12";
	  mobile2.memoryStorage=128;
	  mobile2.screenSize=6.67;
	   System.out.println("id of mobile "+mobile2.id);
	   System.out.println("the name of brand is" +mobile2.brandName);
	   System.out.println("the address is "+mobile2.address);
	   System.out.println("the color is " +mobile2.color);
	   System.out.println("price of mobile is " +mobile2.price);
	   System.out.println("the OS is "+mobile2.os);
	   System.out.println("the memory storage is " +mobile2.memoryStorage);
	   System.out.println("screen size is " +mobile2.screenSize);
	   
	  Mobile mobile3=new Mobile();
	  mobile3.id=004;
	  mobile3.brandName="OnePlus 10R 5G";
	  mobile3.address="amazon";
	  mobile3.color="sierra black";
	  mobile3.price=38990;
	  mobile3.os="OxygenOS";
	  mobile3.memoryStorage=128;
	  mobile3.screenSize=6.7;
	   System.out.println("id of mobile "+mobile3.id);
	   System.out.println("the name of brand is" +mobile3.brandName);
	   System.out.println("the address is "+mobile3.address);
	   System.out.println("the color is " +mobile3.color);
	   System.out.println("price of mobile is " +mobile3.price);
	   System.out.println("the OS is "+mobile3.os);
	   System.out.println("the memory storage is " +mobile3.memoryStorage);
	   System.out.println("screen size is " +mobile3.screenSize);
  }
	  
	  public void toCommunicate(){
		  
		  System.out.println("mobile is needed to communicate with people staying far");
		  
	  }
  }





