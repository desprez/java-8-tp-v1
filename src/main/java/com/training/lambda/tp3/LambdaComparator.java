package com.training.lambda.tp3;

import java.util.Arrays;
import java.util.List;

public class LambdaComparator {

	public static void main(String[] args) {
		Person[] personsArray = { new Person("jeff", 42), new Person("jack", 22), new Person("jimm", 32) };
		List<Person> persons = Arrays.asList(personsArray);
		persons.sort((p1, p2) -> p1.getAge() - p2.getAge());

		persons.forEach(x -> System.out.println(x));
	}
}
