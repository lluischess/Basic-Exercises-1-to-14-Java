//// Alex Alonso,Joel Forcada,Lluis Casamajor
//Una empresa transportista vol saber el  consum de gasolina real dels seus vehicles per poder tenir un control de la velocitat dels seus treballadors
// i si utilitzen els vehicles per altres assumptes aliè de la feina.
//-	El càlcul es fa sobre els 100km.
//-	S’ha d’introduir els kilòmetres totals del vehicle tant a l’inici com al final.
//-	S’ha d’introduir els litres de benzina consumits.


package Program1;

import java.util.Scanner;

public class Controlconsum {
	public static void main (String [] args){
		double kmfinals;
		double kminicials;
		double litres;
		double Resultat;
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Introdueix els litres que utilitzaras");
		litres = lector.nextDouble();
		System.out.println("Introdueix els kilometras inicilas");
		kminicials = lector.nextDouble();
		System.out.println("Introdueix els kilometras finals");
		kmfinals = lector.nextDouble();
		
		
		
		Resultat = (litres*100)/(kmfinals-kminicials);
		
		System.out.println("El teu consum es: "+String.format("%1$.3f",Resultat)+" litres/100km");
		lector.close();
	}
}
