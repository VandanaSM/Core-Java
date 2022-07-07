class BigBasketTester{

    public static void main(String[] args){
	  BigBasketDTO mp = new BigBasketDTO();
	  mp.setId(001);
	  mp.setName("BigBasket");
	  mp.setType("grocery");
	  mp.setItemsAvailable("veg,fruits,grocery");
	  mp.toBuyGrocery();
	  
	  System.out.println(mp.getId() + " " + mp.getName() + " " + mp.getType() + " " +  mp.getItemsAvailable());
	  
  }


}