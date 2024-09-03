package com.evergent.corejava.Exam1;

public class SpliDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "Java is a Powerful Programming Language";
		// split the string by space
		String[] words=str.split(" ");
		for(int i=0;i<words.length;i++)
		{
			System.out.println(words[i]);
		}
		// adv for each loop
		for(String w: words)
		{
			System.out.println(w);
		}
		

	}

}
