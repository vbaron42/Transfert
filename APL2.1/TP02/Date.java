public class Date {
  // attribut
  private int jour;
  private int mois;
  private int annee;
	// Constructeur
	public Date() {
		this.jour = 1;
		this.mois = 1;
		this.annee = 2000;
	}
  // méthode
  public String toString() {
		String j;
		String m;
		String a;
		if (this.jour > 9)
			j = Integer.toString(this.jour);
		else
			j = ("0" + Integer.toString(this.jour));
		if (this.mois > 9)
			m = Integer.toString(this.mois);
		else
			m = ("0" + Integer.toString(this.mois));
		if (this.annee > 999)
			a = Integer.toString(this.annee);
		else if (this.annee > 99)
			a = ("0" + Integer.toString(this.annee));
		else if (this.annee > 9)
			a = ("00" + Integer.toString(this.annee));
		else if (this.annee >= 0)
			a = ("000" + Integer.toString(this.annee));
		else
			a = "0000";
    return (a + "-" + m + "-" + j);
  }
	public int getJour() {
		return this.jour;
	}
	public int getMois() {
		return this.mois;
	}
	public int getAnnee() {
		return this.annee;
	}
	public void setJour(int j) {
		int max;
		
		if (this.mois == 2)
			max = 28;
		else if (this.mois % 2 == 1)
			max = 31;
		else
			max = 30;
		if (j > max)
			j = max;
		if (j < 1)
			j = 1;
		this.jour = j; 
	}
	public void setMois(int m) {
		if (m > 12)
			m = 12;
		if (m < 1)
			m = 1;
		this.mois = m;
	}
	public void setAnnee(int a) {
		this.annee = a;
	}	
}
