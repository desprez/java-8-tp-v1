package com.training.functionalinterface.tp3;

import java.util.function.IntToDoubleFunction;

public class CelsiusToFahrenheitConverter {

	public static void main(final String[] args) {
		final IntToDoubleFunction celcius2Farenheit = t -> 1.8 * t + 32;
		System.out.println(celcius2Farenheit.applyAsDouble(15));
	}

}
