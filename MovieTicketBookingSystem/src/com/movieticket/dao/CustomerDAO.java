package com.movieticket.dao;
import com.movieticket.model.Customer;
import java.sql.Connection;
import java.sql.PreparedStatement;

	public class CustomerDAO {

	    public void addCustomer(Customer customer) {
	        try (Connection con = DBConnection.getConnection()) {

	            String sql = "INSERT INTO customer(name, phone) VALUES (?, ?)";
	            PreparedStatement ps = con.prepareStatement(sql);

	            ps.setString(1, customer.getName());
	            ps.setString(2, customer.getPhone());

	            ps.executeUpdate();
	            System.out.println("Customer Registered Successfully!");

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}


