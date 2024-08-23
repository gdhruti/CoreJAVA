package com.evergent.corejava.Exam1;
//  MultiLevelInheritance 
class MyPerson
{
	public void personInfo()
	{
		System.out.println("Dhruti");
	}
}
class PersonDetails extends MyPerson
{
	public void personData()
	{
		System.out.println("Vijayawada");
	}
}

public class MultiLevelInheritance extends PersonDetails {
	public void show()
	{
		System.out.println("local method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiLevelInheritance mi= new MultiLevelInheritance();
		mi.personInfo();
		mi.personData();
		mi.show();
	}
}
