package com.bnpparibas.training.lambda.tp1;

public class MathOperationNoJava8 {

	public static void main(String[] args) {
		MathOperation mathOperation = new MathOperation() {
			public int sommer(int a, int b) {
				return a + b;
			}
		};
		int d = mathOperation.sommer(1, 3);
		System.out.println(d);
	}

}
