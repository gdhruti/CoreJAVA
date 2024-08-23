package com.evergent.corejava.arrays;

public class DdArray6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[][]=new String[5][5];
		for (int i=0;i<5;i++) {
		System.out.println();
			for(int j=0;j<5;j++)
			{
				arr[i][j]="JAVA";
				System.out.print(" "+arr[i][j]);
			}
		}

	}

}
