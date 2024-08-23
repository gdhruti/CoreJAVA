package com.evergent.corejava.exceptionhandling;
// exceptions are executed while abnormal conditions only
//Normal flow, it won't execute any exception
//once any exception occur in java code then remaining lines of code unreachable
public class ExceptionDemo2 {
	String name=null;
	public void myData()
	{
		try
		{
			System.out.println("ONE");
			System.out.println(name.length());
			System.out.println("End");
		}
		catch(NullPointerException e)
		{
			System.out.println("I can handle:"+e);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String name="null"; output-4
		ExceptionDemo2 ed2=new ExceptionDemo2();
		ed2.myData();
	}
}
