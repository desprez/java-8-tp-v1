package com.training.optional.tp1;

import java.util.Optional;

public class Address {

	private final Optional<String> street;
	private final String city;

	public Address(final Optional<String> street, final String city) {
		this.street = street;
		this.city = city;
	}

	public Optional<String> getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}
}
