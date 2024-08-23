package com.evergent.corejava.oops;

public class MethodsFlow {
	//No parameters with no return type
	public void show()
	{
		System.out.println("No parameters with no return type");
	}
	//parameter with no return type
	public void myData(int a,int b)
	{
		System.out.println(a+b);
	}
	//parameter with return type
	public int  myMul(int a,int b)
	{
		return a*b;
	}
	//no parameters with return type
	public int myChange()
	{
		return 100;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsFlow mf = new MethodsFlow();
		mf.show();
		mf.myData(10,5);
		System.out.println(mf.myMul(10, 5));
		System.out.println(mf.myChange());
		
	}
}
