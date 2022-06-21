class BankAccount1{
   static double amount;
   
   
   public static void main(String[] args){
     deposit(20000);
	 balanceAvailable();
	 withdraw(1500);
     balanceAvailable();
	 
   }

   public static void deposit(double amt){
      System.out.println("available balance in account is " +amount);
	  System.out.println("Amount deposited is"+amt);
	     amount=amount+amt;
	  System.out.println("balance after deposit is"+amount);
	  
   }
   public static void withdraw(double amt){
      System.out.println("Available balance in account is"+amount);
	  System.out.println("Amount withdrawn is"+amt);
	    amount=amount-amt;
	  System.out.println("balance after withdrawn"+amount);
   
   }
   public static void balanceAvailable(){
     System.out.println("Balance Available in account is " +amount);
   }

}