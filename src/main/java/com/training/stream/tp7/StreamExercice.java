package com.training.stream.tp7;

import java.util.Arrays;
import java.util.List;

/**
 * Exercice :
 *
 * - Produire une chaîne unique qui résulte de la concaténation des éléments du
 * tableau en majuscules: Ex., le résultat devrait être "HIHELLO ...". Utilisez
 * une seule opération de réduction, sans utiliser map.
 *
 * - Produire la même chaîne que ci-dessus, mais cette fois par une opération
 * map qui transforme les mots en majuscule, suivie d'une opération de réduction
 * qui les concatène.
 *
 * - Produire une chaîne concaténée tout les éléments de la liste, avec une
 * virgule comme séparateur
 *
 * - Trouver le nombre total de chaînes de caractères dans la liste.
 *
 * - Trouver le nombre de mots contenant un "h".
 *
 */
public class StreamExercice {

	public static void main(final String[] args) {
		final List<String> words = Arrays.asList("hi", "hello", "hola", "bye", "goodbye", "adios");
		System.out.printf("Original words: %s.%n", words);
	}

}