package com.narasimha.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.narasimha.beans.PassengerProfile;
import com.narasimha.dao.PassenegerProfileRepo;

public class PassengerService implements IPassengerService {
	@Autowired
	PassenegerProfileRepo pdao;

	@Override
	public PassengerProfile getPassengerProfile(int profile_id) {
		// TODO Auto-generated method stub
		return pdao.findOne(profile_id);

	}

	@Override
	public PassengerProfile addPassengerProfile(PassengerProfile passenger) {
		// TODO Auto-generated method stub
		return pdao.save(passenger);

	}

	@Override
	public void deletePassengerProfile(int profile_id) {
		// TODO Auto-generated method stub
		pdao.delete(profile_id);

	}

	@Override
	public PassengerProfile updatePassengerProfile(PassengerProfile passenger) {
		// TODO Auto-generated method stub
		return pdao.save(passenger);

	}

}
