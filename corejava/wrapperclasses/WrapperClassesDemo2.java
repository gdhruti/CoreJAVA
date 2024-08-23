package com.evergent.corejava.wrapperclasses;

public class WrapperClassesDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i1=100;
		Integer t1= new Integer(i1);
		int i2=t1.intValue();
		double d1=999.76;
		Double t2= new Double(d1);
		double d2= t2.doubleValue();
		byte b1=10;
		Byte t3= new Byte(b1);
		byte b2=t3.byteValue();
		//integer values
		System.out.println("int value is:"+i1);
		System.out.println("int object value is:"+t1);
		System.out.println("After converting int obj value to primitive is:"+i2);
		//Double value
		System.out.println("double value is:"+d1);
		System.out.println("double object value is:"+t2);
		System.out.println("After converting double obj value to primitive is:"+d2);
		//Bye value
		System.out.println("byte value is:"+b1);
		System.out.println("byte object value is:"+t3);
		System.out.println("After converting byte obj value to primitive is:"+b2);

	}

}
