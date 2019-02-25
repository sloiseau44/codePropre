package ex2;

public class LivretA extends CompteBancaire {
	private double tauxRemuneration;
	private double solde;
	private final static double DECOUVERT = 0;

	public LivretA(double solde, double tauxRemuneration) {
		super(solde, DECOUVERT);
		this.tauxRemuneration = tauxRemuneration;
	}

	public void debiterMontant(double montant){
		if (this.solde - montant > DECOUVERT){
			this.solde = solde - montant;
		}	
	}

	public void appliquerRemuAnnuelle(){
		this.solde = solde + solde*tauxRemuneration/100;		
	}
	
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}
	
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
}
