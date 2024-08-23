package com.evergent.corejava.interfaces;

public class BookImpl implements Book {
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
		BookImpl book1= new BookImpl();
		book1.bookTitle();
		book1.bookAuthor();
		book1.bookPrice();
		book1.show();
	}
}
