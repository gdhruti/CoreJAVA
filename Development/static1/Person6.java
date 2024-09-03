package com.evergent.corejava.static1;

public class Person6 {
	static String name="Dhruti";
	int age=22;
	String address="Hyd";
	public void display()
	{
		name="Welcome";
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("address:"+address);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person6 p1= new Person6();
		System.out.println(p1.name);
		Person6 p2=new Person6();
		System.out.println(p2.name);

	}

}
