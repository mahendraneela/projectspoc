package com.customer.customer_poc.dal;

import com.customer.customer_poc.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository  extends MongoRepository<Customer, String> {
}
