
public class EightToHexa {
	public static void main(String[] args){
		if (args.length != 1)
		{
    	System.out.println("Usage : java EightToHexa <text>");
		}
		else
		{
			int number;
			number = Integer.parseInt(args[0], 8);
    	System.out.println(Integer.toHexString(number));
		}
	}
}
