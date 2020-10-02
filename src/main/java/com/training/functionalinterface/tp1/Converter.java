package com.training.functionalinterface.tp1;

import java.util.function.Function;

/**
 * Avant JAVA 8
 */
public class Converter implements Function<Integer, Double> {

	@Override
	public Double apply(final Integer input) {
		return 1.6 * input;
	}

}