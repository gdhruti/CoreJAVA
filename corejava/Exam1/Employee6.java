package com.evergent.corejava.Exam1;
// Constructor (this, super)
class MyEmployee
{ 
	int eno;
	public MyEmployee()// default constructor
	{
		
	}
	MyEmployee(int eno)// parameterised constructor
	{
		this.eno=eno;
		System.out.println("Employee no super class: "+ eno);
	}
}
public class Employee6 extends MyEmployee {
	int eno;
	String ename;
	double sal;
	Employee6()
	{
		System.out.println("Default Constructor");
	}
	Employee6(int eno, String ename, double sal)
	{
		super(eno);// calls super class constructor
		this.ename=ename;
		this.sal=sal;
	}
	public void display()// method
	{
		System.out.println("Employee no:"+eno);
		System.out.println("Employee name:"+ename);
		System.out.println("Employee sal:"+sal);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Employee6();//object creation
		Employee6 emp= new Employee6(729,"Dhruti",65000);// reference 
		emp.display();
	}
}
