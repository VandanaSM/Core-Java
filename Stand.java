class Stand{
 
   double price;//instance variable
   
   //constructor so no returntype
 public Stand(){
 
   System.out.println("Stand object created");
 
 }
 
 //String args[]---->parameter
 public static void main(String[] args){
   Stand std=new Stand();
   std.price=5250.00;
   std.hold();
   System.out.println("the price of stand is " +std.price);
 
 }
///instance method
 public void hold(){
 
  System.out.println("holding tv");
 
 }


}