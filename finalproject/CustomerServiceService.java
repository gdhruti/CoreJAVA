package com.evergent.dhruti.finalproject;



import java.util.List;

public class CustomerServiceService {
    private CustomerServiceDAO customerServiceDAO = new CustomerServiceDAO();

    public int createInquiry(Inquiry inquiry) {
        return customerServiceDAO.createInquiry(inquiry.getCustomerName(), inquiry.getDetails());
    }

    public List<Inquiry> getInquiries() {
        return customerServiceDAO.getInquiries();
    }

    public int addResponse(int inquiryId, String response) {
        return customerServiceDAO.addResponse(inquiryId, response);
    }

    public List<String> getResponses(int inquiryId) {
        return customerServiceDAO.getResponses(inquiryId);
    }
}
