package com.training.lambda.tp1;

public class MathOperationJava8 {

	public static void main(final String[] args) {
		final MathOperation mathOperation = (a, b) -> a + b;
		final int d = mathOperation.sommer(1, 3);
		System.out.println(d);
	}

}
