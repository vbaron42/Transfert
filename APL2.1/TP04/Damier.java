import javax.swing.*;
import java.awt.*;

public class Damier {
	public static void main(String[] args) {
		JFrame fenetre = new JFrame();
		fenetre.setSize(200,200);
		fenetre.setLocation(0,0);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		int	i;
		int	j;
		int	heigth;
		int	length;

		if (args.length != 2)
    	System.out.println("Usage : java Damier <height> <lenght>");
		else
		{
			length = Integer.parseInt(args[0]);
			heigth = Integer.parseInt(args[1]);
			GridLayout gestionnaire = new GridLayout(length, heigth);
			fenetre.setLayout(gestionnaire);
			for (i = 0; i < length; i++)
			{
				for (j = 0; j < heigth; j++)
				{
					JPanel panneau = new JPanel();
					if ( (i + j) % 2 == 0)
						panneau.setBackground(Color.BLACK);
					fenetre.add(panneau);
				}
			}
		}
		fenetre.setVisible(true);
	}
}
