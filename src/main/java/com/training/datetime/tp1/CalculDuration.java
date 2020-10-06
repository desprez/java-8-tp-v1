package com.training.datetime.tp1;

import java.time.Duration;
import java.time.Instant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CalculDuration {

	private static final Logger logger = LoggerFactory.getLogger(CalculDuration.class);

	public static void main(final String[] args) throws InterruptedException {
		final Instant start = Instant.now();
		Thread.sleep(5000);
		final Instant end = Instant.now();
		logger.info("Took : {} sec", Duration.between(start, end).toMillis() / 1000);
	}

}
