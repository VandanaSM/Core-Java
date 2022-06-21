class SuperMarket{

 static String fruits[]= {"Butterfruit","Mango","Watermelon","Chickoo","Apple","Grapes"};
 static String vegetables[]= {"Bitter gourd","Carrot","Spinach","Potato","Beet root","Broccoli"};
 static String groceries[]= {"Chakki attta","Besan","Moong dal","sooji rava","toor dal","jeera"};
 static String biscuits[]= {"Sunfeast","Parle","Britania","Dukes","Oreo","Unibic"};
 static String deoderants[]= {"Nivea","Yardley","Eva","Spinz","Engage","Secret temptation"};
 static String chocolates[]= {"Bournville","Dairy milk","Kit kat","Gems","Munch","Ferrero rocher"};
 static String soaps[]= {"Mysore sandal","Himalaya","Rexona","Pears","Fiama","Biotique"};
 static String homeappliances[]= {"Induction","Electric kettle","Mixer and blender","Oven","television","Refridgerator"};
 static String snacks[]= {"Cookies","Bhakardwadi","Chips","Wafers","Nutri bars","Namkeens"};
 public static void main(String[] args){

 System.out.println("Length of fruits is " +fruits.length );
 System.out.println("Length of vegetables is " +vegetables.length );
 System.out.println("Length of groceries is " +groceries.length );
 System.out.println("Length of biscuits is " +biscuits.length );
 System.out.println("Length of deoderants is " +deoderants.length );
 System.out.println("Length of chocolates is " +chocolates.length );
 System.out.println("Length of soaps is " +soaps.length );
 System.out.println("Length of homeappliances is " +homeappliances.length );
 System.out.println("Length of snacks is " +snacks.length );
 System.out.println("Items available in Fruits are " + fruits[0]+"," + fruits[1] +","+ fruits[2] +","+ fruits[3] +"," + fruits[4] +","+ fruits[5]+".");
 System.out.println("Items available in Vegetables are " +vegetables[0] +"," + vegetables[1]+"," + vegetables[2] +"," + vegetables[3] +"," + vegetables[4] +"," + vegetables[5]+".");
 System.out.println("Items available in Groceries are " +groceries[0] +","+ groceries[1] +","+ groceries[2] +","+ groceries[3] +","+ groceries[4] +","+ groceries[5]+".");
 System.out.println("Items available in biscuits are " +biscuits[0] +","+ biscuits[1] +","+ biscuits[2] +"," + biscuits[3] +","+ biscuits[4] +","+ biscuits[5]+".");
 System.out.println("Items available in deoderants are " +deoderants[0] +","+ deoderants[1] +"," + deoderants[2] +","+ deoderants[3] +","+ deoderants[4] +","+ deoderants[5]+".");
 System.out.println("Items available in chocolates are " +chocolates[0] +"," + chocolates[1] +","+ chocolates[2] +","+ chocolates[3] +","+ chocolates[4] +","+ chocolates[5]+".");
 System.out.println("Items available in soaps are " +soaps[0] +","+ soaps[1] +","+ soaps[2] +"," + soaps[3] +"," + soaps[4] +"," + soaps[5]+".");
 System.out.println("Items available in homeappliances are " +homeappliances[0] +"," + homeappliances[1] +","+ homeappliances[2] +","+ homeappliances[3] +","+ homeappliances[4] +"," + homeappliances[5]+".");
 System.out.println("Items available in snacks are " +snacks[0] +"," + snacks[1] +"," + snacks[2] +","+ snacks[3] +"," + snacks[4] +"," + snacks[5]+".");
 System.out .println("List of the biscuits");
 System.out .println("*********************************");
 
 
 }

 public static void getBiscuits(){
 for(int i=0;i<biscuits.length;i++){
 System.out.println(biscuits[i]);	 	 	 
 }
 }
 System.out.println("List of Fruits");
 System.out.println("**********************************");
 for(int i=0;i<fruits.length;i++){
 System.out.println(fruits[i]);
 }
 System.out.println("List of Vegetables");
 System.out.println("**********************************");
 for(int i=0;i<vegetables.length;i++){
 System.out.println(vegetables[i]);
 }
 System.out.println("List of Groceries");
 System.out.println("**********************************");
 for(int i=0;i<groceries.length;i++){
 System.out.println(groceries[i]);
 }
 System.out.println("List of Deoderants");
 System.out.println("**********************************");
 for(int i=0; i < deoderants.length;i++){
 System.out.println(deoderants[i]);	 
 }
 System.out.println("List of chocolates");
 System.out.println("**********************************");
 for(int i=0;i<chocolates.length;i++){
 System.out.println(chocolates[i]);	 
 }
 System.out.println("List of soaps");
 System.out.println("**********************************");
 for(int i=0;i<soaps.length;i++){
 System.out.println(soaps[i]);	 
 }
 System.out.println("List of homeappliances");
 System.out.println("**********************************");
 for(int i=0;i<homeappliances.length;i++){
 System.out.println(homeappliances[i]);	 
 }
 System.out.println("List of snacks");
 System.out.println("**********************************");
 for(int i=0;i<snacks.length;i++){
 System.out.println(snacks[i]);	 
 }
 

}
public static void getBiscuits(){
for(int i=0;i<biscuits.length;i++){
System.out.println(biscuits[i]);	 	 	 
}
}
System.out.println("List of Fruits");
System.out.println("**********************************");
for(int i=0;i<fruits.length;i++){
System.out.println(fruits[i]);
}
System.out.println("List of Vegetables");
System.out.println("**********************************");
for(int i=0;i<vegetables.length;i++){
System.out.println(vegetables[i]);
}
System.out.println("List of Groceries");
System.out.println("**********************************");
for(int i=0;i<groceries.length;i++){
System.out.println(groceries[i]);
}
System.out.println("List of Deoderants");
System.out.println("**********************************");
for(int i=0; i < deoderants.length;i++){
System.out.println(deoderants[i]);	 
}
System.out.println("List of chocolates");
System.out.println("**********************************");
for(int i=0;i<chocolates.length;i++){
System.out.println(chocolates[i]);	 
}
System.out.println("List of soaps");
System.out.println("**********************************");
for(int i=0;i<soaps.length;i++){
System.out.println(soaps[i]);	 
}
System.out.println("List of homeappliances");
System.out.println("**********************************");
for(int i=0;i<homeappliances.length;i++){
System.out.println(homeappliances[i]);	 
}
System.out.println("List of snacks");
System.out.println("**********************************");
for(int i=0;i<snacks.length;i++){
System.out.println(snacks[i]);	 
}
 
