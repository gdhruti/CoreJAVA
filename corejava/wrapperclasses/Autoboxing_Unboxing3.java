package com.evergent.corejava.wrapperclasses;

public class Autoboxing_Unboxing3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		Integer i= new Integer(a);
		//unboxing the object
		int i1=i.intValue();
		System.out.println("value of i:"+i);
		System.out.println("value of i1:"+i1);
		//autoboxing of character
		char ch='a';
		Character ch1=new Character(ch);
		// or Character ch1=ch;
		//autounboxing
		char ch2=ch1.charValue();
		System.out.println("value of ch1:"+ch1);
		System.out.println("value of ch2:"+ch2);
		
	}

}
