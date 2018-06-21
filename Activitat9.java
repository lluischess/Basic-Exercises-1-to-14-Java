package Program1;

import java.util.Scanner;

public class Activitat9 {
	private static final double pi = 3.14;
	public static void main (String [] args){
		double area;
		double radi;
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Realitzar un algorisme perque calculi l’àrea d’una rodona.");
		
		System.out.println("Posa el radi de la rodona");
		
		radi = lector.nextDouble();
		
		area= radi *radi * pi;
		
		System.out.println("Area: "+String.format("%1$.3f",area));
		//String.format(format, args) = treure decimals
		
	}
}
