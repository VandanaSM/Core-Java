class Factorial{

 public static void main(String[] args){
 
  int factValue=fact(5);
  System.out.println(factValue);
 
 }
 
 public static int fact(int factNumber){
    System.out.println("Start of fact method");
	int f=1;                             ///local variable   as 0!=1 so given f=1 and its value gets changed after each loop 
	for(int i=1;i<=factNumber;i++){      ///as 5!=1*2*3*4*5 startes with 1 so i=1,  and for 5=5
	     f=f*i;
	}                                             //for i=4,f=24(1*2*3*4)   4<=5;true----f=24*5
 return f;
 }



}