package com.narasimha.service;

import com.narasimha.beans.CreditCardDetails;

public interface ICreditService {

	CreditCardDetails getCreditCardDetails(int profile_id);

	CreditCardDetails addCreditCardDetails(CreditCardDetails creditcard);

	void deleteCreditCardDetails(int profile_id);

	CreditCardDetails updateCreditCardDetails(CreditCardDetails creditcard);

}
