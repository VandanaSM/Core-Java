class CarryBagTester{

   public static void main(String[] args){
      
	  CarryBagDTO carry=new CarryBagDTO();
	  /*carry.name="Baba's carry bag";
	  carry.price=5;
	  carry.holdThings(); */
	  
	  carry.setName("Baba's carry bag");
	  carry.setPrice(5);
	  System.out.println(carry.getName() + "  " + carry.getPrice());
	  carry.holdThings();
   }



}