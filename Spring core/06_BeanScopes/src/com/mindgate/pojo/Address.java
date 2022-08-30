package com.mindgate.pojo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Address {
	private int addressId;
	private String houseNumber;
	private String buildingName;

	public Address() {
		System.out.println("def cons of add class");
	}

	public Address(int addressId, String houseNumber, String buildingName) {
		super();
		this.addressId = addressId;
		this.houseNumber = houseNumber;
		this.buildingName = buildingName;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", houseNumber=" + houseNumber + ", buildingName=" + buildingName
				+ "]";
	}

}
