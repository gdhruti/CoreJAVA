package com.evergent.corejava.collections;
import java.util.TreeSet;
import java.util.Iterator;
public class TreeSetDemo5 {
//HashSet does not allow duplicate elements
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet mySet= new TreeSet();
		mySet.add(100);
		mySet.add(40);
		mySet.add(60);
		mySet.add(21);
		//mySet.add("hello");
		//mySet.add("welcome");
		System.out.println(mySet);
		Iterator i=mySet.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
