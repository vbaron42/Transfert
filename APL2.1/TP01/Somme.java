/**
* Cette classe est une simple coquille pour recevoir la méthode principale
*
* @version 1.1 09 March 2014
* @author Luc Hernandez
*/
public class Somme {
 
  /**
  * Affiche &laquo;Bonjour !&raquo;
  *
  * @param args la liste des arguments de la ligne de commande (inutilisée ici)
  */
  public static void main(String[] args) {
		int	i;
		int	res;

		if (args.length == 0)
    	System.out.println("Usage : java Somme <nb1> <nb2> ...");
		else
		{
			res = 0;
			for (i = 0; i < args.length; i++)
				res += Integer.parseInt(args[i]);
    	System.out.println(res);
		}
  }
}
