import java.util.Arrays;
public class Grille {
  public static void main(String[] args) {
		int	t;
		int	i;
		int	j;

		if (args.length != 1)
		{
    	System.out.println("Usage : java Grille <nb>");
			System.exit(0);
		}
		else
		{
			t = Integer.parseInt(args[0]);
			for (i = 0; i < t; i++)
			{
				for (j = 1; j < t; j++)
    			System.out.print("+-");
    		System.out.println("+");
				for (j = 1; (j < t) & (i < (t - 1)); j++)
    			System.out.print("| ");
				if (i < (t - 1))
    			System.out.println("|");
			}
		}
	}
}
