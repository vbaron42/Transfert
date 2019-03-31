import java.io.*;
import java.awt.Image;

public class GetImage {
	public GetImage(String file) {
		try {
/*			FileInputStream flux = new FileInputStream("image.bin");
*			InputStreamReader lecture = new InputStreamReader(flux);
*/			BufferedImage buff = new BufferedImage(768, 1024, 5);

			DataInputStream flux = new DataInputStream(
					new BufferedInputStream(
						new FileInputStream(file)));
			int x, y;
			long pixelcolor = 0;
			for (x = 0; x < 768; x++){
				for (y = 0; y < 1024; y++){
					pixelcolor = flux.readLong();
/*				pixelcolor = (pixelcolor << 8) + flux.readLong();
					pixelcolor = (pixelcolor << 8) + flux.readLong();*/
					buff.setRGB(x, y, pixelcolor);
				}
			}
			flux.close();
		}
		catch (IOException e){
			System.out.println("Probleme de lecture du fichier " + file);
		}
	}
}
