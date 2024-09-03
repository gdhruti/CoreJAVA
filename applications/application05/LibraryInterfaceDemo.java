package com.evergent.corejava.dhruti.casestudy.library;

public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        // Test case #1: KidUser
    	try {
    		KidUser kidUser1 = new KidUser();
            kidUser1.setAge(10);
            kidUser1.registerAccount(kidUser1.getAge());
            kidUser1.setBookType("Kids");
            kidUser1.requestBook(kidUser1.getBookType());
            KidUser kidUser2 = new KidUser();
            kidUser2.setAge(18);
            kidUser2.registerAccount(kidUser2.getAge());
            kidUser2.setBookType("Fiction");
            kidUser2.requestBook(kidUser2.getBookType());
         // Test case #2: AdultUser
            AdultUser adultUser1 = new AdultUser();
            adultUser1.setAge(5);
            adultUser1.registerAccount(adultUser1.getAge());
            adultUser1.setBookType("Kids");
            adultUser1.requestBook(adultUser1.getBookType());
            AdultUser adultUser2 = new AdultUser();
            adultUser2.setAge(23);
            adultUser2.registerAccount(adultUser2.getAge());
            adultUser2.setBookType("Fiction");
            adultUser2.requestBook(adultUser2.getBookType());
    	}
    	catch(Exception e){
    		System.out.println("Caught an Exeception "+e);
    		
    		
    	}
    }
}