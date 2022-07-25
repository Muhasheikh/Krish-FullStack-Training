package lk.muhassan.rentcloud.customerservice.service;

import java.util.List;

import lk.muhassan.rentcloud.model.customer.Customer;

public interface CustomerService {
    Customer save(Customer customer);

    Customer findById(int id);

    List<Customer> findAll();
}
