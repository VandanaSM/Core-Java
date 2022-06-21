class WashingMachine{
  
    static String brandName = "Panasonic";
	static String color="silver";
	static int capacityInKgs=8;
	static String maxRotationalSpeed="1400 rpm";
	static String typeOrAccessLocation="Front Load";
	static String humanInterfaceInput="Dail,button";
	static boolean isTurnedOn;
	static int maxSpin=1400;
	static int minSpin=600;
	static int currentSpin=1000;

  public static void onOrOff(){
     if(isTurnedOn==false){
	   System.out.println("w/m is off");
	   System.out.println("turn the button on");
	   isTurnedOn=true;
	   System.out.println("w/m is on");
	 }else if(isTurnedOn==true){
	   System.out.println("w/m is on,turn button off");
	   isTurnedOn=false;
	   System.out.println("w/m is off");
	 }
    }
	
   public static void increaseSpeed(){
	  System.out.println("increaseSpeed method is started");
	  if(isTurnedOn==true){
		  System.out.println("WashingMachine is turned on ");
	    if(currentSpin<maxSpin){
			currentSpin=currentSpin+1;
			System.out.println("Current spin speed is "+currentSpin);
		}else{
			System.out.println("Max spin speed is reached");
		}
	  }else{
		  System.out.println("turn on the washing machine");
	  }
	  System.out.println("increaseSpeed method is ended");
  }
  
  
   public static void decreaseSpeed(){
	  System.out.println("decreaseSpeed method started");
	  if(isTurnedOn==true){
		  System.out.println("WashingMachine is turned on");
		if(currentSpin>minSpin){
			currentSpin=currentSpin-1;
			System.out.println("Current spin speed is "+currentSpin);
		}else{
			System.out.println("Min speed is reached");
		}
	  }else{
		  System.out.println("turn on the WashingMachine");
	  }
	  System.out.println("decreaseSpeed method is ended");
  }
  
  
  public static void main(String[] args){
    onOrOff();
	decreaseSpeed();
	decreaseSpeed();
	increaseSpeed();
	decreaseSpeed();
	onOrOff();
	increaseSpeed();
	decreaseSpeed();
	onOrOff();
	decreaseSpeed();
	increaseSpeed();
	increaseSpeed();
	increaseSpeed();
  }

}