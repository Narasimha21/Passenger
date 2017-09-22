package com.narasimha.service;

import com.narasimha.beans.PassengerProfile;

public interface IPassengerService {

	PassengerProfile getPassengerProfile(int profile_id);

	PassengerProfile addPassengerProfile(PassengerProfile passenger);

	void deletePassengerProfile(int profile_id);

	PassengerProfile updatePassengerProfile(PassengerProfile passenger);

}
