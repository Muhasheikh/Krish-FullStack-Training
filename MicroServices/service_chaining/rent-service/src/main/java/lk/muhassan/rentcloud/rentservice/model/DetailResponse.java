package lk.muhassan.rentcloud.rentservice.model;

import lk.muhassan.rentcloud.model.customer.Customer;
import lk.muhassan.rentcloud.model.rent.Rent;
import lk.muhassan.rentcloud.model.vehicle.Vehicle;

public class DetailResponse implements Response {

	Rent rent;
	Customer customer;
	Vehicle vehicle;

	public DetailResponse(Rent rent, Customer customer, Vehicle vehicle) {
		this.rent = rent;
		this.customer = customer;
		this.vehicle = vehicle;
	}

	public Rent getRent() {
		return rent;
	}

	public void setRent(Rent rent) {
		this.rent = rent;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
}
