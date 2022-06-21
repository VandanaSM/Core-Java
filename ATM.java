class ATM{
  int id;
  String name;
  String branchName;
  int noOfMachines;
  String type;
  int maxWithdrawLimit;
  int maxDepositLimit;
  
   public ATM(){
	   
	   System.out.println("object atm is created");
	   
   }
 
  public static void main (String[] args){
	  ATM atm=new ATM();
	  atm.id=001;
	  atm.name="SBI";
	  atm.branchName="Rajajinagar";
	  atm.noOfMachines=3;
	  atm.type="withdrawal and deposit";
	  atm.maxWithdrawLimit=20000;
	  atm.maxDepositLimit=49900;
	  atm.moneyTransactions();
	  System.out.println("id of atm is " +atm.id);
	  System.out.println("atm belongs to " +atm.name);
	  System.out.println("the branch of atm is "+atm.branchName);
	  System.out.println("no of machines available are" +atm.noOfMachines);
	  System.out.println("types of machines available are" +atm.type);
      System.out.println("max withdrawal limit per day is"+atm.maxWithdrawLimit);
      System.out.println("max deposit limit per day is"+atm.maxDepositLimit);	  

	  ATM atm1=new ATM();
	  atm1.id=002;
	  atm1.name="ICICI";
	  atm1.branchName="Muneshwara nagar";
	  atm1.noOfMachines=3;
	  atm1.type="withdrawal and deposit";
	  atm1.maxWithdrawLimit=25000;
	  atm1.maxDepositLimit=25000;
	  System.out.println("id of atm is " +atm1.id);
	  System.out.println("atm belongs to " +atm1.name);
	  System.out.println("the branch of atm is "+atm1.branchName);
	  System.out.println("no of machines available are" +atm1.noOfMachines);
	  System.out.println("types of machines available are" +atm1.type);
      System.out.println("max withdrawal limit per day is"+atm1.maxWithdrawLimit);
      System.out.println("max deposit limit per day is"+atm1.maxDepositLimit);

	  ATM atm2=new ATM();
	  atm2.id=003;
	  atm2.name="HDFC";
	  atm2.branchName="HSR layout";
	  atm2.noOfMachines=3;
	  atm2.type="withdrawal and deposit";
	  atm2.maxWithdrawLimit=25000;
	  atm2.maxDepositLimit=25000;
	  System.out.println("id of atm is " +atm2.id);
	  System.out.println("atm belongs to " +atm2.name);
	  System.out.println("the branch of atm is "+atm2.branchName);
	  System.out.println("no of machines available are" +atm2.noOfMachines);
	  System.out.println("types of machines available are" +atm2.type);
      System.out.println("max withdrawal limit per day is"+atm2.maxWithdrawLimit);
      System.out.println("max deposit limit per day is"+atm2.maxDepositLimit);

	  ATM atm3=new ATM();
	  atm3.id=004;
	  atm3.name="axis";
	  atm3.branchName="malleswaram";
	  atm3.noOfMachines=3;
	  atm3.type="withdrawal and deposit";
	  atm3.maxWithdrawLimit=40000;
	  atm3.maxDepositLimit=49950;
	  System.out.println("id of atm is " +atm3.id);
	  System.out.println("atm belongs to " +atm3.name);
	  System.out.println("the branch of atm is "+atm3.branchName);
	  System.out.println("no of machines available are" +atm3.noOfMachines);
	  System.out.println("types of machines available are" +atm3.type);
      System.out.println("max withdrawal limit per day is"+atm3.maxWithdrawLimit);
      System.out.println("max deposit limit per day is"+atm3.maxDepositLimit);	  
  }
  
    public void moneyTransactions(){
		
		System.out.println("transactions like withdraw and deposit can be done at atm");
	}
}