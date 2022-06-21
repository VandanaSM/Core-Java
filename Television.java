class Television{
   static String brandName="Samsung";
   static String resolution="4k";
   static String displayTechnology="QLED";
   static int screenSizeInInches=108;
   static boolean isTurnedOn;
   static int maxVolume=100;
   static int minVolume;
   static int currentVolume;
   
   
   public static void onOrOff(){
	 if(isTurnedOn==false){
	  System.out.println("Television is off and need to be on");
	  isTurnedOn=true;
	  System.out.println("Press power button to on televsion");
	  System.out.println("Television is on");
	 }else if(isTurnedOn==true){
	  System.out.println("Television is on and need to be off");
	  isTurnedOn=false;
	  System.out.println("press power button to off television");
	  System.out.println("Television is off");
	 }
   }
   
    public static void increaseVolume(){
	  System.out.println("increaseVolume method is started");
	  if(isTurnedOn==true){
		  System.out.println("Television is turned on");
	    if(currentVolume<maxVolume){
			currentVolume=currentVolume+10;
			System.out.println("Current volume is "+currentVolume);
		}else{
			System.out.println("Max volume is reached");
		}
	  }else{
		  System.out.println("turn on the Television");
	  }
	  System.out.println("increaseVolume method is ended");
  }
  
  
   public static void decreaseVolume(){
	  System.out.println("decrease volume method started");
	  if(isTurnedOn==true){
		  System.out.println("Television is turned on");
		if(currentVolume>minVolume){
			currentVolume=currentVolume-10;
			System.out.println("Current volume is "+currentVolume);
		}else{
			System.out.println("Min volume is reached");
		}
	  }else{
		  System.out.println("turn on the Television");
	  }
	  System.out.println("decreaseVolume method is ended");
  }

   public static void main(String[] args){
      onOrOff();
	  increaseVolume();
	  increaseVolume();
	  increaseVolume();
	  decreaseVolume();
	  increaseVolume();
	  increaseVolume();
	  decreaseVolume();
	  onOrOff();
	  increaseVolume();
	  decreaseVolume();
	  onOrOff();
	  decreaseVolume();
	  decreaseVolume();

   }
}