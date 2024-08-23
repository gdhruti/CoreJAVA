package com.evergent.corejava.dhruti.application04;

public interface ComplaintManagement {
	void logComplaint(String description);
    void checkComplaintStatus(int id);
    void estimateTime(int id);
    void displayInvoice(int id);
    void displaySummary();

}
