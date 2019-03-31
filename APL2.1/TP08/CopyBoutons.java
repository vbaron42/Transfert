import javax.swing.*;
import java.awt.*;

public class CopyBoutons {
	public static void main(String[] args) {
		String couleurs[] = {"Cyan", "Magenta", "Jaune"};
		JFrame fenetre = new JFrame();
		fenetre.setSize(500,300);
		fenetre.setLocation(0,0);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/*Panneau*/
		JPanel panneau = new JPanel();
		panneau.setBackground(Color.CYAN);
		for (int i = 0; i < 3; i++)
		{
/*			JLabel ligne[i] = new JLabel(args[i])*/
/*			panneau.add(new JLabel(args[i]), BorderLayout.NORTH);*/
			panneau.add(new JButton(couleurs[i]), BorderLayout.CENTER);
/*			label[i].setVerticalAlignement(JLabel.NORTH);*/
		}
		fenetre.add(panneau);

		/*Button*/
/*		FlowLayout gestionnaire = new FlowLayout(FlowLayout.CENTER);
		fenetre.setLayout(gestionnaire);
		for (int i = 0; i < 3; i++)
		{
			fenetre.add(new JButton(couleurs[i]), BorderLayout.CENTER);
		}*/
		fenetre.setVisible(true);
	}
}
