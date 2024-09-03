package com.evergent.corejava.Exam1;

public class MainPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonImmutable pi= new PersonImmutable("Dhruti", 22);
		System.out.println(pi.myName());
		System.out.println(pi.myAge());


	}

}
