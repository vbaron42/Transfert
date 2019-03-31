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
