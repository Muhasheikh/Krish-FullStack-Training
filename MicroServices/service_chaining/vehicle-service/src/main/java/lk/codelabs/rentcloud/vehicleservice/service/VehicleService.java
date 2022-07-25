package lk.codelabs.rentcloud.vehicleservice.service;

import java.util.List;

import lk.muhassan.rentcloud.model.vehicle.Vehicle;

public interface VehicleService {
    Vehicle save(Vehicle customer);

    Vehicle findById(int id);

    List<Vehicle> findAll();
}
