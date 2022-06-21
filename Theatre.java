class Theatre{

   String name;
   String address;
   long contactNo;
   String ownerName;
   String[] runningMovies;
  
  public static void main(String[] args){
     name="Veeresh";
	 address="Magadi Road";
	 contactNo=8980454999L;
	 ownerName="Avbbscuidf";
	 runningMovies={"Charlie 777","Vikram"};
	 String theatreDetails();
 }
 
 public static void theatreDetails(){
   System.out.println("Theatre name is" +name);
   System.out.println("Address is" +address);
   System.out.println("Contact NO is" +contactNo);
   System.out.println("Owner name is" +ownerName);
   System.out.println("Movies running are" +runningMovies);
 }
  
  
  
  
}