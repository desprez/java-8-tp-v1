
package com.training.lambda.tp2;

public class LambdaRunnable {

	public static void main(final String[] args) {
		final Runnable oldRunnable = () -> System.out.println("new Thread way");
		oldRunnable.run();
	}
}
