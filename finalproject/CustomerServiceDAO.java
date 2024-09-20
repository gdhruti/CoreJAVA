package com.evergent.dhruti.finalproject;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerServiceDAO {
    // Method to create a new inquiry
    public int createInquiry(String customerName, String details) {
        String sql = "INSERT INTO inquiries (customer_name, details) VALUES (?, ?)";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, customerName);
            pstmt.setString(2, details);
            return pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    // Method to get inquiries
    public List<Inquiry> getInquiries() {
        String sql = "SELECT id, customer_name, details FROM inquiries";
        List<Inquiry> inquiries = new ArrayList<>();
        try (Connection con = DBConnection.getConnection();
             PreparedStatement pstmt = con.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                inquiries.add(new Inquiry(rs.getString("customer_name"), rs.getString("details")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return inquiries;
    }

    // Method to add a response
    public int addResponse(int inquiryId, String response) {
        String sql = "INSERT INTO responses (inquiry_id, response) VALUES (?, ?)";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, inquiryId);
            pstmt.setString(2, response);
            return pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    // Method to get responses for an inquiry
    public List<String> getResponses(int inquiryId) {
        String sql = "SELECT response FROM responses WHERE inquiry_id = ?";
        List<String> responses = new ArrayList<>();
        try (Connection con =DBConnection.getConnection();
             PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, inquiryId);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                responses.add(rs.getString("response"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return responses;
    }
}

