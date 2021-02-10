package com.training.stream.tp4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Exercice :
 *
 * En passant par l’API Stream et la méthode filter, lister tous les
 * fichiers « .java » dans le répertoire parent et les sous-répertoires
 */
public class StreamFilter {

	public static void main(final String[] args) throws IOException {
		final Path parent = Paths.get(".."); // répertoire parent
		final Stream<Path> list = Files.walk(parent);

		// TODO
	}
}