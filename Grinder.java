class Grinder{
  static String brandName="Butterfly";
     static String color="white and grey";
     static String material="plastic";
     static int wattage=150;
	 static int weightInGrams=11240;
	 static boolean isTurnedOn;
	 static int maxSpeed=3;
	 static int minSpeed;
	 static int currentSpeed;
   
   public static void onOrOff(){
     if(isTurnedOn==false){
	    System.out.println("Grinder is off");
	 isTurnedOn=true;
	 System.out.println("Grinder is on");
	 }else if(isTurnedOn==true){
	   System.out.println("Grinder is on");
	   isTurnedOn=false;
	   System.out.println("Grinder is off");
	 }
    }
	
	   public static void increaseSpeed(){
	  System.out.println("increaseSpeed method is started");
	  if(isTurnedOn==true){
		  System.out.println("Grinder is turned on");
	    if(currentSpeed<maxSpeed){
			currentSpeed=currentSpeed+1;
			System.out.println("Current speed is "+currentSpeed);
		}else{
			System.out.println("Max speed is reached");
		}
	  }else{
		  System.out.println("turn on the Grinder");
	  }
	  System.out.println("increaseSpeed method is ended");
  }
  
  
   public static void decreaseSpeed(){
	  System.out.println("decreaseSpeed method started");
	  if(isTurnedOn==true){
		  System.out.println("Grinder is turned on");
		if(currentSpeed>minSpeed){
			currentSpeed=currentSpeed-1;
			System.out.println("Current speed is "+currentSpeed);
		}else{
			System.out.println("Min speed is reached");
		}
	  }else{
		  System.out.println("turn on the Grinder");
	  }
	  System.out.println("decreaseSpeed method is ended");
  }
	public static void main(String[] args){
	  onOrOff();
	  decreaseSpeed();
	  increaseSpeed();
	  decreaseSpeed();
	  increaseSpeed();
	  decreaseSpeed();
	  increaseSpeed();
	  increaseSpeed();
	  increaseSpeed();
	  increaseSpeed();
	  onOrOff();
	  increaseSpeed();
	  onOrOff();
	  decreaseSpeed();
	  increaseSpeed();
	  decreaseSpeed();
	}
   




}

