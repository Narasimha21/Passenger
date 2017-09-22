package com.narasimha.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.narasimha.beans.PassengerProfile;



public interface PassenegerProfileRepo extends CrudRepository<PassengerProfile, Integer> {
	
}
