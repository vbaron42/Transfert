public class Enseignant extends Personne {
	private int echelon;
	private double nbHeures;
	public static double[] tauxSalaire = new double[ ]{40,42,43,44,46,50,52,54,56,60,65};
	public Enseignant(String nom, String prenom, String adresse, int echelon, double nbHeures) {
		super(nom, prenom, adresse);
		this.echelon = echelon;
		this.nbHeures = nbHeures;
	}
	public static double[] getTauxSalaire() {
		return tauxSalaire;
	}
	public int getEchelon() {
		return echelon;
	}
	public double getNbHeures() {
		return nbHeures;
	}
	public static void setTauxSalaire(double[] tauxSalaire) {
		Enseignant.tauxSalaire = tauxSalaire;
	}
	public void setEchelon(int echelon) {
		this.echelon = echelon;
	}
	public void setNbHeures(double nbHeures) {
		this.nbHeures = nbHeures;
	}
	public String toString(){
		return super.toString()+"\nEchelon:"+this.echelon+" Heures effectuees:"+this.nbHeures;
	}
	public boolean echelonValide(){
		if (this.echelon<1 || this.echelon>11)
			return false;
		else return true;
	}
	public double getPrixHeure(){
		if (this.echelonValide())
			return Enseignant.tauxSalaire[this.echelon - 1];
		else return 0;
	}
	public double calculSalaire(){
		if (this.echelonValide()){
			return this.getPrixHeure()*this.nbHeures;
		}
		else return 0;
	}
}
