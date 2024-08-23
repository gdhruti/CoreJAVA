package com.evergent.corejava.dhruti.application04;

public abstract class AbstractComplaintManagement implements ComplaintManagement {
	 static class Complaint {
	        int id;
	        String description;
	        String status;
     //parameterised constructor
	        Complaint(int id, String description, String status) {
	            this.id = id;
	            this.description = description;
	            this.status = status;
	        }
	    }
    protected static final int MAX_COMPLAINTS = 100;
    protected static Complaint[] complaints = new Complaint[MAX_COMPLAINTS];
    protected static int complaintCount = 0;
    protected static int nextComplaintId = 100;

    @Override
    public void logComplaint(String description) {
        if (complaintCount < MAX_COMPLAINTS) {
            complaints[complaintCount] = new Complaint(nextComplaintId, description, "New");
            System.out.println("Complaint Logged Successfully!");
            System.out.println("Complaint ID: " + nextComplaintId);
            complaintCount++;
            nextComplaintId++;
        } else {
            System.out.println("Complaint storage is full.");
        }
    }

    @Override
    public void checkComplaintStatus(int id) {
        boolean statusFound = false;
        for (Complaint c : complaints) {
            if (c != null && c.id == id) {
                System.out.println("Complaint ID: " + c.id);
                System.out.println("Description: " + c.description);
                System.out.println("Status: " + c.status);
                statusFound = true;
                break;
            }
        }
        if (!statusFound) {
            System.out.println("Complaint ID not found.");
        }
    }

    @Override
    public void estimateTime(int id) {
        boolean estimateFound = false;
        for (int i = 0; i < complaintCount; i++) {
            if (complaints[i].id == id) {
                int position = i + 1; // Position in the array
                System.out.println("Estimated time for Complaint ID " + id + " is " + position + " day(s).");
                estimateFound = true;
                break;
            }
        }
        if (!estimateFound) {
            System.out.println("Complaint ID not found.");
        }
    }

    @Override
    public void displayInvoice(int id) {
        boolean invoiceFound = false;
        for (Complaint c : complaints) {
            if (c != null && c.id == id) {
                System.out.println("Invoice Display");
                System.out.println("----------------------");
                System.out.println("Complaint ID: " + c.id);
                System.out.println("Description: " + c.description);
                System.out.println("Status: " + c.status);
                invoiceFound = true;
                break;
            }
        }
        if (!invoiceFound) {
            System.out.println("Complaint ID not found.");
        }
    }

    @Override
    public void displaySummary() {
        System.out.println("Summary Report");
        System.out.println("----------------------");
        System.out.println("Total Complaints Logged: " + complaintCount);
        if (complaintCount > 0) {
            Complaint lastComplaint = complaints[complaintCount - 1];
            System.out.println("Last Complaint Description: " + lastComplaint.description);
            System.out.println("Last Complaint Status: " + lastComplaint.status);
        } else {
            System.out.println("No complaints logged yet.");
        }
    }
}

