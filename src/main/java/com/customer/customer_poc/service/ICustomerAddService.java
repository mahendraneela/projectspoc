package com.customer.customer_poc.service;

import com.customer.customer_poc.model.Customer;

import java.util.List;

public interface ICustomerAddService {
    Customer addCustomer(Customer customer);
    List<Customer>getAllCustomers();
}

