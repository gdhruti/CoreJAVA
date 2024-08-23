package com.evergent.corejava.Exam1;

public class StringBuilderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb= new StringBuilder("Hello");
		System.out.println(" Initial string :" + sb);
		// append
		sb.append(" World!");
		System.out.println(" After append :" + sb);
		// insert 
		sb.insert(6, "Beautiful");
		System.out.println(" After insert :" + sb);
		//replace
		sb.replace(0,5," hi ");
		System.out.println(" After Replace :" + sb);
		//delete
		sb.delete(0, 3);
		System.out.println(" After Delete :" + sb);
		// reverse
		sb.reverse();
		System.out.println(" After Reverse :" + sb);

	}

}
