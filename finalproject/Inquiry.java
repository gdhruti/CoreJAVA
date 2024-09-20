package com.evergent.dhruti.finalproject;



public class Inquiry {
    private String customerName;
    private String details;

    public Inquiry(String customerName, String details) {
        this.customerName = customerName;
        this.details = details;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getDetails() {
        return details;
    }

    @Override
    public String toString() {
        return "Customer: " + customerName + ", Details: " + details;
    }
}
