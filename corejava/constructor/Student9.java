package com.evergent.corejava.constructor;

public class Student9 {
	String name;
	int age;
	//constructor
	public Student9(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	//copy Constructor
	public Student9(Student9 s)
	{
		this.name=s.name;
		this.age=s.age;
	}
	//method
	public void displayDetails()
	{
		System.out.println("Name:"+name);
		System.out.println("age:"+age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student9 student1= new Student9("dhruti",21);
		Student9 student2=new Student9(student1);
		student1.displayDetails();
		student2.displayDetails();

	}

}
