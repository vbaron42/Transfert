import javax.swing.*;
import java.awt.*;

public class Sirocco {
	public static void main(String[] args) {
		JFrame fenetre = new JFrame();
		fenetre.setSize(500,300);
		fenetre.setLocation(0,0);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel etiquette = new JLabel("Sirocco");
		etiquette.setHorizontalAlignment(JLabel.RIGHT);
		etiquette.setVerticalAlignment(JLabel.BOTTOM);
		fenetre.add(etiquette, BorderLayout.CENTER);
		fenetre.setVisible(true);
	}
}
