package com.narasimha.dao;

import org.springframework.data.repository.CrudRepository;

import com.narasimha.beans.CreditCardDetails;



public interface CreditCardRepository extends CrudRepository<CreditCardDetails,Integer> {

}
