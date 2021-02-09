
package com.training.lambda.tp2;

public class LambdaRunnable {

	public static void main(final String[] args) {

		final Runnable oldRunnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("Old Thread way");
			}
		};
		oldRunnable.run();

	}
}
