package com.training.stream.tp1;

import java.util.stream.Stream;

public class StreamCollect1 {
	public static void main(String[] args) {
		String[] strings = { "a", "b", "c", "d", "e" };
		Stream<String> stream1 = Stream.of(strings);
		StringBuilder sb1 = stream1.collect(() -> new StringBuilder(), (a1, b1) -> a1.append(b1),
				(a2, b2) -> a2.append(b2));

		System.out.println(sb1.toString());
	}
}