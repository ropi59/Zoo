package Animaux;

import Alimentation.Omnivore;
import Deplacement.Pedestre;
import Genre.Mammifere;
import Reproduction.Vivipare;
import Squelette.Vertebres;

public class Singe extends Animal implements Mammifere, Vivipare, Pedestre, Vertebres, Omnivore{

	//constructors
	public Singe() {
		super();
	}
	
	public Singe(String nom, String prenom, String espece) {
		super(nom, prenom, espece);
	}
	
	//method
	public void genre() {
		Mammifere.genre();
	}
	public void reproduction() {
		Vivipare.reproduction();
	}

	public void seDeplacerSurTerre() {
		Pedestre.seDeplacerSurTerre();	
	}
	
	public void squelette() {
		Vertebres.squelette();
	}
	
	public void alimentation() {
		Omnivore.alimentation();
	}
	
	public void presentation() {
		System.out.println("Bonjour, je m'appelle " + super.getPrenom() + " " + super.getNom() + ", je suis " + super.getEspece());
		Mammifere.genre();
		Vivipare.reproduction();
		Pedestre.seDeplacerSurTerre();
		Vertebres.squelette();
		Omnivore.alimentation();
		System.out.println();
	}
}
