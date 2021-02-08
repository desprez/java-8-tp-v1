package com.training.functionalinterface.tp1;

public class MilesToKmConveter {

	public static void main(final String[] args) {
		final int miles = 3;
		double kms = 0;

		// Avant JAVA 8
		final Converter converter = new Converter();
		kms = converter.apply(miles);

		// Depuis JAVA 8
		// TODO

		System.out.printf("%d miles = %3.2f kilometers", miles, kms);
	}

}