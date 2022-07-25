package com.xworkz.block;

public class Block {

	public Block() {
		System.out.println(this.getClass().getSimpleName() + " object is created  ");
	}
	
	{
		System.out.println("block 1");
	}
	
	{
		System.out.println("block 2");
	}
	
	public static void m() {
		System.out.println("m () of Block ");
	}

/*	static blocks are executed with static methods first static blocks then instance blocks in a method
	init of static and instance var
	instance block take both static and instance var
	static block take only instance var  
	go through getclass and getSimpleNme()
	stack and heap*/
}
