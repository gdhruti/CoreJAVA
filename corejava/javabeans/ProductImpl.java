package com.evergent.corejava.javabeans;

//initializing using constructor and retrving with getter
public class ProductImpl {
	public static void main(String[] args) {
		Product pd = new Product(100,"Dhruti",500.10);
		System.out.println("Product no "+pd.getPno());
		System.out.println("Product name "+pd.getPname());
		System.out.println("price "+pd.getPrice());
		
	}
}




