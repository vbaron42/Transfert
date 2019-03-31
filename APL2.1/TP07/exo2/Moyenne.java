public class Moyenne {
  // attribut
  private int somme;
  private int nbValeur;

	// Constructeur
	public class Moyenne {
		this.somme = 0;
		this.nbValeur = 0;
	}
/*	Moyenne = moyenne + (valeur - moyenne / nb de valeur)
 *	nouvelle Moyenne = somme precedente + valeur / nb de valeur precedent + 1*/

  // méthode
  public int getAverage() {
		if (this.nbValeur == 0)
			return(0);
		else
			return(this.somme / this.nbValeur);
	}
  public void addValue(int add) {
		this.somme += add;
		this.nbValeur++;
	}
}
