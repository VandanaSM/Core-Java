package com.xworkz.wrapperclass;

public class FloatConversion {

	public static void main(String[] args) {
		
		float i=20;
		Float i1=Float.valueOf(i);
		System.out.println(i1);
		
		Integer i2=i1.intValue();
		System.out.println(i2);
		
		Long i3=i1.longValue();
		System.out.println(i3);
		
		Double i4=i1.doubleValue();
		System.out.println(i4);
		
		Byte i5=i1.byteValue();
		System.out.println(i5);
	}
}
