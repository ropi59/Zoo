package Zoo;

import java.util.ArrayList;
import java.util.List;

import Alimentation.Carnivore;
import Alimentation.Herbivore;
import Animaux.Animal;

public class Voliere {

	//attributs
	private List<Animal> voliere = new ArrayList<>();
	
	//constructors
	public Voliere() {
		super();
	}
	
	public Voliere(List<Animal> voliere) {
		super();
		this.voliere = voliere;
	}
	
	//getters setters
	public List<Animal> getVoliere() {
		return voliere;
	}

	public void setVoliere(List<Animal> voliere) {
		this.voliere = voliere;
	}

	//methods
	public void add(Animal animal) {
		voliere.add(animal);
	}
	
	public void listerAnimaux() {
		System.out.println("Liste des animaux présents dans la volière :");
		for (int i = 0; i < voliere.size(); i++) {
			System.out.println(voliere.get(i));
		}
		System.out.println();
	}
	
	//nourrir les animaux en fonction de son regime alimentaire
	public void nourrir() {
		System.out.println("On nourrit les animaux de la Volière :");
		for (int i = 0; i < voliere.size(); i++) {
			if(voliere.get(i) instanceof Carnivore) {
				System.out.println("On nourrit " + voliere.get(i).getEspece() + " avec de la viande.");
			}
			else if(voliere.get(i) instanceof Herbivore) {
				System.out.println("On nourrit " + voliere.get(i).getEspece() + " avec de la verdure.");
			}else {
				System.out.println("On nourrit " + voliere.get(i).getEspece() + " avec de la viande et des fruits et légumes.");
			}
				
		}
	}
}
