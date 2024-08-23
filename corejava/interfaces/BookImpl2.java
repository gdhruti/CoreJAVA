package com.evergent.corejava.interfaces;

public class BookImpl2 implements Book {
	public void bookTitle()
	{
		System.out.println("Corejava: "+cname);
	}
	public void bookAuthor()
	{
		System.out.println("Oracle crop");
	}
	public void bookPrice()
	{
		System.out.println("price is: 550");
	}
	public void show()
	{
		System.out.println("Show is a local method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//can not instantiate the type Book
		//Book b1= newBook();
		Book b2= new BookImpl2();// creating reference for interface but not class
		b2.bookTitle();
		b2.bookAuthor();
		b2.bookPrice();
		//b2.show();
		//The method show() is undefined for the type Book
	}
}
