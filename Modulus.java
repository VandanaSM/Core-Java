class Modulus{

   public static void main(String[] args){
     mod(90,35);
	 mod(87,11);
	 mod(66,22);
	 mod(21,8);
	 int finalValue=remainder(45,2);
	 System.out.println("remainder is" +finalValue);
	 int finalValue1=remainder(78,4);
	 System.out.println("remainder is "+finalValue1);
   }
   public static void mod(int x,int y){
     System.out.println("Modulo of two numbers is:" + x%y);
   
   }
   
   public static int remainder(int x,int y){
	   return x%y;
   }



}