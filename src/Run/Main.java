package Run;
import java.util.ArrayList;
import java.util.List;

import Animaux.Aigle;
import Animaux.Animal;
import Animaux.Criquet;
import Animaux.Dauphin;
import Animaux.Lion;
import Animaux.MartinPecheur;
import Animaux.PoissonLune;
import Animaux.Singe;
import Animaux.Tortue;
import Deplacement.Aerien;
import Deplacement.Marin;
import Deplacement.Pedestre;
import Zoo.Aquarium;
import Zoo.AquariumEtTerrarium;
import Zoo.Terrarium;
import Zoo.Voliere;
import Zoo.VoliereEtAquarium;

public class Main {

	public static void main(String[] args) {
		
		//creation des enclos
		Aquarium aquarium = new Aquarium();
		AquariumEtTerrarium aquariumEtTerrarium = new AquariumEtTerrarium();
		Terrarium terrarium = new Terrarium();
		Voliere voliere = new Voliere();
		VoliereEtAquarium voliereEtAquarium = new VoliereEtAquarium();
		
		//creation de l'inventaire du zoo listAnimals
		List<Animal> listAnimals = new ArrayList<>();
		
		//creation des animaux et ajout a l'inventaire
		Lion lion1 = new Lion("Lelion", "Simba", "Lion");
		//lion1.presentation();
		listAnimals.add(lion1);

		Aigle eagle1 = new Aigle("Grand", "Aigle", "Aigle");
		//eagle1.presentation();
		listAnimals.add(eagle1);
		
		Tortue turtle1 = new Tortue("Latortue", "Sammy", "Tortue");
		//turtle1.presentation();
		listAnimals.add(turtle1);
		
		Singe monkey1 = new Singe("Kong", "King", "Singe");
		//monkey1.presentation();
		listAnimals.add(monkey1);

		Dauphin dolphin1 = new Dauphin("LeDauphin", "Flipper", "Dauphin");
		//dolphin1.presentation();
		listAnimals.add(dolphin1);
		
		MartinPecheur kingFisher1 = new MartinPecheur("LePecheur", "Martin", "Martin Pêcheur");
		//kingFisher1.presentation();
		listAnimals.add(kingFisher1);

		Criquet criquet1 = new Criquet("Criquet", "Gemini", "Criquet");
		//criquet1.presentation();
		listAnimals.add(criquet1);

		PoissonLune moonFish1 = new PoissonLune("LaLune", "Pierrot", "Poisson Lune");
		//moonFish1.presentation();
		listAnimals.add(moonFish1);
		
		//affichage de la l'inventaire de tous les animaux du zoo
		System.out.println("Liste de tous les animaux du zoo :");
		System.out.println(listAnimals);
		System.out.println();
		
		//----------------------------------------------------------------------------------------------------

		//repartition des animaux dans les bons enclos depuis l'inventaire du zoo
		for (int i = 0; i < listAnimals.size(); i++) {
			if((listAnimals.get(i) instanceof Marin) && (listAnimals.get(i) instanceof Pedestre)){
				aquariumEtTerrarium.add(listAnimals.get(i));
			}
			else if((listAnimals.get(i) instanceof Marin) && (listAnimals.get(i) instanceof Aerien)){
				voliereEtAquarium.add(listAnimals.get(i));
			}
			else if(listAnimals.get(i) instanceof Marin) {
				aquarium.add(listAnimals.get(i));
			}
			else if(listAnimals.get(i) instanceof Pedestre) {
				terrarium.add(listAnimals.get(i));
			}
			else {
				voliere.add(listAnimals.get(i));
			}
		}

		//affichage des differents enclos
		aquariumEtTerrarium.listerAnimaux();
		voliereEtAquarium.listerAnimaux();
		aquarium.listerAnimaux();
		terrarium.listerAnimaux();
		voliere.listerAnimaux();
		
		//----------------------------------------------------------------------------------------------------

		
		//nourrir les animaux
		aquariumEtTerrarium.nourrir();
		System.out.println();
		voliereEtAquarium.nourrir();
		System.out.println();
		aquarium.nourrir();
		System.out.println();
		terrarium.nourrir();
		System.out.println();
		voliere.nourrir();
		System.out.println();
		
		//----------------------------------------------------------------------------------------------------

		//deplacer animal de Aquarium et terrarium vers terrarium si possible
		for (int i = 0; i < aquariumEtTerrarium.getAquariumEtTerrarium().size(); i++) {
			if(aquariumEtTerrarium.getAquariumEtTerrarium().get(i) instanceof Pedestre) {
				terrarium.add(aquariumEtTerrarium.getAquariumEtTerrarium().get(i));
				aquariumEtTerrarium.getAquariumEtTerrarium().remove(aquariumEtTerrarium.getAquariumEtTerrarium().get(i));
			}
			
		}
		
		aquariumEtTerrarium.listerAnimaux();
		terrarium.listerAnimaux();
		
	}

}
