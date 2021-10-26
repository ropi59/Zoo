package Animaux;

import Alimentation.Carnivore;
import Deplacement.Aerien;
import Deplacement.Marin;
import Genre.Aves;
import Reproduction.Ovipare;
import Squelette.Vertebres;

public class MartinPecheur extends Animal implements Aves, Vertebres, Aerien, Marin, Ovipare, Carnivore{

	//constructors
	public MartinPecheur() {
		super();
	}
	
	public MartinPecheur(String nom, String prenom, String espece) {
		super(nom, prenom, espece);
	}
	
	//method
	public void genre() {
		Aves.genre();
	}
	public void reproduction() {
		Ovipare.reproduction();
	}

	public void seDeplacerSousLEau() {
		Marin.seDeplacerSousLEau();
	}
	
	public void seDeplacerEnLAir() {
		Aerien.seDeplacerEnLAir();
	}
	
	public void squelette() {
		Vertebres.squelette();
	}
	
	public void alimentation() {
		Carnivore.alimentation();
	}
	
	public void presentation() {
		System.out.println("Bonjour, je m'appelle " + super.getPrenom() + " " + super.getNom() + ", je suis " + super.getEspece());
		Aves.genre();
		Ovipare.reproduction();
		Marin.seDeplacerSousLEau();
		Aerien.seDeplacerEnLAir();
		Vertebres.squelette();
		Carnivore.alimentation();
		System.out.println();
	}
}
