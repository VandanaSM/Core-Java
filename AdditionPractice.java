class AdditionPractice{
    int a;
    int b;
     int c;
  public AdditionPractice(int a,int b){
	 this();
	 this.a=a;
	 this.b=b;
	 System.out.println("object AdditionPractice is created");
	}
	
  public AdditionPractice(){
	  //this(10,15);
	  System.out.println("object ");
  }
  
  public static void main(String[] args){
	  
  AdditionPractice add=new AdditionPractice(10,15);
  add.c= add.a+add.b;
  System.out.println(add.c);
  }

  
}