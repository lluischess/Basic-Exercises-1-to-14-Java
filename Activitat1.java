package Program1;

import java.util.Scanner;

public class Activitat1 {
	private static final double pi = 3.14;
	public static void main (String [] args){
		
		Scanner lector = new Scanner(System.in);
		int Radi;
		double area;
		
		System.out.println("Calcular l’àrea d’ un cercle");
		System.out.println("Introdueix el radi");
		
		Radi = lector.nextInt();
		area= pi * Radi*Radi;
		
		
		System.out.println("La area d'aquest cercle es:"+area);
		
		lector.close();
		
		
		
}

}
