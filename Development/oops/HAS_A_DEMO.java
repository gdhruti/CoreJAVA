package com.evergent.corejava.oops;

public class HAS_A_DEMO {
	public void myData()
	{
		System.out.println("HAS_A_DEMO");
	}
// we can call method of anaother class without using extends 
// we create an object of another class and call it without using extends
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HAS_A_DEMO has= new HAS_A_DEMO();
		has.myData();
		Person p=new Person();
		p.display();

	}

}
