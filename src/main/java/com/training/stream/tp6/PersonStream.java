package com.training.stream.tp6;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonStream {

	public static void main(final String[] args) {
		final List<Person> persons = Arrays.asList(new Person("Brian", 22), new Person("Jeff", 20), new Person("Jimmy", 40));

		final Stream<Person> personStream = persons.stream();

		final Function<Person, String> mapPersonToName = p -> p.getName();

		final Stream<String> personNames = personStream.map(mapPersonToName);
		personNames.forEach(System.out::println);


		final List<Person> collect = persons.stream().filter(p -> p.getName().equals("Jeff")).collect(Collectors.toList());
		// collect.forEach(System.out::println);

		//		OptionalInt max = persons.stream().mapToInt(p -> p.getAge()).reduce(Integer::max);
		//		System.out.println(max);

		final Map<Integer, String> map = persons.stream().collect(Collectors.toMap(Person::getAge, Person::getName));

		map.forEach((x, y) -> System.out.println("Key: " + x + ", value: " + y));
	}

}