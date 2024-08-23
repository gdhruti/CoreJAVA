package com.evergent.corejava.static1;
//Non static method can access static variables and static method
public class StaticDemo4 {
	static String cname="India";
	String name="Dhruti";//static variables or class variables
	static public void myData()
	{
		//Error: Cannot make a static reference of non static method()
		//show();
		System.out.println("MyData");
	}
	public void show()
	{
		myData();
		System.out.println("Show is non static method"+cname);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myData();
		//show();
		//Cannot make a static reference to the non-static method show() from the type StaticDemo2
		System.out.println(cname);
		StaticDemo4 sd4=new StaticDemo4();
		sd4.show();
	}
}
