package com.movieticket.service;

import com.movieticket.dao.CustomerDAO;
import com.movieticket.model.Customer;

public class CustomerService {

    private CustomerDAO customerDAO = new CustomerDAO();

    public void registerCustomer(String name, String phone) {
        Customer customer = new Customer(name, phone);
        customerDAO.addCustomer(customer);
    }
}