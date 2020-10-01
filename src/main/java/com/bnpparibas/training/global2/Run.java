package com.bnpparibas.training.global2;

public class Run {

	private int duration;		// In seconds
	private int distance;		// In meter
	private double speed;		
	private Runner runner;
	
	public Run(int duration, int distance, Runner runner, RunCalculation calc) {
		this.duration = duration;
		this.distance = distance;
		this.runner = runner;
		setSpeed(calc);
	}
	
	public Run(int duration, int distance, Runner runner) {
		this(duration, distance, runner, r -> ((double) distance / (double) duration) * 3.6);
	}
	
	public double setSpeed(RunCalculation calc) {
		this.speed = calc.speed(this);
		return this.speed;
	}
	
	public int getDuration() {
		return duration;
	}
	
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public int getDistance() {
		return distance;
	}
	
	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	public double getSpeed() {
		return speed;
	}
	
	public Runner getRunner() {
		return runner;
	}

	public void setRunner(Runner runner) {
		this.runner = runner;
	}

	@Override
	public String toString() {
		return "Run of " + this.distance + " meters, in " + this.duration + " seconds, "
				+ "speed: " + this.speed;
	}
}
