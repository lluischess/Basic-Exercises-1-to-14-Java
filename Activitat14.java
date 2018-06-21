package Program1;

import java.util.Scanner;

public class Activitat14 {
	public static void main (String [] args){
		int euros;
		int Bitll = 5;
		int Bitll1 = 10;
		int Bitll2 = 20;
		int Bitll3 = 50;
		int Bitll4 = 100;
		int resul;
		int restant;
		Scanner lector = new Scanner(System.in);
		System.out.println("Demanar un número enter que signifiqui una quantitat d’euros i digui la descomposició en bitllets de 5,10,20,50 i 100.");
		
		System.out.println("Introdueix la cantitat en euros: ");
		euros = lector.nextInt();
		
		resul = euros/ Bitll4;
		restant = euros % 100;
		System.out.println("Bitllets de 100: "+resul+" sobrant "+restant);
		resul = restant/ Bitll3;
		restant = restant % 50;
		System.out.println("Bitllets de 50: "+resul+" sobrant "+restant);
		resul = restant/ Bitll2;
		restant = restant % 20;
		System.out.println("Bitllets de 20: "+resul+" sobrant "+restant);
		resul = restant/ Bitll1;
		restant = restant % 10;
		System.out.println("Bitllets de 10: "+resul+" sobrant "+restant);
		resul = restant/ Bitll;
		restant = restant % 5;
		System.out.println("Bitllets de 5: "+resul+" sobrant "+restant);
		
		lector.close();
	}
}
