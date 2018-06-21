package Program1;
import java.util.Scanner;

public class Infoscaner {
	private static final int constant = 60;
	public static void main (String [] args){
		Scanner lector = new Scanner(System.in);
		int enter;
		
		enter = lector.nextInt();
		
		System.out.println(""+enter+"");
		
		lector.close();
		
		
	}
}
