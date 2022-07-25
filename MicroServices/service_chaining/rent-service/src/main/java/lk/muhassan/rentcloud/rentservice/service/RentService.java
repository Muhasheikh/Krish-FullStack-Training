package lk.muhassan.rentcloud.rentservice.service;

import lk.muhassan.rentcloud.model.rent.Rent;
import lk.muhassan.rentcloud.rentservice.model.DetailResponse;

import java.util.List;

public interface RentService {
	Rent save(Rent customer);

	Rent findById(int id);

	List<Rent> findAll();

	DetailResponse findDetailResponse(int id);
}
