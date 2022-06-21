class Cosmetics{

  int id;
  String brandName;
  String type;
  String color;
  int price;
  String expiryDate;
  String itemWeight;
  int longStayInHours;
  
  public Cosmetics(){
	  
	  System.out.println("cosmetics object is created");
	  
  }
  
  
  public static void main (String[] args){
	  Cosmetics cosmetic=new Cosmetics();
	  cosmetic.id=001;
	  cosmetic.brandName="lakme";
	  cosmetic.type="kajal";
	  cosmetic.color="black";
	  cosmetic.price=157;
	  cosmetic.expiryDate="NOV 2024";
	  cosmetic.itemWeight="0.35 g";
	  cosmetic.longStayInHours=8;
	  cosmetic.beauty();
	   System.out.println("id of cosmetic "+cosmetic.id);
	   System.out.println("the name of brand is" +cosmetic.brandName);
	   System.out.println("the type of cosmetic is " +cosmetic.type);
	   System.out.println("price of cosmetic is " +cosmetic.price);
	   System.out.println("the color is " +cosmetic.color);
	   System.out.println("expiry Date is " +cosmetic.expiryDate);
       System.out.println("weight is " +cosmetic.itemWeight);
	   System.out.println("long Stay in hours is "+cosmetic.longStayInHours);
	   
	  Cosmetics cosmetic1=new Cosmetics();
	  cosmetic1.id=002;
	  cosmetic1.brandName="Maybelline";
	  cosmetic1.type="foundation";
	  cosmetic1.color="warm nude";
	  cosmetic1.price=300;
	  cosmetic1.expiryDate="AUG 2023";
	  cosmetic1.itemWeight="15 ml";
      cosmetic1.longStayInHours=12;
	   System.out.println("id of cosmetic "+cosmetic1.id);
	   System.out.println("the name of brand is" +cosmetic1.brandName);
	   System.out.println("the type of cosmetic is " +cosmetic1.type);
	   System.out.println("price of cosmetic is " +cosmetic1.price);
	   System.out.println("the color is " +cosmetic1.color);
	   System.out.println("expiry Date is " +cosmetic1.expiryDate);
       System.out.println("weight is " +cosmetic1.itemWeight);
	   System.out.println("long Stay in hours is "+cosmetic1.longStayInHours);

	   
	  Cosmetics cosmetic2=new Cosmetics();
	  cosmetic2.id=003;
	  cosmetic2.brandName="faces canada";
	  cosmetic2.type="compact";
	  cosmetic2.color="natural";
	  cosmetic2.price=200;
	  cosmetic2.expiryDate="Dec 2024";
	  cosmetic2.itemWeight="9 g";
      cosmetic2.longStayInHours=4;
       System.out.println("id of cosmetic "+cosmetic2.id);
	   System.out.println("the name of brand is" +cosmetic2.brandName);
	   System.out.println("the type of cosmetic is " +cosmetic2.type);
	   System.out.println("price of cosmetic is " +cosmetic2.price);
	   System.out.println("the color is " +cosmetic2.color);
	   System.out.println("expiry Date is " +cosmetic2.expiryDate);
       System.out.println("weight is " +cosmetic2.itemWeight);
	   System.out.println("long Stay in hours is "+cosmetic2.longStayInHours);

	   
	  Cosmetics cosmetic3=new Cosmetics();
	  cosmetic3.id=004;
	  cosmetic3.brandName="mama earth";
	  cosmetic3.type="lipstick";
	  cosmetic3.color="carnation nude";
	  cosmetic3.price=499;
	  cosmetic3.expiryDate="Dec 2023";
	  cosmetic3.itemWeight="2 g";
      cosmetic3.longStayInHours=12;
       System.out.println("id of cosmetic "+cosmetic3.id);
	   System.out.println("the name of brand is" +cosmetic3.brandName);
	   System.out.println("the type of cosmetic is " +cosmetic3.type);
	   System.out.println("price of cosmetic is " +cosmetic3.price);
	   System.out.println("the color is " +cosmetic3.color);
	   System.out.println("expiry Date is " +cosmetic3.expiryDate);
       System.out.println("weight is " +cosmetic3.itemWeight);
	   System.out.println("long Stay in hours is "+cosmetic3.longStayInHours);

  }
    public void beauty(){
		
		System.out.println("cosmetics are used to enhance external beauty");
		
	}

}