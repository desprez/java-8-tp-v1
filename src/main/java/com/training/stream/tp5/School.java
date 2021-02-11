package com.training.stream.tp5;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class School {

	public static void main(final String[] args) {
		final School demo = new School();
		final Teacher[] teachers = { new Teacher("Jimm", LocalDate.of(1982, Month.JANUARY, 1)),
				new Teacher("Beck", LocalDate.of(1986, Month.DECEMBER, 25)),
				new Teacher("Anna", LocalDate.of(1974, Month.JULY, 4)),
				new Teacher("James", LocalDate.of(1980, Month.SEPTEMBER, 1)) };
		final double avgAge = demo.calculateAvgAge(teachers);
		System.out.printf("Average teacher age : %2.2f\n", avgAge);
	}

	// Solution sans modifier la classe Teacher
	private double calculateAvgAge(final Teacher[] teachers) {
		final LocalDate today = LocalDate.now();
		final Stream<Teacher> stream = Stream.of(teachers);
		final Stream<Period> periods = stream.map((teacher) -> Period.between(teacher.getBirthday(), today));
		final double avgAge = periods.mapToLong((period) -> period.getYears()).average().getAsDouble();
		return avgAge;
	}
	
	// Solution avec Collectors.averagingDouble() en modifiant la classe Teacher
	private Double calculateAvgAge2(final Teacher[] teachers) {
		final Stream<Teacher> stream = Stream.of(teachers);
		final Double avgAge = stream.collect(Collectors.averagingDouble(p -> p.getAge()));
		return avgAge;
	}
	
	// Solution avec mapToInt() en modifiant la classe Teacher
	private Double calculateAvgAge3(final Teacher[] teachers) {
		final Stream<Teacher> stream = Arrays.stream(teachers);
		final Double avgAge = stream.mapToInt(Teacher::getAge).average().getAsDouble();
		return avgAge;
	}
	
	// 
}
