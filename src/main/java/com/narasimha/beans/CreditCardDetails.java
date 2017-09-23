package com.narasimha.beans;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "creditcard")
public class CreditCardDetails implements Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private long card_number;
	private String card_type;
	private int expiration_month;
	private int expiration_year;
	
	private PassengerProfile passenger;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	public int getId() {
		return id;
	}
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "profile_id" )
	public PassengerProfile getPassenger() {
		return passenger;
	}

	public  void setPassenger(PassengerProfile passenger) {
		this.passenger = passenger;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getCard_number() {
		return card_number;
	}

	public void setCard_number(long card_number) {
		this.card_number = card_number;
	}

	public String getCard_type() {
		return card_type;
	}

	public void setCard_type(String card_type) {
		this.card_type = card_type;
	}

	public int getExpiration_month() {
		return expiration_month;
	}

	public void setExpiration_month(int expiration_month) {
		this.expiration_month = expiration_month;
	}

	public int getExpiration_year() {
		return expiration_year;
	}

	public void setExpiration_year(int expiration_year) {
		this.expiration_year = expiration_year;
	}

}
