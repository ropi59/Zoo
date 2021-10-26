package Animaux;
import Alimentation.Carnivore;
import Deplacement.Aerien;
import Genre.Aves;
import Reproduction.Ovipare;
import Squelette.Vertebres;

public class Aigle extends Animal implements Aves, Vertebres, Aerien, Ovipare, Carnivore{

	//constructors
	public Aigle() {
		super();
	}
	
	public Aigle(String nom, String prenom, String espece) {
		super(nom, prenom, espece);
	}
	
	//method
	public void genre() {
		Aves.genre();
	}
	public void reproduction() {
		Ovipare.reproduction();
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
			Aerien.seDeplacerEnLAir();
			Vertebres.squelette();
			Carnivore.alimentation();
			System.out.println();
	}
	
	
}
