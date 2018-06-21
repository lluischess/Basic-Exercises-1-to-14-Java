package Program1;

import java.util.Scanner;

public class Activitat6 {
	public static void main (String [] args){
		int anys;
		int dias = 365;
		int segons = 525600;
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduir els anys d’ una persona i obtenir l’ equivalent en dies i segons");
		System.out.println("Introduir els anys:");
		anys=lector.nextInt();
		
		dias = anys * dias;
		segons = anys * segons;
		
		System.out.println("En dias: "+dias+" En segons: "+segons);
		lector.close();
	}
}
