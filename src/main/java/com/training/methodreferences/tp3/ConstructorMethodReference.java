package com.training.methodreferences.tp3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Supplier;

/**
 * Exercice :
 *
 * <pre>
 * - Remplacer l’implémentation du Supplier par une référence du constructeur ArrayList
 * - Remplacer l’implémentation du Supplier par une référence de constructeur permettant d’avoir une liste triée
 * </pre>
 */
public class ConstructorMethodReference {

	public static Collection<Integer> arrayToCollection(final Supplier<Collection<Integer>> supplier, final Integer[] numbers) {
		final Collection<Integer> collection = supplier.get();
		for (final int i : numbers) {
			collection.add(i);
		}
		return collection;
	}

	public static void main(final String[] args) {
		final Integer[] array = { 1, 8, 5 };
		final Collection<Integer> col1 = arrayToCollection(() -> {
			return new ArrayList<>();
		}, array);

		System.out.println("Natural order");
		col1.forEach(System.out::println);
		System.out.println("=======================");
		System.out.println("Ascending order");
		// TODO

	}
}