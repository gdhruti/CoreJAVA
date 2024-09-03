package com.evergent.corejava.exceptionhandling;


class ArithmeticException extends Throwable 
{
	ArithmeticException()
	{
		
	}
	
}

public class ExceptionDemo8throws   {
	String name="jj";
	int k=0;
	public void myData() throws NullPointerException
	{
		//int t=k/10;
	//nt k=0;
		System.out.println("One");
		System.out.println(name.length());
		System.out.println("End");
	}
	public void myInfo() throws ArithmeticException
	{
		int t=k/10;
		System.out.println(t);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			ExceptionDemo8throws ed2=new ExceptionDemo8throws();
			ed2.myData();
			//ed2.myInfo();
			//ed2.myData();
		}
		catch (NullPointerException e)
		{
			System.out.println("I can handle:"+e);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}
