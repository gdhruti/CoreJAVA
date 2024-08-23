package com.evergent.corejava.strings;
// string constant pool concept
// here there is no use of new keyword so it directly checks in constant pool
public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "Java";
		String s2="Java";
		if (s1==s2) // checks for memory location
			System.out.println("True");
		else
			System.out.println("False");
		if(s1.equals(s2)) // checks for content
			System.out.println("True");
		else
			System.out.println("False");
		

	}

}
