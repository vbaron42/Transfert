import javax.swing.*;
import java.awt.*;

public class Image {
	public static void main(String[] args) {
		int x, y;
		JFrame fenetre = new JFrame();
		fenetre.setSize(768,1024);
		fenetre.setLocation(50,50);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GetImage img = new GetImage("image.bin");
			
		fenetre.setVisible(true);
/*
		Cyan.addActionListener(Observateur);
		Observateur.getActionCommand();
		panneau.repaint();
		public interface ActionListener {
			void actionPerformed(JButton evenement);
				Observateur.getActionCommand();
		}
		for (i = 0; i < 3; i++)
		{
			panneau.setBackground("Color." + couleurs[i]);
		}
		*/
	}
}
