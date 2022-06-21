class Multiply{

 public static void main(String[] args){
	 multi(32,34);
	 multi(65,76);
	 multi(12,76);
	 multi(2,73);
	 int finalValue=product(45,3);
	 System.out.println("product of two numbers is "+finalValue);
	 int finalValue1=product(90,5);
	 System.out.println("product of two numbers is "+finalValue1);
 }
 public static void multi(int c,int d){
	 System.out.println("Multiplication of two numbers is:" + c*d);
 }
 
 public static int product(int a,int b){
	 return a*b;
 }
 

}