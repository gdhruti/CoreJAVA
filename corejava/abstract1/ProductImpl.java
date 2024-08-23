package com.evergent.corejava.abstract1;

   public class ProductImpl extends Product{
	public void show()
	{
		System.out.println("Local show method");
	}
	public void newProduct()
	{
		System.out.println("My new product");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductImpl product2= new ProductImpl();// object creation for normal class 
		//Product pd=new Product();	// creating obj and reference for abstract class
		//Cannot instantiate the type Product
		Product product1= new ProductImpl();// creating reference for abstract class
		product2.show();// normal class method
		product1.newProduct();// abstract class method calling
		product1.allProducts(); // abstract class method calling
	
	}
	}


