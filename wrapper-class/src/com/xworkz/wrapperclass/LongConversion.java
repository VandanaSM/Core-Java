package com.xworkz.wrapperclass;

public class LongConversion {

	public static void main(String[] args) {
		
		long i=890998509;
		Long i1=Long.valueOf(i);
		System.out.println(i1);
		
		Integer i2=i1.intValue();
		System.out.println(i2);
		
		Byte i3=i1.byteValue();
		System.out.println(i3);
		
		Long i4=i1.longValue();
		System.out.println(i4);
		
		Double i6=i1.doubleValue();
		System.out.println(i6);
		
		Float i5=i1.floatValue();
		System.out.println(i5);
		
		
		
	}
}
