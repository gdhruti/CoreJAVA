package com.evergent.corejava.final1;
//we cant override final method and inherit
final class MyClass1
{
	final public void myProducts()
	{
		System.out.println("All products");
	}
}
//The type FinalDemo3 cannot subclass the final class MyClass
public class FinalDemo3 {//extends MyClass
	final String cname="India";
	//cannot overide the final method from MyClass
	public void myProducts1()
	{
		System.out.println("Hello Products");
	}
	public void myData()
	{
		System.out.println("cname:"+cname);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalDemo3 fd =new FinalDemo3();
		MyClass1 mc=new MyClass1();
		fd.myData();
		mc.myProducts();
	}
}
