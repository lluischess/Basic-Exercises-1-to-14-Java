package Program1;

import java.util.Scanner;

public class Activitat13 {
	public static void main (String [] args){
		int euros;
		int Bitll = 5;
		int Bitll1 = 10;
		int Bitll2 = 20;
		int Bitll3 = 50;
		int Bitll4 = 100;
		int resul;

		Scanner lector = new Scanner(System.in);
		System.out.println("Demanar  un  número  enter  que  signifiqui  una  quantitat  d’euros  i  digui quants bitllets de 5, 10, 20,50 i 100 son equivalents");
		
		System.out.println("Introdueix la cantitat en euros: ");
		euros = lector.nextInt();
		
		resul = euros/ Bitll;
		System.out.println("Bitllets de 5: "+resul);
		resul = euros/ Bitll1;
		System.out.println("Bitllets de 10: "+resul);
		resul = euros/ Bitll2;
		System.out.println("Bitllets de 20: "+resul);
		resul = euros/ Bitll3;
		System.out.println("Bitllets de 50: "+resul);
		resul = euros/ Bitll4;
		System.out.println("Bitllets de 100: "+resul);
		lector.close();
	}
}
