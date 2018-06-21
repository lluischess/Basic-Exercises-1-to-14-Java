

package Program1;

import java.util.Scanner;

public class Activitat11 {
	public static void main (String [] args){
		int A;
		int B;
		int C;
		int Guardar;

		Scanner lector = new Scanner(System.in);
		System.out.println("Si  tenim  tres  variables  A,B  i  C.  Intercanviar  els  valors  de  la  següent manera:");
		//		B pren del valor de A
		//		C pren 
		//		el valor de B
		//		A pren el valor de C. 
		
		System.out.println("Introduir 3 valor per A per B i per C ");
		A = lector.nextInt();
		B = lector.nextInt();
		C = lector.nextInt();
		
		Guardar = B;
		B = A;
		A = C;
		C = Guardar;
		
		System.out.println("A: "+A+" B: "+B+"C: " +C);
		
		lector.close();
		
	}
}
