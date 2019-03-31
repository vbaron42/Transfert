import javax.swing.*;
import java.awt.*;

public class YellAtMe {
	public static void main(String[] args) {
		int	i;
		String word = "";

		if (args.length == 0)
    	System.out.println("Usage : java YellAtMe <text>");
		else
		{
			for (i = 0; i < args.length; i++)
			{
    		System.out.print(args[i].toUpperCase() + " ");
			}
		}
    System.out.print("\n");
	}
}
