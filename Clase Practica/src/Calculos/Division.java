package Calculos;

import java.util.Scanner;

public class Division {
	Scanner div = new Scanner(System.in);
	
	int d1;
	int d2;
	int resultado;
	
	public void DivNum() {
		System.out.println("Ingrese el primer numero: ");
		d1 = div.nextInt();
		
		System.out.println("Ingrese el segundo numero: ");
		d2 = div.nextInt();
		
		resultado = d1 / d2;
		
		System.out.println("El resultado es: \n"+resultado);
	}

}
