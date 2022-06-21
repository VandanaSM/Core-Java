class Division{
  
  public static void main(String[] args){
      
	  div(54,32);
	  div(80,24);
	  div(44,20);
	  div(56,24);
	  int finalValue=divide(40,2);
	  System.out.println("division of two numbers is" +finalValue);
	  int finalValue1=divide(20,4);
	  System.out.println("division of two numbers is "+finalValue1);
  
  }
  
  public static void div(int x,int y){
	  System.out.println("Division of two numbers:" + x/y);
  }
  
  public static int divide(int a,int b){
	  
  return a/b;
  }

}