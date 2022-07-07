class MobileEncapsulationTester{

  public static void main(String[] args){
    MobileEncapsulationDTO me=new MobileEncapsulationDTO();
	me.setName("redmi note 4");
	me.setPrice(13000);
	me.setOs("android");
	me.setScreenSize(5.5);
	me.setMemoryStorage(64);
	
	System.out.println(me.getName() + "is priced at " + me.getPrice() + " with " + me.getOs() + " "+ me.getScreenSize() + " " + me.getMemoryStorage());
    me.toCommunicate();	
  
  }


}