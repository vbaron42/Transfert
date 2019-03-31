import javax.swing.*;
import java.awt.*;

public class Boutons {
	public static void main(String[] args) {
		String couleurs[] = {"CYAN", "BLACK", "YELLOW"};
		JFrame fenetre = new JFrame();
		fenetre.setSize(500,300);
		fenetre.setLocation(0,0);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/*Panneau*/
		JPanel panneau = new JPanel();
		panneau.setBackground(Color.CYAN);
		for (int i = 0; i < 3; i++)
		{
			panneau.add(new JButton(couleurs[i]), BorderLayout.CENTER);
		}
		fenetre.add(panneau);
		fenetre.setVisible(true);

		Cyan.addActionListener(Observateur);
		Observateur.getActionCommand();
		panneau.repaint();
		public interface ActionListener {
			void actionPerformed(JButton evenement);
				Observateur.getActionCommand();
		}
		for (int i = 0; i < 3; i++)
		{
			panneau.setBackground("Color." + couleurs[i]);
		}
	}
}
