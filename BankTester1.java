class BankTester1{

 public static void main(String[] args){
    
	Bank1 bank=new KotakBank(5.5);
	bank.rateOfInterest();
	
	Bank1 bank1=new IciciBank(4.0);
	bank1.rateOfInterest();
	
	Bank1 bank2=new YesBank(3.20);
	bank2.rateOfInterest();
	
	Bank1 bank3=new SeethaBank(3.0);
	bank3.rateOfInterest();
	
	Bank1 bank4=new HdfcBank(5.75);
	bank4.rateOfInterest();
	
	Bank1 bank5=new SbiBank(5.5);
	bank5.rateOfInterest();
	
	Bank1 bank6=new AxisBank(5.25);
	bank6.rateOfInterest();
	
	Bank1 bank7=new PnbBank(3.5);
	bank7.rateOfInterest();
	
	Bank1 bank8=new KarnatakaBank(3.75);
	bank8.rateOfInterest();
	
	Bank1 bank9=new UnionBank(4);
	bank9.rateOfInterest();
	
	Bank1 bank10=new KgbBank(4.10);
	bank10.rateOfInterest();  
	
  

 }

}