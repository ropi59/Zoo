
package Animaux;
import Alimentation.Herbivore;
import Deplacement.Marin;
import Deplacement.Pedestre;
import Genre.Reptile;
import Reproduction.Ovipare;
import Squelette.Vertebres;


public class Tortue extends Animal implements Marin, Pedestre, Ovipare, Reptile, Vertebres, Herbivore{

	//constructors
	public Tortue() {
		super();
	}
	
	public Tortue(String nom, String prenom, String espece) {
		super(nom, prenom, espece);
	}
	
	//method
	public void genre() {
		Reptile.genre();
	}
	public void reproduction() {
		Ovipare.reproduction();
	}

	public void seDeplacerSousLEau() {
		Marin.seDeplacerSousLEau();		
	}
	
	public void seDeplacerSurTerre() {
		Pedestre.seDeplacerSurTerre();		
	}
	
	public void squelette() {
		Vertebres.squelette();
	}
	
	public void alimentation() {
		Herbivore.alimentation();
	}
	
	public void presentation() {
		System.out.println("Bonjour, je m'appelle " + super.getPrenom() + " " + super.getNom() + ", je suis " + super.getEspece());
		Reptile.genre();
		Ovipare.reproduction();
		Marin.seDeplacerSousLEau();
		Pedestre.seDeplacerSurTerre();
		Vertebres.squelette();
		Herbivore.alimentation();
		System.out.println();
	}
}
