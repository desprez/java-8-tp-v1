package com.training.stream.tp8;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeeTP {

	static List<Employee> employees = new ArrayList<>();

	static {
		employees.add(new Employee(123, "Jack", "Johnson", LocalDate.of(1988, Month.APRIL, 12)));
		employees.add(new Employee(345, "Cindy", "Bower", LocalDate.of(2011, Month.DECEMBER, 15)));
		employees.add(new Employee(567, "Perry", "Node", LocalDate.of(2005, Month.JUNE, 07)));
		employees.add(new Employee(467, "Pam", "Krauss", LocalDate.of(2005, Month.JUNE, 07)));
		employees.add(new Employee(435, "Ann", "zee", LocalDate.of(1988, Month.APRIL, 17)));
		employees.add(new Employee(678, "Ann", "Stal", LocalDate.of(2007, Month.APRIL, 12)));
	}

	public static void main(final String[] args) {
		final Comparator<Employee> byEmployeeNumber = (e1, e2) -> Integer.compare(e1.getEmployeeNumber(),
				e2.getEmployeeNumber());
		employees.stream().sorted(byEmployeeNumber).forEach(e -> System.out.println(e));

		final Comparator<Employee> byFirstName = (e1, e2) -> e1.getEmployeeFirstName().compareTo(e2.getEmployeeFirstName());
		final Comparator<Employee> byLastName = (e1, e2) -> e1.getEmployeeLastName().compareTo(e2.getEmployeeLastName());
		employees.stream().sorted(byFirstName.thenComparing(byLastName)).forEach(e -> System.out.println(e));
	}

}
