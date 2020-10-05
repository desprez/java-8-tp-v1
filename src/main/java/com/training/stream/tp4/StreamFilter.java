package com.training.stream.tp4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamFilter {

	public static void main(final String[] args) throws IOException {

		final Stream<Path> list = Files.walk(Paths.get(".."));
		final Predicate<Path> predicate = p -> p.toString().endsWith(".java");
		list.filter(predicate).forEach(System.out::println);

	}

}
