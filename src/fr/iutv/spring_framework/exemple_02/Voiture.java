package fr.iutv.spring_framework.exemple_02;

public class Voiture {

	String marque;

	String modele;

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public int getPlaque() {
		return plaque;
	}

	public void setPlaque(int plaque) {
		this.plaque = plaque;
	}

	public Conducteur getConducteur() {
		return conducteur;
	}

	public void setConducteur(Conducteur conducteur) {
		this.conducteur = conducteur;
	}

	public String info() {
		return "Marque:" + this.marque + ", Modele: " + this.modele + ", Conducteur:[ " + this.conducteur.info() + "]";
	}

	int plaque;

	Conducteur conducteur;
}
