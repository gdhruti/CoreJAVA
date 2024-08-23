package com.evergent.corejava.abstract1;

public class ProductImpl2 extends Product3{
	ProductImpl2()
	{
		System.out.println("ProductImpl2: Constructor");
	}
	public void show()
	{
		System.out.println("show method");
	}
	public void newProduct()
	{
		System.out.println("My new Product");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductImpl2 product1=new ProductImpl2();
		product1.show();
		product1.newProduct();
		product1.allProducts();

	}

}
