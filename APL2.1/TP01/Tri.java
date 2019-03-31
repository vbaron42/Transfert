import java.util.Arrays;
public class Tri {
  public static void main(String[] args) {
		int	i;
		int	tab[];

		tab = new int [args.length];
		if (args.length == 0)
    	System.out.println("Usage : java Tri <nb1> <nb2>");
		else
		{
			for (i = 0; i < args.length; i++)
				tab[i] = Integer.parseInt(args[i]);
			Arrays.sort(tab);
			for (i = 0; i < args.length; i++)
    		System.out.println(tab[i]);
		}
  }
}
