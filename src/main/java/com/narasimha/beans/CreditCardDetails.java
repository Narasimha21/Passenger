package com.narasimha.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "creditcard")
public class CreditCardDetails implements Serializable {

	private static final long serialVersionUID = 1L;
	private int profile_id;
	private long card_number;
	private String card_type;
	private int expiration_month;
	private int expiration_year;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="profile_id")
	public int getProfile_id() {
		return profile_id;
	}

	public void setProfile_id(int profile_id) {
		this.profile_id = profile_id;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (card_number ^ (card_number >>> 32));
		result = prime * result + ((card_type == null) ? 0 : card_type.hashCode());
		result = prime * result + expiration_month;
		result = prime * result + expiration_year;
		result = prime * result + profile_id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CreditCardDetails other = (CreditCardDetails) obj;
		if (card_number != other.card_number)
			return false;
		if (card_type == null) {
			if (other.card_type != null)
				return false;
		} else if (!card_type.equals(other.card_type))
			return false;
		if (expiration_month != other.expiration_month)
			return false;
		if (expiration_year != other.expiration_year)
			return false;
		if (profile_id != other.profile_id)
			return false;
		return true;
	}

}
