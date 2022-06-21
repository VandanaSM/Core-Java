class Institutes{
///instance and static variable
  int id;
  String type;
  static String location;
  long contactNo;
  //parameterised constructor  to init instance variable of class
  public Institutes(int id,String type,long contactNo){
  System.out.println("Institutes object created");
  ///this keyword help compiler to point to instance variable
  this.id=id;   ///this used with instance variables and when constructor parameter are same as instance var
  this.type=type;
  this.contactNo=contactNo;
  }
  //main method started
  public static void main(String[] args){
	  System.out.println("location of the institutes are "+location);
	  Institutes insti=new Institutes(1,"govt exams",8996476879l);
	  System.out.println("institute id is " +insti.id);
	  System.out.println("type of the institute is "+insti.type);
	  System.out.println("contact no of institute is " +insti.contactNo);
	  
	  Institutes insti1=new Institutes(2,"programming",9894579384l);
	  System.out.println("institute id is " +insti1.id);
	  System.out.println("type of the institute is "+insti1.type);
	  System.out.println("contact no of institute is " +insti1.contactNo);
	  
	  Institutes insti2=new Institutes(3,"civil softwares",9898989787l);
	  System.out.println("institute id is " +insti2.id);
	  System.out.println("type of the institute is "+insti2.type);
	  System.out.println("contact no of institute is " +insti2.contactNo);
  }
  
  





}