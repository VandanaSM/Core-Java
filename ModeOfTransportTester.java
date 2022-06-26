class ModeOfTransportTester{

  public static void main(String[] args){
   Bus bus=new Bus();
   bus.noOfHours=12;
   bus.destination="Gulbarga";
   bus.placeOfOrigin="Bangalore";
   bus.price=1200;
   bus.noOfSeats=30;
  
   bus.toTravel();
   
	System.out.println(bus.noOfHours + " " + bus.destination + " " + bus.placeOfOrigin+ " " + bus.price + " " + bus.noOfSeats);
  
  }




}