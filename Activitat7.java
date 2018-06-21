package Program1;

import java.util.Scanner;

public class Activitat7 {
	public static void main (String [] args){
		int variable1;
		int variable2;
		int cambi;
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Intercanviar els valors de dues variables prèviament introduïdes");
		System.out.println("Introduir variable1");
		variable1=lector.nextInt();
		System.out.println("Introduir variable2");
		variable2=lector.nextInt();
		
		cambi = variable1;
		variable1=variable2;
		variable2=cambi;
		
		System.out.println("Variable1: "+variable1);
		System.out.println("Variable2: "+variable2);
		lector.close();
	}
}
