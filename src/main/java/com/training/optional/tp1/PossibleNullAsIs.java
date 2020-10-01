package com.training.optional.tp1;

public class PossibleNullAsIs {

	public static void main(String[] args) {
		Address address = new Address(null, "New York");
		Office office = new Office("OF1", address);
		Company company = new Company("Door Never Closed", office);
		System.out.println("Street Name:" + getStreet(company));
	}

	private static String getStreet(Company company) {
		String streetAddress = null;
		if (company != null) {
			Office office = company.getOffice();
			if (office != null) {
				Address address = office.getAddress();
				if (address != null) {
					streetAddress = address.getStreet();
				}
			}
		}
		return streetAddress;
	}
}
