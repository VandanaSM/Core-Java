class Speakers{

    static String brandName = "JBL";
	static double price = 2000;
	static String batteryLife = "8-10 hrs";
    static boolean isConnected;
	static int maxVolume=6; 
	static int minVolume;   
	static int currentVolume;
  public static void onOrOff(){
   	

     System.out.println("invoking onOrOff()");
	   if(isConnected==false){
	    System.out.println("Speaker is turned off need to on to connect");
		isConnected=true;
		System.out.println("Speaker is turned on.....available to connect");
	   }
	   else if(isConnected==true){
	   System.out.println("Speakers are connected,has to be turned off");
	   isConnected=false;
	   System.out.println("Speaker is turned off....");
	   }
    }
	
  public static void increaseVolume(){
	  System.out.println("increaseVolume method is started");
	  if(isConnected==true){
		  System.out.println("Speakers are connected");
	    if(currentVolume<maxVolume){
			currentVolume=currentVolume+1;
			System.out.println("Current volume is "+currentVolume);
		}else{
			System.out.println("Max volume is reached");
		}
	  }else{
		  System.out.println("turn on the speakers");
	  }
	  System.out.println("increaseVolume method is ended");
  }
  
  public static void decreaseVolume(){
	  System.out.println("decrease volume method started");
	  if(isConnected==true){
		  System.out.println("Speakers are connected");
		if(currentVolume>minVolume){
			currentVolume=currentVolume-1;
			System.out.println("Current volume is "+currentVolume);
		}else{
			System.out.println("Min volume is reached");
		}
	  }else{
		  System.out.println("turn on the speakers");
	  }
	  System.out.println("decreaseVolume method is ended");
  }
  
  public static void main(String[] args){
  
    onOrOff();
    onOrOff();
	onOrOff();
	increaseVolume();
    increaseVolume();
	decreaseVolume();
	increaseVolume();
	increaseVolume();
	decreaseVolume();
    increaseVolume();
    increaseVolume();
	increaseVolume();
    increaseVolume();
    decreaseVolume();
	onOrOff();
	decreaseVolume();



  }




}