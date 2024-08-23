package com.evergent.corejava.wrapperclasses;

public class WrapperClassesDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Auto Boxing
		int a=10;
		Integer i1=new Integer(a);// storing int value in object 
		System.out.println(i1);
		// Unboxing
		int a1=i1.intValue();
		System.out.println(a1);

	}

}
