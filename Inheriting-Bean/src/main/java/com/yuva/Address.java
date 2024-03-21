package com.yuva;

public class Address {
	private String addressLane, city, state, country;

	public Address(String addressLane, String city, String state, String country) {
		super();
		this.addressLane = addressLane;
		this.city = city;
		this.state = state;
		this.country = country;
	}

	public String toString() {
		return addressLane + " " + city + " " + state + " " + country;

	}
}
