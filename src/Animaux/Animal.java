package Animaux;

public abstract class Animal {

	//attributs
	private String nom;
	private String prenom;
	private String espece;
	
	//constructors
	public Animal() {
		
	}
	public Animal(String nom, String prenom, String espece) {
		this.setNom(nom);
		this.setPrenom(prenom);
		this.setEspece(this.getClass().toString());
	}
	//getters setters
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEspece() {
		return espece;
	}
	public void setEspece(String espece) {
		this.espece = espece;
	}
	
	//method
	public abstract void genre();
	
	//public abstract void seDeplacer();
	
	public abstract void reproduction();
	
	public abstract void squelette();
	
	public abstract void alimentation();
	
	@Override
	public String toString() {
		return "Animal [nom=" + nom + ", prenom=" + prenom + ", espece=" + espece + "]";
	}
	
	
}
