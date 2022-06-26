class MobileCompanyTester{

  public static void main(String[] args){
    Sony sony=new Sony();
	sony.price=60000;
    sony.internalStorage="4 gb";
    sony.battery="3230 mAh";
    sony.frontCamera="13 MP";
    sony.rearCamera="19 MP";
    sony.display="5.5 inches";
    sony.ram="4 gb";
  
    sony.toCommunicate();
	
	System.out.println(sony.price + " " + sony.internalStorage + " " + sony.battery + " " + sony.frontCamera + " " + 
	                   sony.rearCamera + " " + sony.display + " " + sony.ram);
  
  }


}