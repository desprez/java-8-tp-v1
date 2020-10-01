package com.bnpparibas.training.optional.tp1;

public class Office {
	private String id;
	private Address address;

	public Office(String id, Address address) {
		this.id = id;
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public Address getAddress() {
		return address;
	}
}
