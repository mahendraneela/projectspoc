package com.customer.customer_poc.service;


import com.customer.customer_poc.dal.CustomerRepository;
import com.customer.customer_poc.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerAddService implements  ICustomerAddService {
    private final CustomerRepository customerRepository;
    @Autowired
    public CustomerAddService(CustomerRepository customerRepository)    {
        this.customerRepository=customerRepository;
    }
    public Customer addCustomer(Customer customer){
        return customerRepository.save(customer);
    };
    public List<Customer>getAllCustomers(){
        return customerRepository.findAll();
    }
}
