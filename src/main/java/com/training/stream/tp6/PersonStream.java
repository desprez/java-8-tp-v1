package com.training.stream.tp6;

import java.util.Arrays;
import java.util.List;

/**
 * Exercice :
 *
 * - Trouver les personnes qui ont un nom Jeff
 *
 * - Trouver l'âge maximal des personnes
 *
 * - Convertir la liste de personnes en une Map avec comme clé l'âge et la
 * valeur le nom de la personne : List<Person> vers Map<Integer, String>
 *
 * - Afficher tous les éléments de la Map en passant par les API java 8.
 */
public class PersonStream {

	public static void main(final String[] args) {
		final List<Person> persons = Arrays.asList(new Person("Brian", 22), new Person("Jeff", 20), new Person("Jimmy", 40));
	}

}