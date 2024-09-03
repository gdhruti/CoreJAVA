package com.evergent.corejava.constructor;
class MyEmployee
{
	int eno;
	public MyEmployee()// default constructor, constructor name and class name is same
	{
	
	}
	MyEmployee(int eno)// parameterised constructor
	{
		this.eno=eno;// this refers to the current objectin the constructor 
		System.out.println("Employee No super class:"+eno);
	}
}
public class Employee6 extends MyEmployee{
	int eno;//default=0 , instance variables
	String ename;//null
	double sal;//0.0
	Employee6() // Default constructor
	{
		System.out.println("Default Constructor");
	}
	Employee6(int eno)
	{
		this.eno=eno;
	}
	Employee6(int eno,String ename,double sal) // Parameterised const, eno1,ename1..-local variables
	{
		super(eno);// super keyword always calls super class constructor.
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
		new Employee6();// Object Creation
		Employee6 emp6=new Employee6(21,"Dhruti",600000);//object reference
		emp6.display();
	}
}