public static void getBiscuits(){
    for(int i=0;i<biscuits.length;i++){
    System.out.println(biscuits[i]);	 	 	 
    }
    }
    System.out.println("List of Fruits");
    System.out.println("**********************************");
    for(int i=0;i<fruits.length;i++){
    System.out.println(fruits[i]);
    }
    System.out.println("List of Vegetables");
    System.out.println("**********************************");
    for(int i=0;i<vegetables.length;i++){
    System.out.println(vegetables[i]);
    }
    System.out.println("List of Groceries");
    System.out.println("**********************************");
    for(int i=0;i<groceries.length;i++){
    System.out.println(groceries[i]);
    }
    System.out.println("List of Deoderants");
    System.out.println("**********************************");
    for(int i=0; i < deoderants.length;i++){
    System.out.println(deoderants[i]);	 
    }
    System.out.println("List of chocolates");
    System.out.println("**********************************");
    for(int i=0;i<chocolates.length;i++){
    System.out.println(chocolates[i]);	 
    }
    System.out.println("List of soaps");
    System.out.println("**********************************");
    for(int i=0;i<soaps.length;i++){
    System.out.println(soaps[i]);	 
    }
    System.out.println("List of homeappliances");
    System.out.println("**********************************");
    for(int i=0;i<homeappliances.length;i++){
    System.out.println(homeappliances[i]);	 
    }
    System.out.println("List of snacks");
    System.out.println("**********************************");
    for(int i=0;i<snacks.length;i++){
    System.out.println(snacks[i]);	 
    }
    
   
    System.out.println("**********************************");
    System.out.println("**********************************");
    System.out.println("**********************************");
   public static void getBiscuits(){
   for(int i=0;i<biscuits.length;i++){
   System.out.println(biscuits[i]);	 	 	 
   }
   }
   System.out.println("List of Fruits");
   System.out.println("**********************************");
   public static void getFruits(){
       for(int i=0;i<fruits.length;i++){
   System.out.println(fruits[i]);
   }
   }
   System.out.println("List of Vegetables");
   System.out.println("**********************************");
   public static void getVegetables(){
       for(int i=0;i<vegetables.length;i++){
   System.out.println(vegetables[i]);
   }
   }
   System.out.println("List of Groceries");
   System.out.println("**********************************");
   public static void getGroceries(){
       for(int i=0;i<groceries.length;i++){
   System.out.println(groceries[i]);
   }
   }
   System.out.println("List of Deoderants");
   System.out.println("**********************************");
   public static void getDeoderantss(){
       for(int i=0; i < deoderants.length;i++){
   System.out.println(deoderants[i]);	 
   }
   }
   System.out.println("List of chocolates");
   System.out.println("**********************************");
   public static void getChocolates(){
       for(int i=0;i<chocolates.length;i++){
   System.out.println(chocolates[i]);	 
   }
   }
   System.out.println("List of soaps");
   System.out.println("**********************************");
   public static void getSoaps(){
       for(int i=0;i<soaps.length;i++){
   System.out.println(soaps[i]);	 
   }
   }
   System.out.println("List of homeappliances");
   System.out.println("**********************************");
   public static void getHomeAppliances(){
       for(int i=0;i<homeappliances.length;i++){
   System.out.println(homeappliances[i]);	 
   }
   }
   System.out.println("List of snacks");
   System.out.println("**********************************");
   public static void getSnacks(){
       for(int i=0;i<snacks.length;i++){
   System.out.println(snacks[i]);	 
   }
   }
 }
 
}					












