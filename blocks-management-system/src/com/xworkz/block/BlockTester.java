package com.xworkz.block;

public class BlockTester{
	
	
  
	public BlockTester() {
	  System.out.println(this.getClass().getSimpleName() + " object is created ");
	}

/*	int blockInit;
	{
		System.out.println("Instance block1 is executed");
		blockInit=10;
	}
	
	{
		System.out.println("Instance block2 is executed");
	}
	
	public static void main(String[] args) {
		System.out.println("Main method started");
		BlockTester blocktester = new BlockTester();
		System.out.println(blocktester.blockInit);
		System.out.println("Main method ended");
		
	}  */
	
/*	static int blockInit;
	{
		System.out.println("static block is executed");
		blockInit=10;
	}
	
	public static void main(String[] args) {
		System.out.println("Main method started");
		System.out.println(BlockTester.blockInit);
		System.out.println("Main method ended");
		
	} */
	
	
	
	public static void main(String[] args) {
		System.out.println("Main method started");
		Block block=new Block();
		System.out.println(block);
		System.out.println("Main method ended");
		
	}


	
/*	public static void main(String[] args) {
		System.out.println("Main method started");
		Block.m();
		System.out.println("Main method ended");
	}*/
	
	
}
