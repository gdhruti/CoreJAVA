package com.evergent.corejava.exceptionhandling;
class ProductNotFoundException extends Exception
{
	public ProductNotFoundException(String message) {
		System.out.println("Hello:"+message);
	}
}

public class ProductImpl {
	int pno=105;
	public void myData() throws ProductNotFoundException
	{
		if(pno>100)
			throw new ProductNotFoundException("this product is not available");
		else
			System.out.println("Product is there..");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			ProductImpl product1= new ProductImpl();
			product1.myData();
		}
		catch(Exception e) {
			System.out.println("I can handle:"+e);
		}

	}

}
