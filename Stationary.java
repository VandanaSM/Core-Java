class Stationary{
  int id;
  String name;
  String address;
  long contactNo;
  String ownerName;
  boolean xeroxAvailable;
  
  public Stationary(){
	  
	  System.out.println("object Stationary is created");
	  
  }
 
  public static void main (String[] args){
	  Stationary stationary=new Stationary();
	  stationary.id=001;
	  stationary.name="manish";
	  stationary.address="Rajajinagar";
	  stationary.contactNo=9892345897L;
	  stationary.ownerName="abc";
	  stationary.xeroxAvailable=true;
	  stationary.buyStationaryItems();
	   System.out.println("stationary shop id is" +stationary.id);
	   System.out.println("name of stationary shop is " +stationary.name);
	   System.out.println("the address of stationary is "+stationary.address);
	   System.out.println("the contact no is " +stationary.contactNo);
	   System.out.println("owner name is "+stationary.ownerName);
	   if(stationary.xeroxAvailable==true){
		   System.out.println("xerox is available");
	   }else{
		   System.out.println("xerox not available");
	   }
	   
	  Stationary stationary1=new Stationary();
	  stationary1.id=002;
	  stationary1.name="swapna";
	  stationary1.address="malleswaram";
	  stationary1.contactNo=9982367889L;
	  stationary1.ownerName="cdh";
	  stationary1.xeroxAvailable=false;
	   System.out.println("stationary shop id is" +stationary1.id);
	   System.out.println("name of stationary shop is " +stationary1.name);
	   System.out.println("the address of stationary is "+stationary1.address);
	   System.out.println("the contact no is " +stationary1.contactNo);
	   System.out.println("owner name is "+stationary1.ownerName);
	   if(stationary1.xeroxAvailable==true){
		   System.out.println("xerox is available");
	   }else{
		   System.out.println("xerox not available");
	   }
	   
	  Stationary stationary2=new Stationary();
	  stationary2.id=003;
	  stationary2.name="papercraft";
	  stationary2.address="banshankari";
	  stationary2.contactNo=9783425699L;
	  stationary2.ownerName="efg";
	  stationary2.xeroxAvailable=true;
	   System.out.println("stationary shop id is" +stationary2.id);
	   System.out.println("name of stationary shop is " +stationary2.name);
	   System.out.println("the address of stationary is "+stationary2.address);
	   System.out.println("the contact no is " +stationary2.contactNo);
	   System.out.println("owner name is "+stationary2.ownerName);
	   if(stationary2.xeroxAvailable==true){
		   System.out.println("xerox is available");
	   }else{
		   System.out.println("xerox not available");
	   }
	   
	  Stationary stationary3=new Stationary();
	  stationary3.id=004;
	  stationary3.name="renu";
	  stationary3.address="yeshwantpur";
	  stationary3.contactNo=9983245789L;
	  stationary3.ownerName="oper";
	  stationary3.xeroxAvailable=true;
	   System.out.println("stationary shop id is" +stationary3.id);
	   System.out.println("name of stationary shop is " +stationary3.name);
	   System.out.println("the address of stationary is "+stationary3.address);
	   System.out.println("the contact no is " +stationary3.contactNo);
	   System.out.println("owner name is "+stationary3.ownerName);
	   if(stationary3.xeroxAvailable==true){
		   System.out.println("xerox is available");
	   }else{
		   System.out.println("xerox not available");
	   }
	   
	  
  }
  
     public void buyStationaryItems(){
		 System.out.println("to buy stationary items like books,pens,pencils,etc");
		 
	 }
  

}