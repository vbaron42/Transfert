import javax.swing.*;
import java.awt.*;

public class Choix {
	public static void main(String[] args) {
		JFrame fenetre = new JFrame();
		fenetre.setSize(200,200);
		fenetre.setLocation(0,0);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JRadioButton bouton1 = new JRadioButton("Griffondor");
		JRadioButton bouton2 = new JRadioButton("Serdaigle");
		JRadioButton bouton3 = new JRadioButton("Serpentard");
		ButtonGroup groupe1 = new ButtonGroup();
		groupe1.add(bouton1);
		groupe1.add(bouton2);
		groupe1.add(bouton3);
		bouton1.setHorizontalAlignment(JButton.CENTER);
		bouton1.setVerticalAlignment(JButton.CENTER);
		fenetre.add(bouton1, BorderLayout.NORTH);
		fenetre.add(bouton2, BorderLayout.CENTER);
		fenetre.add(bouton3, BorderLayout.SOUTH);
		fenetre.setVisible(true);
	}
}
