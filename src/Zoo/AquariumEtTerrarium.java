package Zoo;

import java.util.ArrayList;
import java.util.List;

import Alimentation.Carnivore;
import Alimentation.Herbivore;
import Animaux.Animal;

public class AquariumEtTerrarium {

	//attributs
	private List<Animal> aquariumEtTerrarium = new ArrayList<>();
	
	//constructors
	public AquariumEtTerrarium() {
		super();
	}
	
	public AquariumEtTerrarium(List<Animal> aquariumEtTerrarium) {
		super();
		this.aquariumEtTerrarium = aquariumEtTerrarium;
	}
	
	//getters setters
	public List<Animal> getAquariumEtTerrarium() {
		return aquariumEtTerrarium;
	}

	public void setAquariumEtTerrarium(List<Animal> aquariumEtTerrarium) {
		this.aquariumEtTerrarium = aquariumEtTerrarium;
	}

	//methods
	public void add(Animal animal) {
		aquariumEtTerrarium.add(animal);
	}
	
	public void listerAnimaux() {
		System.out.println("Liste des animaux présents dans l'aquariumEtTerrarium :");
		for (int i = 0; i < aquariumEtTerrarium.size(); i++) {
			System.out.println(aquariumEtTerrarium.get(i));
		}
		System.out.println();
	}
	
	//nourrir les animaux en fonction de son regime alimentaire
	public void nourrir() {
		System.out.println("On nourrit les animaux de l'Aquarium/Terrarium :");
		for (int i = 0; i < aquariumEtTerrarium.size(); i++) {
			if(aquariumEtTerrarium.get(i) instanceof Carnivore) {
				System.out.println("On nourrit " + aquariumEtTerrarium.get(i).getEspece() + " avec de la viande.");
			}
			else if(aquariumEtTerrarium.get(i) instanceof Herbivore) {
				System.out.println("On nourrit " + aquariumEtTerrarium.get(i).getEspece() + " avec de la verdure.");
			}else {
				System.out.println("On nourrit " + aquariumEtTerrarium.get(i).getEspece() + " avec de la viande et des fruits et légumes.");
			}
				
		}
	}
}
