class RumTester{

  public static void main(String[] args){
    OldMonk old = new OldMonk();
	  old.price=450;
	  old.quantity="750 ml";
      old.alcoholContent="40.7 %";
      old.mfgDate="25 March 2022";
      old.expiry="best before 24 months";
      old.toDrink();
    System.out.println(old.price + "  " + old.quantity + "  " + old.alcoholContent + "  " + old.mfgDate + "  " + old.expiry);
  }

}