package com.evergent.corejava.collections;
import java.util.ArrayList;
// ArrayList allows duplicate elements
public class ArrayListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList myList= new ArrayList();
		myList.add(100);
		myList.add("hello");
		myList.add(21.1);
		myList.add(100);
		myList.add("Welcome");
		System.out.println(myList);
		
	}
}
