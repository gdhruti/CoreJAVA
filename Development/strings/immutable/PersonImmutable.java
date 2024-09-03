package com.evergent.corejava.strings.immutable;
//Q- Making String Immutable
public final class PersonImmutable {
	private final String name;
	private final int age;
	//Constructor to initialize the fields
	public PersonImmutable(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	public String MyName()
	{
		return name;
	}
	public int MyAge()
	{
		return age;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonImmutable person =new PersonImmutable("Dhruti",22);
		System.out.println("Name:"+ person.MyName());
		System.out.println("Age:"+ person.MyAge());
	}
}
