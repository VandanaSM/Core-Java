class HdfcBank extends Bank1{

  public HdfcBank(double interest){
    System.out.println("HdfcBank object is created**************");
     this.interest=interest;
  }

  	@Override
  public void rateOfInterest(){
		super.rateOfInterest();
		 double totalinterest=amount*interest/100;
     	  System.out.println("the interest is " +interest);
		 double totalAmount=amount+totalinterest;
	     System.out.println("the amount after interest deposit is " +totalAmount);
		
  }


}