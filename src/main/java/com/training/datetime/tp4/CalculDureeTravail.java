package com.training.datetime.tp4;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;

public class CalculDureeTravail {

	public static void main(final String[] args) {
		final LocalDateTime arriveMatin = LocalDateTime.of(2017, Month.APRIL, 27, 9, 29, 30);
		final LocalDateTime departSoir = LocalDateTime.of(2017, Month.APRIL, 27, 18, 25, 24);

		final Duration dureeGlobal = Duration.between(arriveMatin, departSoir);

		final LocalDateTime debutDej = LocalDateTime.of(2017, Month.APRIL, 27, 12, 30, 30);
		final LocalDateTime finDej = LocalDateTime.of(2017, Month.APRIL, 27, 13, 20, 14);

		final Duration dureeDej = Duration.between(debutDej, finDej);
		final Duration dureePause = Duration.ofMinutes(20);

		final Duration dureeEffective = dureeGlobal.minus(dureeDej).minus(dureePause);

		System.out.println(dureeEffective);
	}
}
