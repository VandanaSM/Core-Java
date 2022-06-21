class Hospitals{
  int id;
  String name;	
  String address;
  long contactNo;
  String type;
  int noOfDoctors;
  
  public Hospitals(){
	  
	  System.out.println("object Hospitals is created");
  }

  public static void main (String[] args){
	  Hospitals hospital=new Hospitals();
	  hospital.id=001;
	  hospital.name="narayana nethralaya";
	  hospital.address="Rajajinagar";
	  hospital.contactNo=9987358758L;
	  hospital.type="eye care center";
	  hospital.treatPatients();
	   System.out.println("id of hospital is "+hospital.id);
	   System.out.println("name of hospital is " +hospital.name);
	   System.out.println("the address of Hospitals is "+hospital.address);
	   System.out.println("the contact no is " +hospital.contactNo);
	   System.out.println("type of hospital is" +hospital.type);
	   
	  Hospitals hospital1=new Hospitals();
	  hospital1.id=002;
	  hospital1.name="fortis";
	  hospital1.address="rajajinagar ";
	  hospital1.contactNo=9090943590L;
	  hospital1.type="multi-speciality";
	   System.out.println("id of hospital is "+hospital1.id);
	   System.out.println("name of hospital is " +hospital1.name);
	   System.out.println("the address of Hospitals is "+hospital1.address);
	   System.out.println("the contact no is " +hospital1.contactNo);
	   System.out.println("type of hospital is" +hospital1.type);
	   
	  Hospitals hospital2=new Hospitals();
	  hospital2.id=003;
	  hospital2.name="manipal";
	  hospital2.address="yeshwantpur";
	  hospital2.contactNo=9345708734L;
	  hospital2.type="multi-speciality";
	   System.out.println("id of hospital is "+hospital2.id);
	   System.out.println("name of hospital is " +hospital2.name);
	   System.out.println("the address of Hospitals is "+hospital2.address);
	   System.out.println("the contact no is " +hospital2.contactNo);
	   System.out.println("type of hospital is" +hospital2.type);
	   
	   	   
	  Hospitals hospital3=new Hospitals();
	  hospital3.id=003;
	  hospital3.name="narayana";
	  hospital3.address="hsr layout";
	  hospital3.contactNo=9834989925L;
	  hospital3.type="super speciality";
	   System.out.println("id of hospital is "+hospital3.id);
	   System.out.println("name of hospital is " +hospital3.name);
	   System.out.println("the address of Hospitals is "+hospital3.address);
	   System.out.println("the contact no is " +hospital3.contactNo);
	   System.out.println("type of hospital is" +hospital3.type);
	   
	  
  }
    public void treatPatients(){
		
		System.out.println("hospitals treat patients and save their lives");
	}

}