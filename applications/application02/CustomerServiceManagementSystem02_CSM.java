package com.evergent.corejava.dhruti.application02;

import java.io.IOException;
import java.util.Scanner;

public class CustomerServiceManagementSystem02_CSM {

    enum Module {L, C, R, Q}
    enum Submodule1 {F, M}
    enum Submodule2 {T, E, M}
    enum Submodule3 {I, S, M}

    static class Complaint {
        int id;
        String description;
        String status;

        Complaint(int id, String description, String status) {
            this.id = id;
            this.description = description;
            this.status = status;
        }
    }
     // complaints is an array to store cpmalaints with fixed size of 100.
    static Complaint[] complaints = new Complaint[100];
    static int complaintCount = 0; //keeps track of the no of complaints
    static int nextComplaintId = 100; //to generate ids to each complaint

    public static void main(String[] args) throws IOException {
        String module;
        Scanner br = new Scanner(System.in);

        System.out.println("\n\t\t \t\t Welcome To CUSTOMER SERVICE MANAGEMENT SYSTEM");

        while (true) {

            System.out.println("----------------------");
            System.out.println(" CSM Main Menu");
            System.out.println("----------------------");
            System.out.println("L-Log Complaint");
            System.out.println("C-Check Complaint Status");
            System.out.println("R-Generate Report");
            System.out.println("Q-Exit");
            System.out.println("----------------------");
            System.out.println("Enter your Module code (L,C,R,Q) : ");

            module = br.nextLine();
            System.out.println("You entered module is  : " + module);

            
                switch (Module.valueOf(module)) {

                    case L:
                        System.out.println(" Log Complaint");
                        System.out.println("----------------------");
                        System.out.println("F-Log New Complaint");
                        System.out.println("M-Return to Main Menu");
                        System.out.println("----------------------");
                        System.out.println("Enter your Submodule code (F,M) : ");

                        module = br.nextLine();
                        switch (Submodule1.valueOf(module)) {

                            case F:
                                if (complaintCount < complaints.length) {
                                    System.out.println("Enter Complaint Description:");
                                    String description = br.nextLine();
                                    String status = "New";
               //array where the new complaint object will be stored, Constructor call for the complaint class                     
                                    complaints[complaintCount] = new Complaint(nextComplaintId, description, status);
                                    System.out.println("Complaint Logged Successfully!");
                                    System.out.println("Complaint ID: " + nextComplaintId);
                                    complaintCount++;
                                    nextComplaintId++;
                                } else {
                                    System.out.println("Complaint storage is full.");
                                }
                                break;

                            case M:
                                break;
                        }
                        break;

                    case C:
                        System.out.println(" Check Complaint Status");
                        System.out.println("----------------------");
                        System.out.println("T-Check Status");
                        System.out.println("E-Check Estimated Time");
                        System.out.println("M-Return to Main Menu");
                        System.out.println("----------------------");
                        System.out.println("Enter your Submodule code (T,E,M) : ");

                        module = br.nextLine().toUpperCase();
                        switch (Submodule2.valueOf(module)) {

                            case T:
                                System.out.println("Enter Complaint ID to check status:");
                                int id = Integer.parseInt(br.nextLine());
                                boolean statusFound = false;
                                //in for complaint object and complaint array
                                for (Complaint c : complaints) {
                                    if (c != null && c.id == id) {
                                        System.out.println("Complaint ID: " + c.id);
                                        System.out.println("Description: " + c.description);
                                        System.out.println("Status: " + c.status);
                 // Setting the flag to true- which indicates that the id was found                        
                                        statusFound = true;
                                        break;
                                    }
                                }
                                if (!statusFound) {
                                    System.out.println("Complaint ID not found.");
                                }
                                break;

                            case E:
                                System.out.println("Enter Complaint ID to estimate time:");
                                int estimateId = Integer.parseInt(br.nextLine());
                                boolean estimateFound = false;
                                for (int i = 0; i < complaintCount; i++) {
                                    if (complaints[i].id == estimateId) {
                                        int position = i + 1; // Position in the array
                                        System.out.println("Estimated time for Complaint ID " + estimateId + " is " + position + " day(s).");
                                        estimateFound = true;
                                        break;
                                    }
                                }
                                if (!estimateFound) {
                                    System.out.println("Complaint ID not found.");
                                }
                                break;

                            case M:
                                break;
                        }
                        break;

                    case R:
                        System.out.println(" Generate Report");
                        System.out.println("----------------------");
                        System.out.println("I-Display Invoice");
                        System.out.println("S-Display Summary");
                        System.out.println("M-Return to Main Menu");
                        System.out.println("----------------------");
                        System.out.println("Enter your Submodule code (I,S,M) : ");

                        module = br.nextLine().toUpperCase();
                        switch (Submodule3.valueOf(module)) {

                            case I:
                                System.out.println("Enter Complaint ID to display invoice:");
                                int invoiceId = Integer.parseInt(br.nextLine());
                                boolean invoiceFound = false;
                                for (Complaint c : complaints) {
                                    if (c != null && c.id == invoiceId) {
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
                                break;

                            case S:
                                System.out.println("Summary Report");
                                System.out.println("----------------------");
                                System.out.println("Total Complaints Logged: " + complaintCount);
                                if (complaintCount > 0) {
        //complaints is an array that holds complaint class objects
                                	//complaintcount-1 calculates the index of the most recent complaint
                                    Complaint lastComplaint = complaints[complaintCount - 1];
                                    System.out.println("Last Complaint Description: " + lastComplaint.description);
                                    System.out.println("Last Complaint Status: " + lastComplaint.status);
                                } else {
                                    System.out.println("No complaints logged yet.");
                                }
                                break;

                            case M:
                                break;
                        }
                        break;

                    case Q:
                        System.out.println("Exit Module");
                        System.exit(0);
                        break;
                }
            
        }
    }
}

