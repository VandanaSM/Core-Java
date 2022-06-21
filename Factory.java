class Factory{
	
	
	int id;
	String factoryName;
	String address;
	int noOfEmployees;
	String productManufactured;
	int salesPerYear;
	
	public Factory(){
		
		System.out.println("Factory object is created");
		
	}
	
	
	public static void main(String[] args){
	   Factory factory=new Factory();
       factory.id=001;
	   factory.factoryName="mysore sandal soap factoru";
	   factory.address="yeshwantpur";
	   factory.noOfEmployees=250;
	   factory.productManufactured="soap";
	   factory.salesPerYear=120000;
	   factory.manufacture();
	   System.out.println("factory id is "+factory.id);
	   System.out.println("name of the factory is "+factory.factoryName);
	   System.out.println("address of the factory is "+factory.address);
	   System.out.println("no of employees are" +factory.noOfEmployees);
	   System.out.println("product manufactured in the factory is " +factory.productManufactured);
	   System.out.println("sales achieved per year is" +factory.salesPerYear);
	   
	   
	   Factory factory1=new Factory();
       factory1.id=002;
	   factory1.factoryName="Parle biscuit factory";
	   factory1.address="rukmini nagar";
	   factory1.noOfEmployees=300;
	   factory1.productManufactured="Biscuit";
	   factory1.salesPerYear=1000000;
	   System.out.println("factory id is "+factory1.id);
	   System.out.println("name of the factory is "+factory1.factoryName);
	   System.out.println("address of the factory is "+factory1.address);
	   System.out.println("no of employees are " +factory1.noOfEmployees);
	   System.out.println("product manufactured in the factory is " +factory1.productManufactured);
	   System.out.println("sales achieved per year is " +factory1.salesPerYear);
	   
	   Factory factory2=new Factory();
       factory2.id=003;
	   factory2.factoryName="indian agarbatti manufacturers";
	   factory2.address="srirampura";
	   factory2.noOfEmployees=100;
	   factory2.productManufactured="agarbatti";
	   factory2.salesPerYear=150000;
	   System.out.println("factory id is "+factory2.id);
	   System.out.println("name of the factory is "+factory2.factoryName);
	   System.out.println("address of the factory is "+factory2.address);
	   System.out.println("no of employees are " +factory2.noOfEmployees);
	   System.out.println("product manufactured in the factory is " +factory2.productManufactured);
	   System.out.println("sales achieved per year is " +factory2.salesPerYear);
	 
		
		
	}

	 public void manufacture(){
		 
		System.out.println("to manufacture products"); 
		 
	 }





}