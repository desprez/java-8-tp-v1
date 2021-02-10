package com.training.stream.tp1;

import java.util.stream.Stream;

/**
 * Exercice :
 *
 * - Remplacer dans la méthode collect: Les expressions lambda Par des
 * références de méthode.
 */
public class StreamCollect1 {

	public static void main(final String[] args) {
		final String[] strings = { "a", "b", "c", "d", "e" };
		final Stream<String> stream1 = Stream.of(strings);
		final StringBuilder sb1 = stream1.collect(() -> new StringBuilder(), (a1, b1) -> a1.append(b1),
				(a2, b2) -> a2.append(b2));

		System.out.println(sb1.toString());
	}
}