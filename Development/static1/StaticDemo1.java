package com.evergent.corejava.static1;
//static variable and method declaration
public class StaticDemo1 {
	static String cname="India";//static variables or class variables
	static public void myData()
	{
		System.out.println("MyData");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StaticDemo1.cname);
		StaticDemo1.myData();

	}

}
