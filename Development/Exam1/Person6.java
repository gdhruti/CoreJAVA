package com.evergent.corejava.Exam1;

public class Person6 {
	static String name="Dhruti";
	int age=22;
	String address="Hyderabad";
	public void display()
	{
		name="Welcome";
		System.out.println(" Name: "+name );
		System.out.println(" Age: "+age );
		System.out.println(" Address: "+address );
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person6 p1= new Person6 ();
		System.out.println(p1.name);
		p1.display();
		//Person6 p2=new Person6 ();
		System.out.println(p1.name);
				
				

	}

}
