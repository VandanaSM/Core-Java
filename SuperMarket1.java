class SuperMarket1{


   static String fruits[]= {"Butterfruit","Mango","Watermelon","Chickoo","Apple","Grapes"};
   static String vegetables[]= {"Bitter gourd","Carrot","Spinach","Potato","Beet root","Broccoli"};
   static String groceries[]= {"Chakki attta","Besan","Moong dal","sooji rava","toor dal","jeera"};
   static String biscuits[]= {"Sunfeast","Parle","Britania","Dukes","Oreo","Unibic"};
   static String deoderants[]= {"Nivea","Yardley","Eva","Spinz","Engage","Secret temptation"};
   static String chocolates[]= {"Bournville","Dairy milk","Kit kat","Gems","Munch","Ferrero rocher"};
   static String soaps[]= {"Mysore sandal","Himalaya","Rexona","Pears","Fiama","Biotique"};
   static String homeappliances[]= {"Induction","Electric kettle","Mixer and blender","Oven","television","Refridgerator"};
   static String snacks[]= {"Cookies","Bhakarwadi","Chips","Wafers","Nutri bars","Namkeens"};
public static void main(String[] args){
     
	  getFruits();
	  getVegetables();
	  getGroceries();
	  getBiscuits();
	  getDeoderants();
	  getChocolates();
	  getSoaps();
	  getHomeAppliances();
	  getSnacks();
	  String value=getFruit("Butterfruit");
	  System.out.println("my fav fruit is "+value);
	  String value1=getVegetable("Bitter gourd");
	  System.out.println("my fav vegetable is " +value1);
	  String value2=getGrocery("jeera");
	  System.out.println("Grocery item needed is "+value2);
	  String value3=getBiscuit("Oreo");
	  System.out.println("my fav biscuit is "+value3);
	  String value4=getDeoderant("Nivea");
	  System.out.println("My favourite deo is "+value4);
	  String value5=getChocolate("Bournville");
	  System.out.println("my fav chocolate is "+value5);
	  String value6=getSoap("Rexona");
	  System.out.println("I use " +value6 );
	  String value7=getHomeAppliance("Mixer and blender");
	  System.out.println("Home appliance is "+value7);
	  getSnack("Bhakarwadi","Namkeens");
	  //String value getSnack1("Bhakarwadi","Namkeens");
	  //System.out.println("my fav snack items are "+snack1);
	  //System.out.println("my fav snack items are "+snack2);
	  
	  

}
public static void getFruits(){
	System.out.println("List of Fruits********************");
    for(int i=0;i<fruits.length;i++){
		System.out.println(fruits[i]);
	}
}

public static void getVegetables(){
	System.out.println("List of Vegetables********************");
	for(int i=0;i<vegetables.length;i++){
		System.out.println(vegetables[i]);
	}
}
public static void getGroceries(){
	System.out.println("List of Groceries********************");
	for(int i=0;i<groceries.length;i++){
		System.out.println(groceries[i]);
    }
}
public static void getBiscuits(){
	System.out.println("List of Biscuits********************");
	for(int i=0;i<biscuits.length;i++){
		System.out.println(biscuits[i]);
	}
}
public static void getDeoderants(){
	System.out.println("List of Deoderants********************");
	for(int i=0;i<deoderants.length;i++){
		System.out.println(deoderants[i]);
	}
}
public static void getChocolates(){
	System.out.println("List of Chocolates********************");
	for(int i=0;i<chocolates.length;i++){
		System.out.println(chocolates[i]);
	}
}
public static void getSoaps(){
	System.out.println("List of Soaps********************");
	for(int i=0;i<soaps.length;i++){
		System.out.println(soaps[i]);
	}
}
public static void getHomeAppliances(){
	System.out.println("List of HomeAppliances********************");
	for(int i=0;i<homeappliances.length;i++){
		System.out.println(homeappliances[i]);
	}
}
public static void getSnacks(){
	System.out.println("List of Snacks********************");
	for(int i=0;i<snacks.length;i++){
		System.out.println(snacks[i]);
    }
}

public static String getFruit(String fruit){
	String fruitName=null;
	for(int i=0;i<fruits.length;i++){
		if(fruits[i]==fruit){
			fruitName=fruit;
		}
	}
	return fruit;
}

public static String getVegetable(String vegetable){
	String vegetableName=null;
	for(int i=0;i<vegetables.length;i++){
		if(vegetables[i]==vegetable){
			vegetableName=vegetable;
		}
	}
	return vegetable;
}

public static String getGrocery(String grocery){
	String groceryName=null;
	for(int i=0;i<groceries.length;i++){
		if(groceries[i]==grocery){
			groceryName=grocery;
		}
	}
	return grocery;
}


public static String getBiscuit(String biscuit){
	String biscuitName=null;
	for(int i=0;i<biscuits.length;i++){
		if(biscuits[i]==biscuit){
			biscuitName=biscuit;
		}
	}
return biscuit;	
}


public static void getBiscuit(String biscuit){
	
	
}

public static String getDeoderant(String deoderant){
	String deoderantName=null;
	for(int i=0;i<deoderants.length;i++){
		if(deoderants[i]==deoderant){
			deoderantName=deoderant;
		}
	}
	return deoderant;
}

public static String getChocolate(String chocolate){
	String chocolateName=null;
	for(int i=0;i<chocolates.length;i++){
		if(chocolates[i]==chocolate);
		chocolateName=chocolate;
	}
return chocolate;
}

public static String getSoap(String soap){
	String soapName=null;
	for(int i=0;i<soaps.length;i++){
		if(soaps[i]==soap){
			soapName=soap;
		}
	}
return soap;	
}

public static String getHomeAppliance(String homeAppliance){
	String homeApplianceName=null;
	for(int i=0;i<homeappliances.length;i++){
		if(homeappliances[i]==homeAppliance){
			homeApplianceName=homeAppliance;
		}
	}
	return homeAppliance;
}


public static void getSnack(String snack1,String snack2){
	String snackName1=null;
	String snackName2=null;
	//String snackName2=null;
	for(int i=0;i<snacks.length;i++){
		if(snacks[i]==snack1 || snacks[i]==snack2){
			
			System.out.println("my fav snack items are "+snackName1 +snackName2);

		}
		
	}
}
	







}