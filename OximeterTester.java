class OximeterTester{

  public static void main(String[] atgs){
    OximeterDTO oxi=new OximeterDTO();
	oxi.setId(001);
	oxi.setName("Zebronics");
	oxi.setPrice(1000);
	oxi.setUse("to measure oxygen levels in body");
	oxi.setNormalReading(90);
	oxi.toCheckOxygenLevels();
	
	System.out.println(oxi.getId() + " " + oxi.getName() + " " + oxi.getPrice() + " " + oxi.getUse() + " " + oxi.getNormalReading());
  }

}