package com.evergent.corejava.logicalPrograms;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1;
		System.out.print(a+" "+b);
		int c;
		for(int i=1;i<=15;i++)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}

	}

}
