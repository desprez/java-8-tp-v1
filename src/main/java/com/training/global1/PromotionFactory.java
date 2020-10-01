package com.training.global1;

import java.util.Arrays;
import java.util.List;

public class PromotionFactory {

	static List<Etudiant> getEtudiants() {
		return Arrays.asList(new Etudiant("Stallmann", "Richard", 17, 16, "1A"),
				new Etudiant("Abelson", "Harold", 17, 18, "2A"), new Etudiant("Turing", "Alan", 18, 20, "1A"),
				new Etudiant("Lovelace", "Ada", 19, 21, "1A"), new Etudiant("Wirth", "Niklaus", 17, 18, "2A"),
				new Etudiant("Sussman", "Gerald Jay", 17, 19, "1A"), new Etudiant("RinceWind", "", 5, 19, "10A"));
	}

}
