package com.evergent.corejava.exceptionhandling;
// Multiple exception
//if 2 exception occur then 1st exception will comes at prior and stops executing
import java.lang.*;
class ArithmeticException extends Throwable 
{

}
public class ExceptionDemo3 {
	String name = null;
	int k = 2;

	public void myData() {
	    try {
	        System.out.println("one");
	        System.out.println(name.length());
	        int t = 10 / k;
	        System.out.println("End");
	    } catch (NullPointerException e) {
	        System.out.println("I can handle: " + e);
	    } catch (ArithmeticException e) {
	        System.out.println("I can handle: " + e);
	    }
	}


		    /*catch(Exception e)
		    {
			    System.out.println("I can handle:"+e);
		    }*/
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionDemo3 ed3=new ExceptionDemo3();
		ed3.myData();

	}

}
