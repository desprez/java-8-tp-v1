package com.training.stream.tp3;

import java.util.stream.Stream;

/**
 * Exercice :
 *
 * - concaténer les streams stream1 et stream2
 *
 * - Afficher le résultat en passant par l’api Java 8
 */
public class StreamConcat {
	public static void main(final String[] args) {
		final Stream<String> stream1 = Stream.of("January", "Christie");
		final Stream<String> stream2 = Stream.of("Okanagan", "Sydney", "Alpha");
	}
}