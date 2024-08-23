package com.evergent.corejava.oops;
 class MyPerson {
	public void personInfo()
	{
		System.out.println("Dhruti");
	}
}
class PersonDetails extends MyPerson
{
	public void personData()
	{
		System.out.println("Hyderabad");
	}
}


public class MultiLevelInheritance extends PersonDetails {
	public void show()
	{
		System.out.println("Vinay");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiLevelInheritance mi=new MultiLevelInheritance();
		mi.personInfo();
		mi.personData();
		mi.show();
	}
}
