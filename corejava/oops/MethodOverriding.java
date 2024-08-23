package com.evergent.corejava.oops;
class MyBigData
{
	public void myData()
	{
		System.out.println("MyBigData");
	}
	public void myData1()
	{
		System.out.println("MyBigData");
	}
}

public class MethodOverriding extends MyBigData {
	public void MyData()

	{
		System.out.println("Mydata");
	}
	public void show()
	{
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverriding mo = new MethodOverriding();
		mo.myData();
		mo.myData1();
		mo.show();
	}
}
