package com.evergent.corejava.gneralprogramming;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your name:");
		String name=sc.next();
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		System.out.println("Name="+name);
		System.out.println("Age="+age);

	}

}
