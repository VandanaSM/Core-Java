class Transportation{

//instance and static variable
  int transportId;
  String mediumOfTransport;
  static String originPlace="Bangalore";
  static String destination="Gulbarga";
  int timeOfTravel;
  double price;
  
  ///parameterised constructor
  public Transportation(int transportId,String mediumOfTransport,int timeOfTravel,double price){
	  
	  System.out.println("object Transportation is created");
	  this.transportId=transportId;
	  this.mediumOfTransport=mediumOfTransport;
	  this.timeOfTravel=timeOfTravel;
	  this.price=price;
  }
  
  //main method started
  public static void main(String[] args){
	  System.out.println("place of origin is "+originPlace);
	  System.out.println("destination is " +destination);
	  throughBus();
	  throughTrain();
	  throughFlight();
	  
  }

  public static void throughBus(){
	  Transportation throughBus =new Transportation(1,"Bus",12,1200.00);
	  System.out.println("id of the transport is "+throughBus.transportId);
	  System.out.println("medium of transport is " +throughBus.mediumOfTransport);
	  System.out.println("Time taken to reach destination is " +throughBus.timeOfTravel + " hours");
	  System.out.println("amount spent to reach destination is " +throughBus.price);
  }
  
    public static void throughTrain(){
	  Transportation throughTrain =new Transportation(2,"Train",10,380.00);
	  System.out.println("id of the transport is "+throughTrain.transportId);
	  System.out.println("medium of transport is " +throughTrain.mediumOfTransport);
	  System.out.println("Time taken to reach destination is " +throughTrain.timeOfTravel + " hours");
	  System.out.println("amount spent to reach destination is " +throughTrain.price);

    }
	
	 public static void throughFlight(){
	  Transportation throughFlight =new Transportation(3,"Flight",1,2500);
	  System.out.println("id of the transport is "+throughFlight.transportId);
	  System.out.println("medium of transport is " +throughFlight.mediumOfTransport);
	  System.out.println("Time taken to reach destination is " +throughFlight.timeOfTravel + " hours");
	  System.out.println("amount spent to reach destination is " +throughFlight.price);

    }

}