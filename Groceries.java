class Groceries{

  static String groceryItems[]={"Chakki attta","Besan","Moong dal","sooji rava","toor dal","jeera"};
  
  public static void main(String[] args){
	  
	String groceryItem=getGroceryItem("toor dal");
	System.out.println("the grocery item needed is "+groceryItem);
	  
  }

  public static String getGroceryItem(String grocery){
	 String groceryName=null;
	   for(int i=0;i<groceryItems.length;i++){
		  if(groceryItems[i]==grocery){ 
		   groceryName=grocery;
		  }else{
			  System.out.println(grocery "is not available");
		  }
	   }
	  
	return grocery;  
  }



}