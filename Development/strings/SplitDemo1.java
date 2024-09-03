package com.evergent.corejava.strings;

public class SplitDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Java is a powerful language";
		//Split the string by space
		String[] words= str.split(" ");
		for (int i=0;i<words.length;i++)
		System.out.println(words[i]);
		//for each adv loop
		for(String w:words)
		{
			System.out.println(w);
		}
	}
}
