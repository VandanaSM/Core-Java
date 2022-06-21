class Vegetables{

    static String vegetables[]={"Bitter gourd","Carrot","Spinach","Potato","Beet root","Broccoli"};
	
  public static void main(String[] args){
  
  String vegetable=getVegetable("Broccoli");
  System.out.println("my fav vegetable is " +vegetable);
  
  }

  public static String getVegetable(String vegetable){
    String vegetableName=null;
	for(int i=0;i<vegetables.length;i++){
	   if(vegetables[i]==vegetable){
	      vegetableName=vegetable;
	   }else{
		   System.out.println(vegetable + "is not available");
	   }
	 
	 }
  
  return vegetable;
  }


}