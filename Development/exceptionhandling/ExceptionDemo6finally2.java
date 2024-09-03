package com.evergent.corejava.exceptionhandling;
// try should be followed by either catch or finally block
public class ExceptionDemo6finally2 {
	String name="null";
	int k=2;
	public void myData()
	{
		try
		{
			System.out.println("one");
			System.out.println(name.length());
			int t=10/k;
			System.out.println("End");
		}
			/*catch(NullPointerException e)
			{
				System.out.println("I can handle:"+e);
			}
			catch(ArithmeticException e)
			{
				System.out.println("I can handle:"+e);
			}*/
		finally
		{
			System.out.println("Finally block for closing db or network connections");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionDemo6finally2 ed3=new ExceptionDemo6finally2();
		ed3.myData();
	}
}