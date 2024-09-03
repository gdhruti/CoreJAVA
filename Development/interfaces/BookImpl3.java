package com.evergent.corejava.interfaces;

public class BookImpl3 implements Book, NewBook{
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
	public void addNewBook()
	{
		System.out.println("Java New Version");
	}
	public void myData()
	{
		System.out.println("Mydata interface");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookImpl3 book1= new BookImpl3();
		book1.bookTitle();
		book1.bookAuthor();
		book1.bookPrice();
		book1.show();
		book1.addNewBook();
		book1.myData();
	}
}
