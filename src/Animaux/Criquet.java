package Animaux;

import Alimentation.Herbivore;
import Deplacement.Pedestre;
import Genre.Insecte;
import Reproduction.Ovipare;
import Squelette.Invertebres;

public class Criquet extends Animal implements Invertebres, Pedestre, Insecte, Ovipare, Herbivore  {

	
	//constructors
	public Criquet() {
		super();
	}
	
	public Criquet(String nom, String prenom, String espece) {
		super(nom, prenom, espece);
	}
	
	//method
	public void genre() {
		Insecte.genre();
	}
	public void reproduction() {
		Ovipare.reproduction();
	}

	public void seDeplacerSurTerre() {
		Pedestre.seDeplacerSurTerre();	
	}
	
	public void squelette() {
		Invertebres.squelette();
	}
	
	public void alimentation() {
		Herbivore.alimentation();
	}
	
	public void presentation() {
		System.out.println("Bonjour, je m'appelle " + super.getPrenom() + " " + super.getNom() + ", je suis " + super.getEspece());
		Insecte.genre();
		Ovipare.reproduction();
		Pedestre.seDeplacerSurTerre();
		Invertebres.squelette();
		Herbivore.alimentation();
		System.out.println();
	}
}
