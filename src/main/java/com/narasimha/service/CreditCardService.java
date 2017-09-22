package com.narasimha.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.narasimha.beans.CreditCardDetails;
import com.narasimha.dao.CreditCardRepository;

public class CreditCardService implements ICreditService {

	@Autowired
	CreditCardRepository cdao;

	@Override
	public CreditCardDetails getCreditCardDetails(int profile_id) {
		// TODO Auto-generated method stub
		return cdao.findOne(profile_id);

	}

	@Override
	public CreditCardDetails addCreditCardDetails(CreditCardDetails creditcard) {
		// TODO Auto-generated method stub
		return cdao.save(creditcard);

	}

	@Override
	public void deleteCreditCardDetails(int profile_id) {
		// TODO Auto-generated method stub
		cdao.delete(profile_id);

	}

	@Override
	public CreditCardDetails updateCreditCardDetails(CreditCardDetails creditcard) {
		// TODO Auto-generated method stub
		return cdao.save(creditcard);

	}

}
