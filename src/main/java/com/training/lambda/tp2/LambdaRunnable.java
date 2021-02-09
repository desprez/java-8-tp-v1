
package com.training.lambda.tp2;
/**
 * Exercice : Remplacer la classe anonyme par une expression lambda
 */
public class LambdaRunnable {

	public static void main(final String[] args) {

		// Old way
		final Runnable oldRunnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("Old Thread way");
			}
		};
		oldRunnable.run();
	}
}
