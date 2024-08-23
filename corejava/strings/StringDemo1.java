package com.evergent.corejava.strings;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1=new String("JAVA");
		String str2=new String("JAVA");
		if (str1==str2) // checks for memory location
			System.out.println("True");
		else
			System.out.println("False");
		if(str1.equals(str2)) // checks for content
			System.out.println("True");
		else
			System.out.println("False");
		

	}

}
