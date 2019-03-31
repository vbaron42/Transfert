import javax.swing.*
import java.awt.*

public class Polygone extends Jpanel{
	public Polygone(String file){
		ArrayList<Integer> tabx = new ArrayList<Integer>();
		ArrayList<Integer> taby = new ArrayList<Integer>();
		try{
			DataInputStream flux = new DataInputStream(
				new BufferedInputStream(
					new FileInputStream(file)));
			while (true) {
				try {
					tabx.add(flux.readint());
					taby.add(flux.readint());
				}
				catch (EOFException ex){
				Polygon p = new Polygon(tabx, taby, tabx.length);
				}
			}
		}
		catch (FileNotFoundException ex){
			System.err.println("The file doesn't exist");
		}
		catch (IOException ex){
			System.err.println("The file is invalid or can't be read");
			exit(0);
		}
	}
}
