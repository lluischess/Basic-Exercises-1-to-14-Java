package Program1;

import java.util.Scanner;

public class Activitat5 {
	public static void main (String [] args){
		double importe;
		double descompte;
		double importnet;
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Calcula el descompte d'un import i l'import net");
		
		System.out.print("Introdueix l'import: ");
		importe = lector.nextDouble();
		System.out.print("Introdueix el descompte: ");
		descompte = lector.nextDouble();
		
		importnet = importe - (importe *(descompte/100));
		
		System.out.print("De l'import: "+importe+" el import net es:"+importnet);
	}
}
