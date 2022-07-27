package com.xworkz.wrapperclass;

public class ByteConversion {

	public static void main(String[] args) {
		
		byte i=20;
		Byte i1=Byte.valueOf(i);
		System.out.println(i1);
		
		Integer i2=i1.intValue();
		System.out.println(i2);
		
		Long i3=i1.longValue();
		System.out.println(i3);
		
		Double i4=i1.doubleValue();
		System.out.println(i4);
		
		Float i5=i1.floatValue();
		System.out.println(i5);
	}
}
