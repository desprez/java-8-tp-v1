package com.training.datetime.tp1;

/**
 * Exercice :
 *
 * Convertir le calcul de la durée d’exécution de la classe en passant par les
 * nouvelles API Java 8 : Instant & Duration
 *
 */
public class CalculDuration {

	public static void main(final String[] args) throws InterruptedException {
		final long start = System.currentTimeMillis();
		Thread.sleep(5000);
		final long end = System.currentTimeMillis();
		System.out.println("Took : " + (end - start) / 1000 + " sec");
	}

}
