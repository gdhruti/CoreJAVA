package com.evergent.corejava.strings;

public class StringDemo_methods5 {
	public static void main(String[] args) {
		String str="The quick brown fffoix jumps over the lazy dogs";
		
		StringBuilder reversed=new StringBuilder(str).reverse();
		System.out.println(reversed);
	}
}