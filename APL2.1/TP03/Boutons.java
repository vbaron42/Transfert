import javax.swing.*;
import java.awt.*;

public class Boutons {
	public static void main(String[] args) {
		JFrame fenetre = new JFrame();
		fenetre.setSize(500,300);
		fenetre.setLocation(0,0);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton bouton1 = new JButton("bouton1 :\n\n\n Ceciestuntextetrestreslongpourpouvoirtesterl'exemple");
		JButton bouton2 = new JButton("bouton2 : Ceciestuntextetrestreslongpourpouvoirtesterl'exemple");
		JButton bouton3 = new JButton("bouton3 :");
		JButton bouton4 = new JButton("bouton4 :");
		JButton bouton5 = new JButton("bouton5 :");
		bouton1.setHorizontalAlignment(JButton.CENTER);
		bouton1.setVerticalAlignment(JButton.CENTER);
		fenetre.add(bouton1, BorderLayout.NORTH);
		fenetre.add(bouton2, BorderLayout.WEST);
		fenetre.add(bouton3, BorderLayout.CENTER);
		fenetre.add(bouton4, BorderLayout.EAST);
		fenetre.add(bouton5, BorderLayout.SOUTH);
		fenetre.setVisible(true);
	}
}
