class PetrolBunk{

///instance and static variables
  int petrolBunkId;
  String name;
  static String location="Bangalore";
  long contactNo;
  String gstNo;
  
  //parameterised constructor
  public PetrolBunk(int petrolBunkId,String name,long contactNo,String gstNo){
	  
	  System.out.println("object petrolBunk is created");
	  this.petrolBunkId=petrolBunkId;
	  this.name=name;
	  this.contactNo=contactNo;
	  this.gstNo=gstNo;
	  
	  }
	  //main method started
  public static void main(String[] args){
	  System.out.println("location of petrol bunk is " +location);
	  PetrolBunk bunk=new PetrolBunk(1,"bharat",8996804967l,"fg98009809dgf");
	  System.out.println("id of the petrol bunk is "+bunk.petrolBunkId);
	  System.out.println("name of the petrol bunk is " +bunk.name);
	  System.out.println("contact number of the petrol bunk is " +bunk.contactNo);
	  System.out.println("gst number of the bunk is " +bunk.gstNo);
	  
	  PetrolBunk bunk1=new PetrolBunk(2,"indian oil",9860459609l,"hg8798768gdg79");
	  System.out.println("id of the petrol bunk is "+bunk1.petrolBunkId);
	  System.out.println("name of the petrol bunk is " +bunk1.name);
	  System.out.println("contact number of the petrol bunk is " +bunk1.contactNo);
	  System.out.println("gst number of the bunk is " +bunk1.gstNo);
	  
	  PetrolBunk bunk2=new PetrolBunk(3,"hindustan petroleum",4879548640l,"fgh87907fh0h");
	  System.out.println("id of the petrol bunk is "+bunk2.petrolBunkId);
	  System.out.println("name of the petrol bunk is " +bunk2.name);
	  System.out.println("contact number of the petrol bunk is " +bunk2.contactNo);
	  System.out.println("gst number of the bunk is " +bunk2.gstNo);
	  
  }



}