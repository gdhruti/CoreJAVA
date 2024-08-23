package com.evergent.corejava.strings;

public class StringDemo_methods2 {
	public static void main(String[] args) {
		String str="The quick brown fffox jumps over the lazy dogs";
		String substr="fox";
		Boolean contains=str.contains(substr);
		System.out.println("contains "+ substr +" "+contains);
	}
}