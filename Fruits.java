class Fruits{

   static String fruits[]={"Butterfruit","Mango","Watermelon","Chickoo","Apple","Grapes"};
   
  public static void main(String[] args){
  
  String fruit=getfruit("Butterfruit");
  System.out.println("Name of the fruit is " +fruit);
  
  }
  
  public static String getfruit(String fruit){
    String fruitName=null;
	for(int i=0;i<fruits.length;i++){
		if(fruits[i]==fruit){
			fruitName=fruit;
		}else{
			System.out.println(fruit + " is not available");
		}
	
	}
  
  return fruit;
  }


}