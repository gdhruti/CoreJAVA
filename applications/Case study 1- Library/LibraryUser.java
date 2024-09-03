package com.evergent.corejava.dhruti.casestudy.library;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
public interface LibraryUser {
	void registerAccount(int age) throws InvalidAgeException;
    void requestBook(String btype);
}
