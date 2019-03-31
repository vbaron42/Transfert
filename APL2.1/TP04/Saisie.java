import javax.swing.*;
import java.awt.*;

public class Saisie {
	public static void main(String[] args) {
		JFrame fenetre = new JFrame();
		fenetre.setSize(500,300);
		fenetre.setLocation(0,0);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTextField field1 = new JTextField("\n Ceci est le champs inferieur\n");
		JTextArea area1 = new JTextArea("\n Ceci est la zone de texte\n");
		field1.setForeground(Color.CYAN);
		field1.setBackground(Color.GREEN);
		area1.setForeground(Color.MAGENTA);
		area1.setBackground(Color.RED);
		fenetre.add(field1, BorderLayout.SOUTH);
		fenetre.add(area1, BorderLayout.CENTER);
		fenetre.setVisible(true);
	}
}
