package com.evergent.corejava.exceptionhandling;
// exceptions are executed while abnormal conditions only
//Normal flow, it won't execute any exception
//once any exception occur in java code then remaining lines of code unreachable
public class ExceptionDemo7 {
	String name=null;
	public void myData() throws NullPointerException
	{
		System.out.println("ONE");
		System.out.println(name.length());
		System.out.println("End");
		
	
	}
	public static void main(String[] args) {
		try
		{
			ExceptionDemo7 ed2=new ExceptionDemo7();
			ed2.myData();
		}
		// TODO Auto-generated method stub
		//String name="null"; output-4
		catch(NullPointerException e)
		{
			System.out.println("I can handle:"+e);
		}
	}
}
