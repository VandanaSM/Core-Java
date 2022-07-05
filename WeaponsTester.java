class WeaponsTester{

    public static void main(String[] args){
	  Weapons wp = new Weapons();
	  wp.setId(001);
	  wp.setName("dagger");
	  wp.setType("knife");
	  wp.setPrice(1000);
	  wp.toHurtOthers();
	  
	  System.out.println(wp.getId() + " " + wp.getName() + " " + wp.getType() + " " +  wp.getPrice());
	  
  }


}