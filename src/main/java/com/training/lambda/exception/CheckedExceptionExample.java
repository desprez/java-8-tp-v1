package com.training.lambda.exception;

import java.util.Arrays;
import java.util.List;

public class CheckedExceptionExample {

	public static void main(final String[] args) {

		final List<String> classes = Arrays.asList("java.lang.Object", "java.lang.Integer", "java.lang.String");

		classes.forEach(className -> {
			final Class<?> clazz = Class.forName(className);
			System.out.println(clazz);
		});

	}

}
