class BankAccount{

   static double amount;
   
   //METHOD TO GET totalAmount
   public static void main(String[] args){
   System.out.println("main method started");
   deposit(6700.00);
   getTotalAmount(0);
   withDraw(550.00);
   getTotalAmount(0);
   deposit(1200.00);
   getTotalAmount(0);
   withDraw(750.00);
   getTotalAmount(0);
   withDraw(200.00);
   getTotalAmount(0);
   withDraw(250.00);
   getTotalAmount(0);
   withDraw(100.00);
   getTotalAmount(0);
   withDraw(500.00);
   getTotalAmount(0);
   withDraw(2100.00);
   getTotalAmount(0);
   withDraw(500.00);
   getTotalAmount(0);
   withDraw(250.00);
   getTotalAmount(0);
   withDraw(100.00);
   getTotalAmount(0);
   withDraw(2500.00);
   totalAmount(0);
   withDraw(450.00);
   totalAmount(0);
   
   
   
   
   System.out.println("end of main method");
   }
   public static void deposit(double amt){
   System.out.println("invoke deposit()");
   System.out.println("amount to be deposit" +amt);
   System.out.println("balance/amount before deposit" +amount);
    amount=amount+amt;
   System.out.println("amount after deposit"+amount);
   System.out.println("end of deposit()");
   }
   public static void withDraw(double amt){
   System.out.println("invoke withDraw()");
   System.out.println("amount to be withDrawn" +amt);
   System.out.println("amount before withDraw" +amount);
    amount= amount-amt;
	if(amount<=0){
		System.out.println("insufficient balance");
	}else{
		System.out.println(amount);
	}
   System.out.println("amount after withDraw" +amount);
   System.out.println("end of withDraw()");
   }
   public static void getTotalAmount(double amt){
	   System.out.println("Total amount available in account is:" +amount);
   }
   
  
}






double minBalance=minBalance(5000);
   
   System.out.println("maintain min balance in account");
   
   
   
   
   
   
    public static void getTotalAmount(double amt){
	   System.out.println("Total amount available in account is:" +amount);
   }
   
   public static double minBalance(int x){
	  
	return x;
   }