package ex1;

import java.util.Date;

public class Entreprise {

	public int siret;
	public String nom;
	public String adresse;
	public Date dateCreation;

	public static final int CAPITAL_MAX = 3000000;	

	public Entreprise(int siret, String nom, String adresse, Date date_Creation) {
		this.siret = siret;
		this.nom = nom;
		this.adresse = adresse;
		this.dateCreation = date_Creation;
	}

	public void Afficher_statut(){
		System.out.println("N° SIRET : "+siret+" nom de l'entreprise : "+nom+ " adresse : "+adresse+" date de création : "+dateCreation);
	}

}
