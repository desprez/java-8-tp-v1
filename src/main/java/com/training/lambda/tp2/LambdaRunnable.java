
package com.training.lambda.tp2;

public class LambdaRunnable {

	public static void main(String[] args) {
		Runnable oldRunnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("Old Thread way");
			}
		};
		oldRunnable.run();
	}
}
