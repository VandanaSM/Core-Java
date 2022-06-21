class Geyser{
     static String brandName="Bajaj";
     static String color="white";
     static String material="metal";
     static String powerSource="corded electric";
	 static boolean isTurnedOn;
	 static int minHeating=0;
	 static int maxHeating=100;
	 static int moderateHeating;
	 
   
   public static void onOrOff(){
     if(isTurnedOn==false){
	    System.out.println("geyser is off");
	 isTurnedOn=true;
	 System.out.println("geyser is on");
	 }else if(isTurnedOn==true){
	      System.out.println("geyser is on");
	 isTurnedOn=false;
	 System.out.println("geyser is off");
	 }
    }
	
	public static void increasingHeating(){
		System.out.println("start of increasingHeating() method");
		if(moderateHeating<maxHeating){
			moderateHeating=moderateHeating+1;
			System.out.println("moderateHeating is: " +moderateHeating);
		}else 
	}
	public static void main(String[] args){
	  onOrOff();
	  onOrOff();
	
	}
   




}