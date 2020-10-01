package com.training.global2;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class RunData {
	public static List<Runner> getRunnersList() {
		List<Runner> runners = new ArrayList<>();
		runners.add(initSam());
		runners.add(initTony());
		runners.add(initJesus());
		runners.add(initSophie());
		runners.add(initZoe());
		return runners;
	}

	private static Runner initSam() {
		Runner sam = new Runner("Sam", 1.73, 75.0, Runner.Gender.MALE, LocalDateTime.of(1991, Month.MAY, 10, 5, 5, 55));
		List<Run> samsRuns = new ArrayList<>();
		sam.setRuns(samsRuns);
		samsRuns.add(new Run(3657, 13000, sam));
		samsRuns.add(new Run(3779, 13000, sam));
		samsRuns.add(new Run(3955, 13000, sam));
		samsRuns.add(new Run(2433, 8300, sam));
		samsRuns.add(new Run(2389, 8300, sam));
		samsRuns.add(new Run(2345, 8300, sam));
		samsRuns.add(new Run(5736, 19100, sam));
		samsRuns.add(new Run(5798, 19100, sam));
		samsRuns.add(new Run(5866, 19100, sam));
		return sam;
	}

	private static Runner initTony() {
		Runner tony = new Runner("Tony", 1.89, 72.4, Runner.Gender.MALE,
				LocalDateTime.of(1976, Month.APRIL, 19, 8, 51, 24));
		List<Run> tonysRuns = new ArrayList<>();
		tony.setRuns(tonysRuns);
		tonysRuns.add(new Run(6087, 22800, tony));
		tonysRuns.add(new Run(5971, 22800, tony));
		tonysRuns.add(new Run(6013, 22800, tony));
		tonysRuns.add(new Run(4022, 15700, tony));
		tonysRuns.add(new Run(4165, 15700, tony));
		tonysRuns.add(new Run(4088, 15700, tony));
		tonysRuns.add(new Run(8256, 30100, tony));
		tonysRuns.add(new Run(8391, 30100, tony));
		tonysRuns.add(new Run(8154, 30100, tony));
		return tony;
	}

	private static Runner initJesus() {
		Runner jesus = new Runner("Jesus", 1.71, 61.8, Runner.Gender.MALE,
				LocalDateTime.of(1983, Month.SEPTEMBER, 12, 22, 32, 2));
		List<Run> jesusRuns = new ArrayList<>();
		jesus.setRuns(jesusRuns);
		jesusRuns.add(new Run(1800, 5863, jesus));
		jesusRuns.add(new Run(1800, 6033, jesus));
		jesusRuns.add(new Run(1800, 5766, jesus));
		jesusRuns.add(new Run(2400, 7645, jesus));
		jesusRuns.add(new Run(2400, 7898, jesus));
		jesusRuns.add(new Run(2400, 7789, jesus));
		jesusRuns.add(new Run(3000, 9365, jesus));
		jesusRuns.add(new Run(3000, 9751, jesus));
		jesusRuns.add(new Run(3000, 9418, jesus));
		return jesus;
	}

	private static Runner initSophie() {
		Runner sophie = new Runner("Sophie", 1.63, 61.9, Runner.Gender.FEMALE,
				LocalDateTime.of(1984, Month.AUGUST, 18, 23, 45, 12));
		List<Run> sophiesRuns = new ArrayList<>();
		sophie.setRuns(sophiesRuns);
		sophiesRuns.add(new Run(1601, 4400, sophie));
		sophiesRuns.add(new Run(1555, 4400, sophie));
		sophiesRuns.add(new Run(1653, 4400, sophie));
		sophiesRuns.add(new Run(2132, 6600, sophie));
		sophiesRuns.add(new Run(2024, 6600, sophie));
		sophiesRuns.add(new Run(2065, 6600, sophie));
		sophiesRuns.add(new Run(2408, 7500, sophie));
		sophiesRuns.add(new Run(2433, 7500, sophie));
		sophiesRuns.add(new Run(2542, 7500, sophie));
		return sophie;
	}

	private static Runner initZoe() {
		Runner zoe = new Runner("Zoe", 1.69, 56.7, Runner.Gender.FEMALE,
				LocalDateTime.of(1993, Month.JANUARY, 24, 12, 38, 47));
		List<Run> zoesRuns = new ArrayList<>();
		zoe.setRuns(zoesRuns);
		zoesRuns.add(new Run(1400, 4863, zoe));
		zoesRuns.add(new Run(1400, 4733, zoe));
		zoesRuns.add(new Run(1400, 4696, zoe));
		zoesRuns.add(new Run(2700, 8415, zoe));
		zoesRuns.add(new Run(2700, 8398, zoe));
		zoesRuns.add(new Run(2700, 8219, zoe));
		zoesRuns.add(new Run(3600, 10213, zoe));
		zoesRuns.add(new Run(3600, 10691, zoe));
		zoesRuns.add(new Run(3600, 10708, zoe));
		return zoe;
	}
}
