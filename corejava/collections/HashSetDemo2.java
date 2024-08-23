package com.evergent.corejava.collections;
import java.util.HashSet;
public class HashSetDemo2 {
//HashSet does not allow duplicate elements
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet mySet= new HashSet();
		mySet.add(100);
		mySet.add("100");
		mySet.add(100);
		mySet.add(21.3);
		mySet.add("hello");
		mySet.add("welcome");
		System.out.println(mySet);
	}
}
