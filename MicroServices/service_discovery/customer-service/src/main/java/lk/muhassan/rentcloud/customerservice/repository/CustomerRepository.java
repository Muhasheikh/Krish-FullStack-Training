package lk.muhassan.rentcloud.customerservice.repository;

import lk.arshad.rentcloud.model.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
