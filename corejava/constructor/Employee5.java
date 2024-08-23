package com.evergent.corejava.constructor;

public class Employee5 {
	int eno;//default=0 , instance variables
	String ename;//null
	double sal;//0.0

	Employee5() // Default constructor
	{
		System.out.println("Default Constructor");
	}
	Employee5(int eno)
	{
		this.eno=eno;
	}

	Employee5(int eno,String ename,double sal) // Parameterised const, eno1,ename1..-local variables
	{
		this(eno);// this keyword only points to instance variables.
		this.ename=ename;
		this.sal=sal;
	}
	public void display()//method
	{
		System.out.println("Employee number:"+eno);
		System.out.println("Employee name:"+ename);
		System.out.println("Employee salary:"+sal);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Employee5();// Object Creation
		Employee5 emp5=new Employee5(21,"Dhruti",600000);//object reference
		emp5.display();
	}
}
