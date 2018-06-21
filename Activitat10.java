package Program1;

import java.util.Scanner;

public class Activitat10 {
	public static void main (String [] args){
		double pesetas;
		double calcul = 166.386;
		double euros;

		Scanner lector = new Scanner(System.in);
		System.out.println("Realitzar un algorisme que converteixi euros a pessetes.");
		
		System.out.println("Introdueix el valor en euros");
		euros = lector.nextDouble();
		
		pesetas = euros*calcul;
		
		System.out.println("Pesetas: "+pesetas);
		lector.close();
	}
}
