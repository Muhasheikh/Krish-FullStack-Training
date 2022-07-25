package lk.muhassan.rentcloud.customerservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import lk.muhassan.rentcloud.model.customer.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
