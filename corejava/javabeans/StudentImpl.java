package com.evergent.corejava.javabeans;

public class StudentImpl {
	public static void main(String[] args) {
		Student st=new Student();
		st.setEno(100);
		st.setEname("Dhruti");
		st.setSal(500.00);
		System.out.println(st);
	}
}