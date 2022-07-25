package lk.codelabs.rentcloud.vehicleservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import lk.muhassan.rentcloud.model.vehicle.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle,Integer> {
}
