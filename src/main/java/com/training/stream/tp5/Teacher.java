package com.training.stream.tp5;

import java.time.LocalDate;
import java.time.Period;

public class Teacher {
	private String name;
	private LocalDate birthday;

	public Teacher(String name, LocalDate birthday) {
		this.name = name;
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	
	public int getAge() {
		return Period.between(getBirthday(), LocalDate.now()).getYears();
	}
}
