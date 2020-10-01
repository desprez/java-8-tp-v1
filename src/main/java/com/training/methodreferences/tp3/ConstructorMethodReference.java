package com.training.methodreferences.tp3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Supplier;

public class ConstructorMethodReference {

	public static Collection<Integer> arrayToCollection(Supplier<Collection<Integer>> supplier, Integer[] numbers) {
		Collection<Integer> collection = supplier.get();
		for (int i : numbers) {
			collection.add(i);
		}
		return collection;
	}

	public static void main(String[] args) {
		Integer[] array = { 1, 8, 5 };
		Collection<Integer> col1 = arrayToCollection(() -> {
			return new ArrayList<>();
		}, array);

		System.out.println("Natural order");
		col1.forEach(System.out::println);
	}
}