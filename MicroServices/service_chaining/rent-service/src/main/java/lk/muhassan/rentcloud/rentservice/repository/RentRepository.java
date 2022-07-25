package lk.muhassan.rentcloud.rentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import lk.muhassan.rentcloud.model.rent.Rent;

import javax.persistence.criteria.CriteriaBuilder;

public interface RentRepository extends JpaRepository<Rent,Integer> {}
