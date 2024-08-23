package com.evergent.corejava.oops;

public class Person {
	String name="Dhruti";
	int age=22;
	String address="Hyderabad";
	public void display()
	{
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Address:"+address);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p= new Person();
		p.display();
		

	}

}
