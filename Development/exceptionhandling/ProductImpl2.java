package com.evergent.corejava.exceptionhandling;
class AgeNotSupport extends Exception
{
	public AgeNotSupport(String message) {
		System.out.println("Hello:"+message);
	}
}
public class ProductImpl2 {
	int age=25;
	public void myData() throws AgeNotSupport
	{
		if(age>18)
			throw new AgeNotSupport("Eligible for voting");
		else
			System.out.println("not eligible..");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			ProductImpl2 product1= new ProductImpl2();
			product1.myData();
		}
		catch(Exception e) {
			System.out.println("I can handle:"+e);
		}
	}
}
