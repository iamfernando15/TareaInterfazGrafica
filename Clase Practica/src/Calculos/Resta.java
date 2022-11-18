package Calculos;

import java.util.Scanner;

public class Resta {

Scanner res = new Scanner(System.in);
	
	int n1;
	int n2;
	int resultado;
	
	public void RestaNum() {
		System.out.println("Ingrese el primer numero: ");
		n1 = res.nextInt();
		
		System.out.println("Ingrese el segundo numero: ");
		n2= res.nextInt();
		
		resultado = n1 - n2;
		
		System.out.println("El resultado de la resta es: \n"+resultado);
	}
}
