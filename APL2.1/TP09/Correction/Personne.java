public class Personne {
	protected String nom;
	private String prenom;
	private String adresse;
	public String getAdresse() {
		return adresse;
	}
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Personne(String nom, String prenom, String adresse) {
		// TODO Auto-generated constructor stub
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}
	public String toString() {
		return this.prenom +" "+ this.nom + " habite à l'adresse "+ this.adresse;
	}
}





public class Eleve extends Personne {

	private String classe;



	public Eleve(String nom, String prenom, String adresse, String classe) {

		super(nom, prenom, adresse);

		this.classe = classe;

	}



	public String getClasse() {

		return classe;

	}



	public void setClasse(String classe) {

		this.classe = classe;

	}



	public String toString(){

		return super.toString()+ " et fait partie de la classe "+this.classe;



	}





}





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







public class TP09 {



	/**

	 * @param args

*/

	public static void main(String[] args) {

		Personne p1 = new Personne("Keynes" , "John" , "11 rue Branly 77000 Melun");

		System.out.println(p1.toString());



		Eleve e1 = new Eleve("Dupont", "Jules", "11 rue Branly 77000 Melun" ,"IG12" );

		System.out.println(e1);



		Enseignant prof1 = new Enseignant("Jack","Steph","St-Denis",11, 110.54);

		Enseignant prof2 = new Enseignant("Grand","Pat","Aulnay",42, 52);

		System.out.println(prof1.toString());

		System.out.println(prof2.toString());

		System.out.println("salaire du prof1="+prof1.calculSalaire());

		System.out.println("salaire du prof2="+prof2.calculSalaire());





	}



}
