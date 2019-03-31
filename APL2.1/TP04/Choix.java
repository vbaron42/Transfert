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
		JRadioButton bouton4 = new JRadioButton("PoufSouffle");
		ButtonGroup groupe1 = new ButtonGroup();
		groupe1.add(bouton1);
		groupe1.add(bouton2);
		groupe1.add(bouton3);
		groupe1.add(bouton4);
		bouton1.setHorizontalAlignment(JButton.CENTER);
		bouton2.setHorizontalAlignment(JButton.CENTER);
		bouton3.setHorizontalAlignment(JButton.CENTER);
		bouton4.setHorizontalAlignment(JButton.CENTER);
		bouton1.setVerticalAlignment(JButton.TOP);
		bouton2.setVerticalAlignment(JButton.TOP);
		bouton3.setVerticalAlignment(JButton.TOP);
		bouton4.setVerticalAlignment(JButton.TOP);
		GridLayout gestionnaire = new GridLayout(3, 1);
		fenetre.setLayout(gestionnaire);
		fenetre.add(bouton1);
		fenetre.add(bouton2);
		fenetre.add(bouton3);
		fenetre.add(bouton4);
		fenetre.setVisible(true);
	}
}
