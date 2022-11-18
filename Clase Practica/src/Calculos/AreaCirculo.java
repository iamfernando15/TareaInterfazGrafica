package Calculos;

import java.util.Scanner;

public class AreaCirculo {

	Scanner calculo = new Scanner(System.in);
	
	double radio, diametro, area;
	
	public void AreaNumeros() {
		System.out.println("Ingrese el radio del circulo: ");
		radio = calculo.nextDouble();
		diametro = radio * 2;
		area = (3.1416) * (radio * radio);
		
		System.out.println("El diametro del circulo es: "+diametro);
		System.out.println("El area del circulo es: "+area);
	}
}
