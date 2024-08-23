package com.evergent.corejava.oops;

public class CalculationDemo {
	int a=10,b=20;
	int c;
	public void addition()
	{
		c=a+b;
		System.out.println(c);
	}
	public void subtraction()
	{
		c=a-b;
		System.out.println(c);
	}
	public void multiplication()
	{
		c=a*b;
		System.out.println(c);
	}
	public void division()
	{
		c=a/b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculationDemo cd= new CalculationDemo();
		cd.addition();
		cd.subtraction();
		cd.multiplication();
		cd.division();
	

	}

}
