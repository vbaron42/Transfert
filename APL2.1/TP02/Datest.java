public class Datest {
  public static void main(String[] args) {
		int	i;
		Date d = new Date();
    System.out.println("Date par default : " + d.toString());
		while (d.getAnnee() < 2019)
			d.setAnnee(d.getAnnee() + 1);
    System.out.println("Annee : " + Integer.toString(d.getAnnee()));
		d.setJour(10);
    System.out.println("Date par default : " + d.toString());
	}
}
