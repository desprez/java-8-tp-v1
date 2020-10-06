package com.training.optional.tp1;

import java.util.Optional;

public class PossibleNullAsIs {

	public static void main(final String[] args) {
		final Address address = new Address(Optional.empty(), "New York");
		final Office office = new Office("OF1", address);
		final Company company = new Company("Door Never Closed", office);

		final Optional<String> street = getStreet(company);

		street.ifPresent(System.out::println);
	}

	private static Optional<String> getStreet(final Company company) {
		Optional<String> streetAddress = Optional.empty();
		if (company != null) {
			final Office office = company.getOffice();
			if (office != null) {
				final Address address = office.getAddress();
				if (address != null) {
					streetAddress = address.getStreet();
				}
			}
		}
		return streetAddress;
	}
}
