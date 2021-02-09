package com.training.methodreferences.tp1;

import java.util.Arrays;
import java.util.List;

public class InstanceMethodReference {

	public static void main(final String[] args) {
		final List<String> fruits = Arrays.asList("Orange", "Apple", "Banana");

		// Display with lambda expression
		fruits.forEach(s -> System.out.println(s));
		// Display with method reference
		fruits.forEach(System.out::println);

		System.out.println("=======================");

		// sort with lambda expression
		fruits.sort((s1, s2) -> s1.compareToIgnoreCase(s2));
		// sort with lambda expression
		fruits.sort(String::compareToIgnoreCase  );

		// Display sorted result
		fruits.forEach(s -> System.out.println(s));
	}

}
