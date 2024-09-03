package com.evergent.corejava.strings;

public class StringBuffer_methods {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("Hello");
		System.out.println("original String:"+sb);
		System.out.println("append String:"+sb.append("World!"));
		System.out.println("insert String:"+sb.insert(7,"beautiful"));
		System.out.println("replace String:"+sb.replace(0,5,"hi"));
		System.out.println("delete String:"+sb.delete(0,3));
		System.out.println("reverse String:"+sb.reverse());
		System.out.println("capacity String:"+sb.capacity());
		System.out.println("length String:"+sb.length());
		
		
	}
}