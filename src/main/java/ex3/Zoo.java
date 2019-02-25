package ex3;

/**
 * @author DIGINAMIC
 */
public class Zoo {

	private String nom;
	//private List<Zone> zones;
	private SavaneAfricaine savaneAfricaine;
	private ZoneCarnivore zoneCarnivore;
	private FermeReptile fermeReptile;
	private Aquarium aquarium;
	
	public Zoo(String nom){
		this.nom = nom;
	}
	
	public void ajouterAnnimal(/*Animal animal*/String nomAnimal, String typeAnimal, String comportement){
		
		if (typeAnimal.equals("MAMMIFERE") && comportement.equals("CARNIVORE")){
			zoneCarnivore.ajouterAnnimal(new Animal(typeAnimal, nomAnimal, comportement));
		}
		else if (typeAnimal.equals("MAMMIFERE") && comportement.equals("HERBIVORE")){
			savaneAfricaine.ajouterAnnimal(new Animal(typeAnimal, nomAnimal, comportement));
		}
		else if (typeAnimal.equals("REPTILE")){
			fermeReptile.ajouterAnnimal(new Animal(typeAnimal, nomAnimal, comportement));
		}
		else if (typeAnimal.equals("POISSON")){
			aquarium.ajouterAnnimal(new Animal(typeAnimal, nomAnimal, comportement));
		}
	}
	
	public void afficherListeAnimaux(){
		savaneAfricaine.afficherListeAnimaux();
		zoneCarnivore.afficherListeAnimaux();
		fermeReptile.afficherListeAnimaux();
		aquarium.afficherListeAnimaux();
	}

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
