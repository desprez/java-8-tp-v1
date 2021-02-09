package com.training.lambda.tp1;

/**
 * Exercice : remplacer le calcul de la somme fourni dans cette classe en
 * passant par les expressions lambda
 */
public class MathOperationNoJava8 {

	public static void main(final String[] args) {

		final MathOperation mathOperation = new MathOperation() {
			@Override
			public int calculer(final int a, final int b) {
				return a + b;
			}
		};

		final int d = mathOperation.calculer(1, 3);
		System.out.println(d);
	}

}
