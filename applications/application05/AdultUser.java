package com.evergent.corejava.dhruti.casestudy.library;

public class AdultUser implements LibraryUser {
    private int age;
    private String bookType;
    public void registerAccount(int age) throws InvalidAgeException {
        if (age > 12) {
            System.out.println("You have successfully registered under an Adult Account.");
        } else {
        	throw new InvalidAgeException("Sorry, Age must be greater than 12 to register as a adult");
        }
    }
    public  void requestBook(String btype) {
        if ("Fiction".equalsIgnoreCase(btype)) {
            System.out.println("Book Issued successfully, please return the book within 7 days.");
        } else {
            System.out.println("Oops, you are allowed to take only adult Fiction books.");
        }
    }
    // Getter and Setter for age
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    // Getter and Setter for bookType
    public String getBookType() {
        return bookType;
    }
    public void setBookType(String bookType) {
        this.bookType = bookType;
    }
}

