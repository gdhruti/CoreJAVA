package com.evergent.corejava.static1;
//static variable and method declaration
public class StaticDemo5 {
	static String cname="India";//static variables or class variables
	static
	{
		System.out.println("static Block");
	}
	static public void myData()
	{
		System.out.println("MyData");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StaticDemo5.cname);
		StaticDemo5.myData();

	}

}
