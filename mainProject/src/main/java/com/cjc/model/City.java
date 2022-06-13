package com.cjc.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class City {

	@Id
	private Integer cityPinCode;
	private String cityName;
	public Integer getCityPinCode() {
		return cityPinCode;
	}
	public void setCityPinCode(Integer cityPinCode) {
		this.cityPinCode = cityPinCode;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
}
