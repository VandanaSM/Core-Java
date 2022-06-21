class Shoe{
  int id;
  String shopName;
  String address;
  long contactNo;
  String type;
  String sizesAvailable;
  String materialOfShoe;
  
  public Shoe(){
	  
	  System.out.println("object Shoe is created");
  }
  

  public static void main (String[] args){
	  Shoe shoe=new Shoe();
	  shoe.id=001;
      shoe.shopName="Bata";
	  shoe.address="rajajinagar";
	  shoe.contactNo=9804859456L;
	  shoe.type="sneakers";
	  shoe.sizesAvailable="2,4,6,8";
	  shoe.materialOfShoe="leather";
	  shoe.toProtect();
	   System.out.println("id of shop is "+shoe.id);
	   System.out.println("the name of shop is" +shoe.shopName);
	   System.out.println("the address of shop is "+shoe.address);
	   System.out.println("the contact no is " +shoe.contactNo);
	   System.out.println("type of shoe " +shoe.type);
       System.out.println("sizes available are" +shoe.sizesAvailable);
	   System.out.println("material of shoes is" +shoe.materialOfShoe);
		
		
	  Shoe shoe1=new Shoe();
	  shoe1.id=002;
	  shoe1.shopName="Metro";
	  shoe1.address="rajajinagar";
	  shoe1.contactNo=9394580986L;
	  shoe1.type="formals";
	  shoe1.sizesAvailable="2,4,6,8";
	  shoe1.materialOfShoe="synthetic and leather";
	   System.out.println("id of shop is "+shoe1.id);
	   System.out.println("the name of showroom is" +shoe1.shopName);
	   System.out.println("the address of showroom is "+shoe1.address);
	   System.out.println("the contact no is " +shoe1.contactNo);
	   System.out.println("type of shoe " +shoe1.type);
       System.out.println("sizes available are " +shoe1.sizesAvailable);
	   System.out.println("material of shoes is " +shoe1.materialOfShoe);
	   
	  Shoe shoe2=new Shoe();
	  shoe2.id=003;
	  shoe2.shopName="clarks";
	  shoe2.address="rajajinagar";
	  shoe2.contactNo=9878623478L;
	  shoe2.type="formals and ballerina";
	  shoe2.sizesAvailable="2,3,4,5,6,7,8";
	  shoe2.materialOfShoe="leather";
	   System.out.println("id of shop is "+shoe2.id);
	   System.out.println("the name of shop is" +shoe2.shopName);
	   System.out.println("the address of shop is "+shoe2.address);
	   System.out.println("the contact no is " +shoe2.contactNo);
	   System.out.println("type of shoe " +shoe2.type);
       System.out.println("sizes available are " +shoe2.sizesAvailable);
	   System.out.println("material of shoes is " +shoe2.materialOfShoe);
		
		
	  Shoe shoe3=new Shoe();
	  shoe3.id=004;
	  shoe3.shopName="liberty";
	  shoe3.address="malleswaram";
	  shoe3.contactNo=9327834857L;
	  shoe3.type="casulas";
	  shoe3.sizesAvailable="2,4,6,8,10";
	  shoe3.materialOfShoe="synthetic and leather";
	   System.out.println("id of shop is "+shoe3.id);
	   System.out.println("the name of showroom is " +shoe3.shopName);
	   System.out.println("the address of showroom is "+shoe3.address);
	   System.out.println("the contact no is " +shoe3.contactNo);
	   System.out.println("type of shoe " +shoe3.type);
       System.out.println("sizes available are " +shoe3.sizesAvailable);
	   System.out.println("material of shoes is " +shoe3.materialOfShoe);
  }
    public void toProtect(){
		System.out.println("to protect our feet from injuries shoes are used");
	}
  
}