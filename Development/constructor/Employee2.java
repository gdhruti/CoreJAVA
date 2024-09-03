package com.evergent.corejava.constructor;

public class Employee2 {
	int eno;//default=0 , instance variables
	String ename;//null
	double sal;//0.0

	Employee2() // Default constructor
	{
		System.out.println("Default Constructor");
	}

	Employee2(int eno1,String ename1,double sal1) // Parameterised const, eno1,ename1..-local variables
	{
		eno=eno1;
		ename=ename1;
		sal=sal1;
		
	}
	public void display()//method
	{
		System.out.println("Employee number:"+eno);
		System.out.println("Employee name:"+ename);
		System.out.println("Employee salary:"+sal);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Employee2();// Object Creation
		Employee2 emp2=new Employee2(21,"Dhruti",600000);//object reference
		emp2.display();
		
		

	}

}
