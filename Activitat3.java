package Program1;

import java.util.Scanner;

public class Activitat3 {
	public static void main (String [] args){
		double Import;
		double descompte = 20;
		double resultat;
		double preufinal;
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduir un import i calcular què ha de pagar si li fem 20% de descompte.");
		System.out.println("Introduir un import");
		Import = lector.nextDouble();
		
		resultat = Import * descompte/100;
		preufinal=Import-resultat;
		System.out.println("Et descompten: "+resultat);
		System.out.println(" El preu sera: "+preufinal);
		
		lector.close();
		
		
		
	}
}
