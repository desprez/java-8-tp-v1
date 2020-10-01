package com.bnpparibas.training.global2;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;

public class Exercises {
	/**
	 * Count the number of female runners.
	 */
	public static int countFemaleRunners(List<Runner> runners) {
		return 0;
	}

	/**
	 * Give the height of the biggest runner
	 */
	public static double biggestRunner(List<Runner> runners) {
		return 0.0;
	}

	/**
	 * Find the youngest runner
	 */
	public static Runner oldestRunner(List<Runner> runners) {
		return null;
	}

	/**
	 * Find the total distance of all the runners in km.
	 */
	public static double totalDistance(List<Runner> runners) {
		return 0.0;
	}

	/**
	 * Find the total distance of all {@link Runner.Gender#MALE} the runners in
	 * km.
	 */
	public static double totalDistanceMales(List<Runner> runners) {
		return 0.0;
	}

	/**
	 * Calculate the calories Jesus burned on all his runs. (hint:
	 * RunCalculation has a static method.)
	 */
	public static int calculateCaloriesJesus(List<Runner> runners) {
		return 0;
	}

	/**
	 * Change the speed of all the runs to m/s. Print all the runs before the
	 * change and after the change. Use a method reference for the printing.
	 * (hint: Run has a toString() method already.)
	 * <p>
	 * This is a nice exercise to see in which order your stream gets parsed.
	 */
	public static void setSpeedToMeterPerSecond(List<Runner> runners) {

	}

	/**
	 * Find the fastest female run that is longer than 5km
	 */
	public static double fastestFemaleRun(List<Runner> runners) {
		return 0.0;
	}

	/**
	 * Calculate the average speed of all Sam's runs that are less than 63
	 * minutes.
	 */
	public static double avgSpeedSam(List<Runner> runners) {
		return 0.0;
	}

	/**
	 * @return a String with the names of all Runners separated with a '#'
	 *         sorted on their weight. (Print the runners to see you've sorted
	 *         correctly.) (hint: Use a collector)
	 */
	public static String namesOfRunners(List<Runner> runners) {
		return null;
	}

	/**
	 * @return a list of runs that are longer than one hour
	 */
	public static List<Run> getRuns1hour(List<Runner> runners) {
		return null;
	}

	/**
	 * @return a Map:<br>
	 *         Key = Birth date<br>
	 *         Entry = Name of the runner
	 */
	public static Map<LocalDateTime, String> getBirthDatesMap(List<Runner> runners) {
		return null;
	}

	/**
	 * Now we want a map where we can get each runner by his/her name. The name
	 * is unique for each runner
	 *
	 * @return a Map:<br>
	 *         Key = Name<br>
	 *         Entry = Runner with this name
	 */
	public static Map<String, Runner> getRunnersMapByName(List<Runner> runners) {
		return null;
	}

	/**
	 * Now we want to get the runners for each year of birth.
	 *
	 * @return a Map:<br>
	 *         Key = Birth year<br>
	 *         Entry = List of runners who were born in that year
	 */
	public static Map<Integer, List<Runner>> getRunnersMapWithBirthYearKey(List<Runner> runners) {
		return null;
	}

	/**
	 * Print the name and height of each runner. Use a custom collector to
	 * append the Strings
	 * <p>
	 * Example: Sam : 1.73m Tony : 1.89m ...
	 *
	 * @param runners
	 * @return String containing the name and height of each runner
	 */
	public static String heightStatistics(List<Runner> runners) {
		return null;
	}

	/**
	 * No we want the average without using {@linkplain DoubleStream#average()},
	 * use a custom collector:
	 * {@linkplain DoubleStream#collect(Supplier, ObjDoubleConsumer, BiConsumer)}
	 * .
	 *
	 * @return average distance of all runs in km.
	 */
	public static double averageDistance(List<Runner> runners) {
		return 0.0;
	}
}
