package lk.codelabs.rentcloud.vehicleservice.controller;

import lk.codelabs.rentcloud.vehicleservice.service.VehicleService;
import lk.muhassan.rentcloud.model.vehicle.Vehicle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/services/vehicles")
public class VehicleController {

    @Autowired
    VehicleService vehicleService;

    @PostMapping
    public Vehicle save(@RequestBody Vehicle vehicle) {
        return vehicleService.save(vehicle);
    }

    @GetMapping(value = "/{id}")
    public Vehicle getVehicle(@PathVariable int id)
    {
        return vehicleService.findById(id);
    }

    @GetMapping
    public List<Vehicle> getAllVehicles() {
        return vehicleService.findAll();
    }

}
