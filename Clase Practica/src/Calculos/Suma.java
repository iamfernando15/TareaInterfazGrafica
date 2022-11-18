package Calculos;

import java.util.Scanner;

public class Suma {

	Scanner scan = new Scanner(System.in);
	
	int num1;
	int num2;
	int resultado;
	
	public void SumNum() {
		System.out.println("Ingrese el primer numero: ");
		num1= scan.nextInt();
		
		System.out.println("Ingrese el segundo numero: ");
		num2= scan.nextInt();
		
		resultado= num1 + num2;
		
		System.out.println("El resultado final es: \n"+resultado);
	}
}
