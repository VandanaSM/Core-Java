class Torch{
  
    static String brandName = "Syska";
	static String style="glam";
	static String lightSourceType="LED";
	static String material="ABS plastic";
	static String color="Green white";
	static boolean isTurnedOn;
	static int highIntensity=3;
	static int lowIntensity;
	static int currentIntensity;

  public static void onOrOff(){
     if(isTurnedOn==false){
	   System.out.println("Torch is off");
	   System.out.println("turn the button on");
	   isTurnedOn=true;
	   System.out.println("Torch is on");
	 }else if(isTurnedOn==true){
	   System.out.println("Torch is on,turn button off");
	   isTurnedOn=false;
	   System.out.println("Torch is off");
	 }
    }
	
  public static void increaseIntensity(){
	  System.out.println("increaseIntensity method started");
	  if(isTurnedOn==true){
		  System.out.println("torch is on");
		 if(currentIntensity<highIntensity){
			 currentIntensity=currentIntensity+1;
			 System.out.println("currentIntensity of torch is " +currentIntensity);
		    }
		 else{
			 System.out.println("max intensity of torch reached");
		 }
		}else{
			System.out.println("turn on torch");
		}
	    System.out.println("increaseIntensity method ended");
  }
  
  public static void decreaseIntensity(){
	  System.out.println("decreaseIntensity method started");
	  if(isTurnedOn==true){
		     System.out.println("torch is on");
		   if(currentIntensity>lowIntensity){
			   currentIntensity=currentIntensity-1;
			   System.out.println("currentIntensity of torch is " +currentIntensity);
			}else{
				System.out.println("min intensity of torch is");
			}
        }else{
			System.out.println("decrease intensity of torch light");
		}
		System.out.println("decrease intensity method ended");
  }
  public static void main(String[] args){
    onOrOff();
	increaseIntensity();
	decreaseIntensity();
	onOrOff();
	increaseIntensity();
	increaseIntensity();
	increaseIntensity();
	increaseIntensity();
	onOrOff();
	increaseIntensity();
	decreaseIntensity();
	increaseIntensity();
	decreaseIntensity();
	decreaseIntensity();
	increaseIntensity();
	increaseIntensity();
  }

}