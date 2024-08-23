package com.evergent.corejava.gneralprogramming;

public class BigOfFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=20,c=30,d=40,e=50;
		if(a>b && a>c && a>d && a>e)
		{
			System.out.println("a is bigger"+a);
		}
		else if(b>a&& b>c&& b>d && b>e)
		{
			System.out.println("b is bigger"+b);
		}
		else if(c>a&& c>b && c>d && c>e)
		{
			System.out.println("c is bigger"+c);
		}
		else if(d>a&& d>b && d>c && d>e)
		{
			System.out.println("d is bigger"+d);
		}
		else
		{
			System.out.println("e is bigger"+e);
		}

	}

}
