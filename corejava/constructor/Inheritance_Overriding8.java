package com.evergent.corejava.constructor;
class Animal
{
	private String name;
	private int age;
	//constructor
	public Animal(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	//method
	public void displayInfo()
	{
		System.out.println("name:"+name);
		System.out.println("age:"+age);
	}
}
//subclass inheritance
class Dog extends Animal
{
	private String breed;
	public Dog(String name,int age, String breed)
	{
		super(name,age);//call to super class constructor
		this.breed=breed;
	}
	//method overriding
	public void displayInfo()
	{
		super.displayInfo();
		System.out.println("Breed:"+breed);
	}
}
public class Inheritance_Overriding8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog=new Dog("Buddy",6,"Golden Retriever");
		dog.displayInfo();
	}
}
