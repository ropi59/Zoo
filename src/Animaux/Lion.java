package Animaux;
import Alimentation.Carnivore;
import Deplacement.Pedestre;
import Genre.Mammifere;
import Reproduction.Vivipare;
import Squelette.Vertebres;

public class Lion extends Animal implements Vertebres, Mammifere, Pedestre, Carnivore, Vivipare{

	//constructors
	public Lion() {
		super();
	}
	
	public Lion(String nom, String prenom, String espece) {
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
		Carnivore.alimentation();
	}
	
	public void presentation() {
		System.out.println("Bonjour, je m'appelle " + super.getPrenom() + " " + super.getNom() + ", je suis " + super.getEspece());
		Mammifere.genre();
		Vivipare.reproduction();
		Pedestre.seDeplacerSurTerre();
		Vertebres.squelette();
		Carnivore.alimentation();
		System.out.println();
	}
	

}
