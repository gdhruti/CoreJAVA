package com.evergent.corejava.wrapperclasses;

import java.util.ArrayList;

public class WrapperClassesDemo4_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JDK 1.44 -boxing and unboxing done by developers
		int a=100;
		Integer i1=new Integer(a);
		ArrayList mylist=new ArrayList();
		mylist.add(i1);
		System.out.println(mylist);
		Integer i2=new Integer(200);
		mylist.add(i2);
		System.out.println(mylist);
		mylist.add(new Integer(45));
		System.out.println(mylist);
		System.out.println(mylist.get(1));// gives the value from the index provided
		//JDK 1.5 - compiler/jvm automatically does boxing and unboxing.
		ArrayList mylist1= new ArrayList();
		mylist1.add(100);// boxing
		System.out.println(mylist.get(0));//unboxing

	}

}
