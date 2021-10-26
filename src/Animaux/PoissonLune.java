package Animaux;

import Alimentation.Carnivore;
import Deplacement.Marin;
import Genre.Pisces;
import Reproduction.Ovipare;
import Squelette.Vertebres;

public class PoissonLune extends Animal implements Vertebres, Marin, Pisces, Ovipare, Carnivore{

	//constructors
	public PoissonLune() {
		super();
	}
	
	public PoissonLune(String nom, String prenom, String espece) {
		super(nom, prenom, espece);
	}
	
	//method
	public void genre() {
		Pisces.genre();
	}
	public void reproduction() {
		Ovipare.reproduction();
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
		Pisces.genre();
		Ovipare.reproduction();
		Marin.seDeplacerSousLEau();
		Vertebres.squelette();
		Carnivore.alimentation();
		System.out.println();
	}
}
