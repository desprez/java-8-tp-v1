package com.training.datetime.tp3;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFormatterSample {

	public static void main(final String[] args) {
		final LocalDateTime example = LocalDateTime.now();

		final DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd MMMM , yyyy HH:mm:ss");
		System.out.println("Format 2: " + example.format(formatter2));

		final DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		System.out.println("Format 1: " + example.format(formatter1));

	}

}
