package com.customer.customer_poc.controller;

import com.customer.customer_poc.model.Customer;
import com.customer.customer_poc.service.CustomerAddService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RequestMapping(value="/customer")
@RestController
public class CustomerAddController {
    private final CustomerAddService customerAddService;
    public CustomerAddController(CustomerAddService customerAddService){
        this.customerAddService=customerAddService;
    }
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Customer addCustomer(@RequestBody Customer customer){
        return customerAddService.addCustomer(customer);
    }

    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public List<Customer>getAllCustomers(){
        return customerAddService.getAllCustomers();
    }
}
