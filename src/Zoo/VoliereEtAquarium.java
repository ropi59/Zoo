package Zoo;

import java.util.ArrayList;
import java.util.List;

import Alimentation.Carnivore;
import Alimentation.Herbivore;
import Animaux.Animal;

public class VoliereEtAquarium {

	//attributs
	private List<Animal> voliereEtAquarium = new ArrayList<>();
	
	//constructors
	public VoliereEtAquarium() {
		super();
	}
	
	public VoliereEtAquarium(List<Animal> voliereEtAquarium) {
		super();
		this.voliereEtAquarium = voliereEtAquarium;
	}
	
	//getters setters
	public List<Animal> getVoliereEtAquarium() {
		return voliereEtAquarium;
	}

	public void setVoliereEtAquarium(List<Animal> voliereEtAquarium) {
		this.voliereEtAquarium = voliereEtAquarium;
	}
	
	//methods
	public void add(Animal animal) {
		voliereEtAquarium.add(animal);
	}
	
	public void listerAnimaux() {
		System.out.println("Liste des animaux présents dans la voliereEtAquarium :");
		for (int i = 0; i < voliereEtAquarium.size(); i++) {
			System.out.println(voliereEtAquarium.get(i));
		}
		System.out.println();
	}
	
	//nourrir les animaux en fonction de son regime alimentaire
	public void nourrir() {
		System.out.println("On nourrit les animaux de la Volière / Aquarium :");
		for (int i = 0; i < voliereEtAquarium.size(); i++) {
			if(voliereEtAquarium.get(i) instanceof Carnivore) {
				System.out.println("On nourrit " + voliereEtAquarium.get(i).getEspece() + " avec de la viande.");
			}
			else if(voliereEtAquarium.get(i) instanceof Herbivore) {
				System.out.println("On nourrit " + voliereEtAquarium.get(i).getEspece() + " avec de la verdure.");
			}else {
				System.out.println("On nourrit " + voliereEtAquarium.get(i).getEspece() + " avec de la viande et des fruits et légumes.");
			}
				
		}
	}
}
