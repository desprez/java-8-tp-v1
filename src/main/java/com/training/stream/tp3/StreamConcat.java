package com.training.stream.tp3;

import java.util.stream.Stream;

public class StreamConcat {
	public static void main(String[] args) {
		Stream<String> stream1 = Stream.of("January", "Christie");
		Stream<String> stream2 = Stream.of("Okanagan", "Sydney", "Alpha");
	}
}