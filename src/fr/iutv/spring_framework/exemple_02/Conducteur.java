package fr.iutv.spring_framework.exemple_02;

public class Conducteur {

	String nom;

	String prenom;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String info() {
		// TODO Auto-generated method stub
		return "Nom:" + this.nom + ", Prenom:" + this.prenom;
	}

}
