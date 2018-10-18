package com.java.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Passport {
	public Passport() {
		super();
	}

	@Id
	String passportId;
	String baseLocation;

	public String getBaseLocation() {
		return baseLocation;
	}

	public void setBaseLocation(String baseLocation) {
		this.baseLocation = baseLocation;
	}

	public Passport(String id) {
		super();
		this.passportId = id;
	}

	public String getPassportId() {
		return passportId;
	}

	public void setPassportId(String passportId) {
		this.passportId = passportId;
	}


}
