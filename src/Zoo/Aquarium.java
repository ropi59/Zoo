package Zoo;

import java.util.ArrayList;
import java.util.List;

import Alimentation.Carnivore;
import Alimentation.Herbivore;
import Animaux.Animal;

public class Aquarium {
	
	//attributs
	private List<Animal> aquarium = new ArrayList<>();
	
	//constructors
	public Aquarium() {
		super();
	}
	
	public Aquarium(List<Animal> aquarium) {
		super();
		this.aquarium = aquarium;
	}
	
	//getters setters
	public List<Animal> getAquarium() {
		return aquarium;
	}

	public void setAquarium(List<Animal> aquarium) {
		this.aquarium = aquarium;
	}
	
	//methods
	public void add(Animal animal) {
		aquarium.add(animal);
	}

	public void listerAnimaux() {
		System.out.println("Liste des animaux présents dans l'aquarium :");
		for (int i = 0; i < aquarium.size(); i++) {
			System.out.println(aquarium.get(i));
		}
		System.out.println();
	}
	
	//nourrir les animaux en fonction de son regime alimentaire
	public void nourrir() {
		System.out.println("On nourrit les animaux de l'Aquarium :");
		for (int i = 0; i < aquarium.size(); i++) {
			if(aquarium.get(i) instanceof Carnivore) {
				System.out.println("On nourrit " + aquarium.get(i).getEspece() + " avec de la viande.");
			}
			else if(aquarium.get(i) instanceof Herbivore) {
				System.out.println("On nourrit " + aquarium.get(i).getEspece() + " avec de la verdure.");
			}else {
				System.out.println("On nourrit " + aquarium.get(i).getEspece() + " avec de la viande et des fruits et légumes.");
			}
				
		}
	}
		
}
