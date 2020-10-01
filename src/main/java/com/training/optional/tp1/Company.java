package com.training.optional.tp1;

public class Company {
	private String name;
	private Office office;

	public Company(String name, Office office) {
		this.name = name;
		this.office = office;
	}

	public String getName() {
		return name;
	}

	public Office getOffice() {
		return office;
	}
}
