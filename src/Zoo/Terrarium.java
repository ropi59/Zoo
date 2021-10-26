package Zoo;

import java.util.ArrayList;
import java.util.List;

import Alimentation.Carnivore;
import Alimentation.Herbivore;
import Animaux.Animal;

public class Terrarium {

	//attributs
	private List<Animal> terrarium = new ArrayList<>();
	
	//constructor
	public Terrarium() {
		super();
	}
	
	public Terrarium(List<Animal> terrarium) {
		super();
		this.terrarium = terrarium;
	}
	
	//getters setters
	public List<Animal> getTerrarium() {
		return terrarium;
	}

	public void setTerrarium(List<Animal> terrarium) {
		this.terrarium = terrarium;
	}
	
	//methods
	public void add(Animal animal) {
		terrarium.add(animal);
	}
	
	public void listerAnimaux() {
		System.out.println("Liste des animaux présents dans le terrarium :");
		for (int i = 0; i < terrarium.size(); i++) {
			System.out.println(terrarium.get(i));
		}
		System.out.println();
	}
	
	//nourrir les animaux en fonction de son regime alimentaire
	public void nourrir() {
		System.out.println("On nourrit les animaux du Terrarium :");
		for (int i = 0; i < terrarium.size(); i++) {
			if(terrarium.get(i) instanceof Carnivore) {
				System.out.println("On nourrit " + terrarium.get(i).getEspece() + " avec de la viande.");
			}
			else if(terrarium.get(i) instanceof Herbivore) {
				System.out.println("On nourrit " + terrarium.get(i).getEspece() + " avec de la verdure.");
			}else {
				System.out.println("On nourrit " + terrarium.get(i).getEspece() + " avec de la viande et des fruits et légumes.");
			}
				
		}
	}
}
