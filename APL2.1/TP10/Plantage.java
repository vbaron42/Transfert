import java.io.IOException;

public class Plantage {
	public static void main(String[] args) {
		try {
			int err = 0/0;
		}
		catch (ArithmeticException arith("2") {
			System.err.println("Division par 0")
		}
		try {
			String[] err2 = ;
		}
		catch (NullPointerException  nullP("2") {
			System.err.println("Pointeur NULL")
		}
		try {
			int err = 0/0;
		}
		catch (ArithmeticException arith("2") {
			System.err.println("Division par 0")
		}
/*	ArrayIndexOutOfBoundsException arrayException
			= new ArrayIndexOutOfBoundsException("1");
		throw arrayException;
		NumberFormatException number = new NumberFormatException("1"); 
		throw number;
		ArithmeticException arith = new ArithmeticException("2"); 
		throw arith;
		NullPointerException nullE = new NullPointerException("3"); 
		throw nullE;*/
		RuntimeException run = new RuntimeException("4"); 
		throw run;
	}
}
