public class Progression {
  public static void main(String[] args) {
		int	i;
		Compteur c = new Compteur();
		for (i = 0; i <= 9; i++)
		{
			if (i >= 5)
    		System.out.println(i + " = " + c.toString());
			c.plusUn();
		}
	}
}
