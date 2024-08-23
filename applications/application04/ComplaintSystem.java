package com.evergent.corejava.dhruti.application04;

import java.util.Scanner;

public class ComplaintSystem extends AbstractComplaintManagement {
    public void handleMainMenu() {
        Scanner br = new Scanner(System.in);
        String module;

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
            module = br.nextLine().toUpperCase();

            switch (module) {
                case "L":
                    handleLogComplaint(br);
                    break;
                case "C":
                    handleCheckComplaintStatus(br);
                    break;
                case "R":
                    handleGenerateReport(br);
                    break;
                case "Q":
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid module code. Please try again.");
            }
        }
    }

    private void handleLogComplaint(Scanner br) {
        System.out.println(" Log Complaint");
        System.out.println("----------------------");
        System.out.println("F-Log New Complaint");
        System.out.println("M-Return to Main Menu");
        System.out.println("----------------------");
        System.out.println("Enter your Submodule code (F,M) : ");
        String submodule = br.nextLine().toUpperCase();

        switch (submodule) {
            case "F":
                System.out.println("Enter Complaint Description:");
                String description = br.nextLine();
                logComplaint(description);
                break;
            case "M":
                // Return to Main Menu
                break;
            default:
                System.out.println("Invalid submodule code. Please try again.");
        }
    }

    private void handleCheckComplaintStatus(Scanner br) {
        System.out.println(" Check Complaint Status");
        System.out.println("----------------------");
        System.out.println("T-Check Status");
        System.out.println("E-Check Estimated Time");
        System.out.println("M-Return to Main Menu");
        System.out.println("----------------------");
        System.out.println("Enter your Submodule code (T,E,M) : ");
        String submodule = br.nextLine().toUpperCase();

        switch (submodule) {
            case "T":
                System.out.println("Enter Complaint ID to check status:");
                int id = Integer.parseInt(br.nextLine());
                checkComplaintStatus(id);
                break;
            case "E":
                System.out.println("Enter Complaint ID to estimate time:");
                int estimateId = Integer.parseInt(br.nextLine());
                estimateTime(estimateId);
                break;
            case "M":
                // Return to Main Menu
                break;
            default:
                System.out.println("Invalid submodule code. Please try again.");
        }
    }

    private void handleGenerateReport(Scanner br) {
        System.out.println(" Generate Report");
        System.out.println("----------------------");
        System.out.println("I-Display Invoice");
        System.out.println("S-Display Summary");
        System.out.println("M-Return to Main Menu");
        System.out.println("----------------------");
        System.out.println("Enter your Submodule code (I,S,M) : ");
        String submodule = br.nextLine().toUpperCase();

        switch (submodule) {
            case "I":
                System.out.println("Enter Complaint ID to display invoice:");
                int invoiceId = Integer.parseInt(br.nextLine());
                displayInvoice(invoiceId);
                break;
            case "S":
                displaySummary();
                break;
            case "M":
                // Return to Main Menu
                break;
            default:
                System.out.println("Invalid submodule code. Please try again.");
        }
    }
}
