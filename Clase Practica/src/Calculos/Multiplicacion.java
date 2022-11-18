package Calculos;

import java.util.Scanner;

public class Multiplicacion {

	Scanner multi = new Scanner(System.in);
	
	int m1;
	int m2;
	int multiplicator;
	
	public void MultiNum() {
		System.out.println("Ingrese el primer multiplicador: ");
		m1= multi.nextInt();
		
		System.out.println("Ingrese el segundo multiplicador: ");
		m2= multi.nextInt();
		
		multiplicator= m1 * m2;
		
		System.out.println("El resultado es: \n"+multiplicator);
	}
}
