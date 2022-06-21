class Substraction{

 public static void main(String[] args){
   sub(89,34);
   sub(54,43);
   sub(565,232);
   sub(34,21);
   int finalValue=difference(20,4);
   System.out.println("Difference of two numbers is "+finalValue);
   int finalValue1=difference(30,10);
   System.out.println("Difference of two numbers is "+finalValue1);
 }
 
 public static void sub(int a,int b){
    System.out.println("Difference of two numbers is: " +(a-b));
 }
 
 public static int difference(int x,int y){
	 return x-y;
 }
}