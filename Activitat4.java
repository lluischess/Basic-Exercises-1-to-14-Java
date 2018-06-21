package Program1;

import java.util.Scanner;

public class Activitat4 {
	public static void main (String [] args){
		double dolars;
		double calcul = 0.89;
		double euros;



		Scanner lector = new Scanner(System.in);
		System.out.println("Introduir un import en dòlars i calcular el seu canvi en euros");
		System.out.println("Introduir dolars");
		dolars = lector.nextDouble();

		euros = dolars * calcul;
		System.out.println("Euros: "+euros+"€");
		lector.close();

	}
}
