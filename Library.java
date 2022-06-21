class Library{
//static and instance variables
  int libraryId;
  String type;
  static String location="Bangalore";
  long contactNo;
  
  //parameterised constructor 
  public Library(int libraryId,String type,long contactNo){
	  
	  System.out.println("object Library is created");
	  this.libraryId=libraryId;
	  this.type=type;
	  this.contactNo=contactNo;
	  
  }
  
  //main method started
  public static void main(String[] args){
	  
	  Library lib =new Library(1,"School",8789798743l);
	  System.out.println("id of the library is "+lib.libraryId);
	  System.out.println("Type of the library is " +lib.type);
	  System.out.println("contact number od the library is " +lib.contactNo);
  

      Library lib1 =new Library(2,"college",8978538589l);
	  System.out.println("id of the library is "+lib1.libraryId);
	  System.out.println("Type of the library is " +lib1.type);
	  System.out.println("contact number od the library is " +lib1.contactNo);

   

      Library lib2 =new Library(3,"open library",8857567577l);
	  System.out.println("id of the library is "+lib2.libraryId);
	  System.out.println("Type of the library is " +lib2.type);
	  System.out.println("contact number od the library is " +lib2.contactNo);

 
  }
}