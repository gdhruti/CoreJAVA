package com.evergent.corejava.exceptionhandling;
//exception occur or not finally block will get excuted
public class ExceptionDemo5finally {
	String name=null;
	int k=0;
	public void myData()
	{
		try
		{
			System.out.println("one");
			System.out.println(name.length());
			int t=10/k;
			System.out.println("End");
		}
			catch(NullPointerException e)
			{
				System.out.println("I can handle:"+e);
			}
			//catch(ArithmeticException e)
			//{
				//System.out.println("I can handle:"+e);
			//}
		catch(Exception e)
	    {
		    System.out.println(e);
	    }
		finally
		{
			System.out.println("Finally block for closing db or network connections");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionDemo5finally ed3=new ExceptionDemo5finally();
		ed3.myData();

	}

}
