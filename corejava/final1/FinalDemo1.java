package com.evergent.corejava.final1;

public class FinalDemo1 {
	final String cname="India";
	public void myData()
	{
		//cname="Welcome"; gives error
		System.out.println("cname:"+cname);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalDemo1 fd= new FinalDemo1();
		fd.myData();

	}

}
