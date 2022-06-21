class ShowRoom1{
 
  //instance and static variables
  int showRoomId;    
  static String name="Woodland"; ////can be shared among instance objects---previlage given to static members as loaded at class loading
  String location;     ////cannot be shared among other objects----loaded at object creation
  static int noOfBranches=58;///saves memory by loading only once 
  long contactNo;
  
  ////parameterised constructor   constructor to init instance variables in class
  public ShowRoom1(int showRoomId,String location,long contactNo){
  
    System.out.println("ShowRoom1 object is created");
	this.showRoomId=showRoomId;
	this.location=location;
	this.contactNo=contactNo;

  
  }
  /*public ShowRoom1(int id,String loc,long cNo){
	  
	  showRoomId=id;
	  location=loc;
	  contactNo=cNo;
	  
  }*/
  //main method starting point
  public static void main(String[] args){
      
	 System.out.println("name of the showroom is "+ShowRoom1.name);//thebehaviour of calling static members is using className
	 System.out.println("no of the branches "+ShowRoom1.noOfBranches);//thebehaviour of calling static members is using className
//constructor are used to init instance variables of a class
     ShowRoom1 show=new ShowRoom1(1,"commercial street",8768776878l); //assign values of instance variables
	/* show.showRoomId=1;
     show.location="commercial street";
     show.contactNo=8768776878l;
	 System.out.println("the showroom id is " +show.showRoomId);
	 System.out.println("location of the showroom is " +show.location);
	 System.out.println("contact no of the showroom is " +show.contactNo);*/
	 System.out.println(show.showRoomId);
	 System.out.println(show.location);
	 System.out.println(show.contactNo);
	 System.out.println(show.showRoomId + "  " +show.location + "  " +show.contactNo);
	 
	 
  
      ShowRoom1 show1=new ShowRoom1(2,"Vijaynagar",7985689454l);
	/* show1.showRoomId=2;
     show1.location="Vijaynagar";
     show1.contactNo=7985689454l;
	 System.out.println("the showroom id is " +show1.showRoomId);
	 System.out.println("location of the showroom is " +show1.location);
	 System.out.println("contact no of the showroom is " +show1.contactNo);*/
	 System.out.println(show1.showRoomId);
	 System.out.println(show1.location);
	 System.out.println(show1.contactNo);
  
  }




}