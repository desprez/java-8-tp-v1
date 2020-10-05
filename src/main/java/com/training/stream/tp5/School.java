package com.training.stream.tp5;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
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

	private double calculateAvgAge(final Teacher[] teachers) {
		final LocalDate today = LocalDate.now();
		final Stream<Teacher> stream = Stream.of(teachers);
		final Stream<Period> periods = stream.map((teacher) -> Period.between(teacher.getBirthday(), today));
		final double avgAge = periods.mapToLong((period) -> period.getYears()).average().getAsDouble();
		return avgAge;
	}
}