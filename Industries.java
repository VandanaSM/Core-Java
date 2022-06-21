class Industries{
//instance and static variables 
  int id;
  String type;
  static String location;
  double noOfEmplyees;
  
  //parameterised constructor
  public Industries(int id,String type,double noOfEmplyees){
	  System.out.println("Industries object created");
	  this.id=id;
	  this.type=type;
	  this.noOfEmplyees=noOfEmplyees;
  }
  
  //main method started
  public static void main(String[] args){
	  Industries indus=new Industries(1,"large scale",250.0);
	  System.out.println("id of industries is "+indus.id);
	  System.out.println("type of industries is "+indus.type);
	  System.out.println("no of employees in " +indus.type +" are " +indus.noOfEmplyees);
	  
	  Industries indus1=new Industries(2,"mid scale",50.0);
	  System.out.println("id of industries is "+indus1.id);
	  System.out.println("type of industries is "+indus1.type);
	  System.out.println("no of employees in " +indus1.type +" are " +indus1.noOfEmplyees);
	  
	  Industries indus2=new Industries(3,"small scale",10.0);
	  System.out.println("id of industries is "+indus2.id);
	  System.out.println("type of industries is "+indus2.type);
	  System.out.println("no of employees in " +indus2.type +" are " +indus2.noOfEmplyees);
	  
  }
  




}