package ex3;

import java.util.List;

public abstract class Zone {

	private List<Animal> listeAnimaux;
	
	public void ajouterAnnimal(Animal animal) {
		listeAnimaux.add(animal);
	}
	
	public void afficherListeAnimaux(){
		for (Animal animal: listeAnimaux){
			System.out.println(animal.getNoms());
		}
	}
	
	public int compterAnimaux(){
		return listeAnimaux.size();
	}
	
	public abstract double getPoids();
	
	public double calculerKgsNourritureParJour(){
		return listeAnimaux.size() * getPoids();
	}
}
