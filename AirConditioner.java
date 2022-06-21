class AirConditioner{
     static String brandName="LG";
	 static String powerSource="corded electric";
	 static String modelName="MS-Q18YNZA";
	 static String color="white";
	 static String dim="21*99*33 cm";
	 static int weightInGrams= 39500;
	 static boolean isTurnedOn;
	 static int maxCoolingCapacity=50;
	 static int minCoolingCapacity;
	 static int currentCoolingCapacity;
	  
   public static void onOrOff(){
     System.out.println("invoking onOrOff");
	 if(isTurnedOn==false){
	 System.out.println("AC is off");
	    isTurnedOn=true;
     System.out.println("AC is on");
	 }else if (isTurnedOn==true){
	 System.out.println("AC is on");
	    isTurnedOn=false;
	 System.out.println("AC is off");
	 }
   }
   
      public static void increaseCoolingCapacity(){
	  System.out.println("increaseCoolingCapacity method is started");
	  if(isTurnedOn==true){
		  System.out.println("AirConditioner is turned on");
	    if(currentCoolingCapacity<maxCoolingCapacity){
			currentCoolingCapacity=currentCoolingCapacity+1;
			System.out.println("currentCoolingCapacity is "+currentCoolingCapacity);
		}else{
			System.out.println("max Cooling Capacity is reached");
		}
	  }else{
		  System.out.println("turn on the AirConditioner");
	  }
	  System.out.println("increaseCoolingCapacity method is ended");
  }
  
  
   public static void decreaseCoolingCapacity(){
	  System.out.println("decreaseCoolingCapacity method started");
	  if(isTurnedOn==true){
		  System.out.println("AirConditioner is turned on");
		if(currentCoolingCapacity>minCoolingCapacity){
			currentCoolingCapacity=currentCoolingCapacity-1;
			System.out.println("Current cooling capacity is "+currentCoolingCapacity);
		}else{
			System.out.println("min CoolingCapacity is reached");
		}
	  }else{
		  System.out.println("turn on the AirConditioner");
	  }
	  System.out.println("decreaseCoolingCapacity is ended");
  }
   public static void main(String[] args){
     onOrOff();
	 decreaseCoolingCapacity();
	 increaseCoolingCapacity();
	 onOrOff();
	 decreaseCoolingCapacity();
	 decreaseCoolingCapacity();
	 onOrOff();
	 increaseCoolingCapacity();
	 decreaseCoolingCapacity();
	 increaseCoolingCapacity();
	 decreaseCoolingCapacity();
	 increaseCoolingCapacity();
	 increaseCoolingCapacity();
	 decreaseCoolingCapacity();
   }

}