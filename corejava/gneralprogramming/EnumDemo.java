package com.evergent.corejava.gneralprogramming;
enum Colour{
	Red,blue,green,black;
}
enum News
{
	North,south,east,west;
}
enum Products
{
	Laptops,desktops,tabs;
}
enum Days
{
	M,Tuesday,W,Thu,F,Sat,Sun;
}

public class EnumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Colour c=Colour.Red;
		System.out.println("My fav colour is:"+c);
		News n= News.south;
		System.out.println("I live in:"+n);
		Days d=Days.Tuesday;
		System.out.println("Holiday is on:"+d);

	}

}
