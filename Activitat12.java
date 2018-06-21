package Program1;

import java.util.Scanner;

public class Activitat12 {
	public static void main (String [] args){
		double X;
		double Resultat;

		Scanner lector = new Scanner(System.in);
		System.out.println("A partir d’un valor X , calcular el valor d’ aquest polinomi X3+ 3X2+ 7X +7");
		
		System.out.println("Donali un valor a la X: ");
		X = lector.nextDouble();
		
		Resultat = X*X*X+ 3*X*X+ 7*X + 7;
		
		System.out.println("Resultat: "+Resultat);
		
		
		
	}
}
