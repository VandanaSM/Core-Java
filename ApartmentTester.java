class ApartmentTester{

  public static void main(String[] args){
    ApartmentDTO ap=new ApartmentDTO();
    ap.setId(1);
	ap.setPrice(25000);
	ap.setName("abc");
	ap.setOwner("xyz");
	
	System.out.println(ap.getId() + " " + ap.getPrice() + " " + ap.getName() + " " + ap.getOwner());
  }


}