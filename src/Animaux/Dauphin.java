package Animaux;

import Alimentation.Carnivore;
import Deplacement.Marin;
import Genre.Mammifere;
import Reproduction.Vivipare;
import Squelette.Vertebres;

public class Dauphin extends Animal implements Mammifere, Vivipare, Marin, Vertebres, Carnivore{

	//constructors
	public Dauphin() {
		super();
	}
	
	public Dauphin(String nom, String prenom, String espece) {
		super(nom, prenom, espece);
	}
	
	//method
	public void genre() {
		Mammifere.genre();
	}
	public void reproduction() {
		Vivipare.reproduction();
	}

	public void seDeplacerSousLEau() {
		Marin.seDeplacerSousLEau();	
	}
	
	public void squelette() {
		Vertebres.squelette();
	}
	
	public void alimentation() {
		Carnivore.alimentation();
	}
	
	public void presentation() {
		System.out.println("Bonjour, je m'appelle " + super.getPrenom() + " " + super.getNom() + ", je suis " + super.getEspece());
		Mammifere.genre();
		Vivipare.reproduction();
		Marin.seDeplacerSousLEau();
		Vertebres.squelette();
		Carnivore.alimentation();
		System.out.println();
	}
}
