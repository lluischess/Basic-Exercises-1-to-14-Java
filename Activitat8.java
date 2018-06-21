package Program1;

import java.util.Scanner;

public class Activitat8 {
	public static void main (String [] args){
		//Variables
		double area;
		double base;
		double altura;
		
		//Declarem el scanner per rebrà informació de l’usuari
		Scanner lector = new Scanner(System.in);
		System.out.println("Realitzar un algorisme perque calculi l’àrea d’un triangle.");
		
		System.out.println("Introdueix la altura");
		altura=lector.nextDouble();
		System.out.println("Introdueix la base");
		base=lector.nextDouble();
		
		//Fem la operació
		area = base * altura/2;
		
		//Resultat per pantalla
		System.out.println("Area: "+area);
		lector.close();
	}
}
