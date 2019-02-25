package ex3;

public class ZooApplication {

	public static void main(String[] args) {
		
		Zoo zoo = new Zoo("Thoiry");
		
		zoo.ajouterAnnimal("Gazelle", "MAMMIFERE", "HERBIVORE");
		zoo.ajouterAnnimal("Zèbre", "MAMIFERE", "HERBIVORE");
		zoo.ajouterAnnimal("Lion", "MAMMIFERE", "HERBIVORE");
		zoo.ajouterAnnimal("Panthère", "MAMMIFERE", "CARNIVORE");
		zoo.ajouterAnnimal("Requin blanc", "POISSON", "HERBIVORE");
		zoo.ajouterAnnimal("Truite dorée", "POISSON", "HERBIVORE");
		zoo.ajouterAnnimal("Boa constrictor", "SERPENT", "CARNIVORE");
		zoo.ajouterAnnimal("Python", "SERPENT", "CARNIVORE");
	}

}
