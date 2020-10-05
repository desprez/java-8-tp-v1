package com.training.stream.tp3;

import java.util.stream.Stream;

public class StreamConcat {
	public static void main(final String[] args) {
		final Stream<String> stream1 = Stream.of("January", "Christie");
		final Stream<String> stream2 = Stream.of("Okanagan", "Sydney", "Alpha");

		Stream.concat(stream1, stream2).forEach(System.out::println);
	}
}