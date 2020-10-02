package com.training.functionalinterface.tp2;

import java.util.function.BiFunction;

public class CalculSurface {

	public static void main(final String[] args) {

		final BiFunction<Double, Double, Double> calculSurface = (w, l) -> l * w;
		final double surface = calculSurface.apply(10d, 15d);

		System.out.println(surface);

	}

}
