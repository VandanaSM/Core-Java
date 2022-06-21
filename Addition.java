class Addition{
	
	public static void main(String[] args){
		number(56,56);
		number(67,45);
		number(89,90);
		number(112,113);
		int addTwoNumbers=addTwoNumbers(34,23); //declared as int so returntype can be given as int with access modifiers while writing a method
		System.out.println("Sum of numbers is" +addTwoNumbers);
		addThreeNumbers(21,89,98);      //not declared as int so used void while creating a method or caller method
		//System.out.println("Sum of numbers is" +addThreeNumbers);
	}
	 
	 public static void number(int a,int b){
		 System.out.println("Sum of numbers is" + (a+b));
		 System.out.println("Difference of numbers is" + (a-b));
		 System.out.println("Multiplication of numbers is" + (a*b));
		 System.out.println("Division of numbers is" + (a/b));
	 }
	 public static int addTwoNumbers(int a,int b){
	  return a+b;
	 }
	 public static void addThreeNumbers(int a,int b,int c){
		System.out.println("Sum of numbers is" +(a+b+c));
	 }
}