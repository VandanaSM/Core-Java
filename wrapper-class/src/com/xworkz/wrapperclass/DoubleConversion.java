package com.xworkz.wrapperclass;

public class DoubleConversion {

	public static void main(String[] args) {
		
		double i=15;
		Double i1=Double.valueOf(i);
		System.out.println(i1);
		
		Integer i2=i1.intValue();
		System.out.println(i2);
		
		Long i3=i1.longValue();
		System.out.println(i3);
		
		Byte i4=i1.byteValue();
		System.out.println(i4);
		
		Float i5=i1.floatValue();
		System.out.println(i5);
	}
}
