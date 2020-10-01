package com.training.global2;

import java.time.LocalDateTime;
import java.util.List;

public class Runner {

	public enum Gender {
		MALE, FEMALE
	};

	private String name;
	private double height;
	private double weight;
	private Gender gender;
	private LocalDateTime birthDate;
	private List<Run> runs;

	public Runner(String name, double height, double weight, Gender gender, LocalDateTime birthDate) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.gender = gender;
		this.birthDate = birthDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public LocalDateTime getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDateTime birthDate) {
		this.birthDate = birthDate;
	}

	public List<Run> getRuns() {
		return runs;
	}

	public void setRuns(List<Run> runs) {
		this.runs = runs;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Runner [name=");
		builder.append(name);
		builder.append(", height=");
		builder.append(height);
		builder.append(", weight=");
		builder.append(weight);
		builder.append(", gender=");
		builder.append(gender);
		builder.append(", birthDate=");
		builder.append(birthDate);
		builder.append(", runs=");
		builder.append(runs);
		builder.append("]");
		return builder.toString();
	}

}
