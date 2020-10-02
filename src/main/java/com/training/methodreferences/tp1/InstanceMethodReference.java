package com.training.methodreferences.tp1;

import java.util.Arrays;
import java.util.List;

public class InstanceMethodReference {

	public static void main(final String[] args) {
		final List<String> fruits = Arrays.asList("Orange", "Apple", "Banana");

		fruits.forEach(s -> System.out.println(s));
		fruits.forEach(System.out::println);

		fruits.sort((s1, s2) -> s1.compareToIgnoreCase(s2));
		fruits.sort(String::compareToIgnoreCase);

		fruits.forEach(s -> System.out.println(s));

	}

}
