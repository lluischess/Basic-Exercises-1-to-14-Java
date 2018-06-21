package Program1;

import java.util.Scanner;

public class Activitat2 {
public static void main (String [] args){
	
	int Num1;
	int Num2;
	int sum;
	
	Scanner lector = new Scanner(System.in);
	System.out.println("Introduir dos números i calcular la seva suma");
	System.out.println("Introduir el primer numero");
	Num1 = lector.nextInt();
	System.out.println("Introduir el segon numero");
	Num2 =lector.nextInt();
	
	
	sum = Num1+Num2;
	
	System.out.println("Suma:"+sum);
	lector.close();
	
}
}
