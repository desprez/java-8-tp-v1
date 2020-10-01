package com.bnpparibas.training.stream.tp5;

import java.time.LocalDate;
import java.time.Month;

public class School {

	public static void main(String[] args) {
		School demo = new School();
		Teacher[] teachers = { new Teacher("Jimm", LocalDate.of(1982, Month.JANUARY, 1)),
				new Teacher("Beck", LocalDate.of(1986, Month.DECEMBER, 25)),
				new Teacher("Anna", LocalDate.of(1974, Month.JULY, 4)),
				new Teacher("James", LocalDate.of(1980, Month.SEPTEMBER, 1)) };
		double avgAge = demo.calculateAvgAge(teachers);
		System.out.printf("Average teacher age : %2.2f\n", avgAge);
	}

	private double calculateAvgAge(Teacher[] teachers) {
		// TODO
		return 0;
	}
}