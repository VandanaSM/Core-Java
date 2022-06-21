class Biscuits{
	
	static String biscuits[]={"Sunfeast","Parle","Britania","Dukes","Oreo","Unibic"};
	
  public static void main(String[] args){
	 
	String biscuitNeeded=getBiscuit("Oreo");
	System.out.println("Biscuit needed is "+biscuitNeeded);
	  
	  
  }

  public static String getBiscuit(String biscuit){
	  String biscuitName=null;
	  for(int i=0;i<biscuits.length;i++){
		 if(biscuits[i]==biscuit){
			 biscuitName=biscuit;
		 } else{
			 System.out.println(biscuit" is not available");
		 }
		  
	  }
   return biscuit;
  }





}