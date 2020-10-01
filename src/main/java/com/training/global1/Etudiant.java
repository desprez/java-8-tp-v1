package com.training.global1;

public class Etudiant {
	private final String nom;
	private final String prenom;
	private final double moyenne;
	private final int age;
	private final String promo;

	public Etudiant(String nom, String prenom, double moyenne, int age, String promo) {
		this.nom = nom;
		this.prenom = prenom;
		this.moyenne = moyenne;
		this.age = age;
		this.promo = promo;
	}

	public String getPromo() {
		return promo;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public double getMoyenne() {
		return moyenne;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Etudiant [nom=");
		builder.append(nom);
		builder.append(", prenom=");
		builder.append(prenom);
		builder.append(", moyenne=");
		builder.append(moyenne);
		builder.append(", age=");
		builder.append(age);
		builder.append(", promo=");
		builder.append(promo);
		builder.append("]");
		return builder.toString();
	}

}
