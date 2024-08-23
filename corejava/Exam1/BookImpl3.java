package com.evergent.corejava.Exam1;
// multiple inheritance - Interface
public class BookImpl3 implements Book,NewBook{
	public void bookTitle()
	{
		System.out.println(" Core java "+cname);
	}
	public void bookAuthor()
	{
		System.out.println(" Orcale corp");
	}
	public void bookPrice()
	{
		System.out.println(" Core java "+ 550);
	}
	public void addNewBook()
	{
		System.out.println(" Java New Version ");
	}
	public void show()
	{
		System.out.println(" Local method");
	}
	public void myData()
	{
		System.out.println(" My data interface");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookImpl3 book=new BookImpl3();
		book.bookTitle();
		book.bookAuthor();
		book.bookPrice();
		book.addNewBook();
		book.show();
		book.myData();
	}
}
