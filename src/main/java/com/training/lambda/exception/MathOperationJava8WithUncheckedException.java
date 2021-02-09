package com.training.lambda.exception;

import com.training.lambda.tp1.MathOperation;

public class MathOperationJava8WithUncheckedException {

	public static void main(final String[] args) {
		final MathOperation mathOperation = (a, b) -> a / b;
		final int r1 = mathOperation.calculer(6, 3);
		System.out.println(r1);
		final int r2 = mathOperation.calculer(3, 0);
		System.out.println(r2);
	}

}