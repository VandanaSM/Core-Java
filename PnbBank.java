class PnbBank extends Bank1{

  public PnbBank(double interest){
    System.out.println("PnbBank object is created**************");
     this.interest=interest;
  }

  	@Override
  public void rateOfInterest(){
		super.rateOfInterest();
		 double totalinterest=amount*interest/100;
     	  System.out.println("the interest is " +interest);
		 double depositAmount=amount+interest;
	     System.out.println("the amount after deposit is " +depositAmount);
		
  }


}