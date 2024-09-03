package com.evergent.corejava.Exam1;

public class ProductImpl extends Product3 {
	ProductImpl()
	{
		System.out.println("Normal class Constructor");
	}
	public void show()
	{
		System.out.println("Local method");
	}
	public void newProduct()
	{
		System.out.println(" my new Product");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductImpl product1 = new ProductImpl();
		product1.show();
		product1.newProduct();
		product1.allProducts();
	}
}
