package Calculos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner calculator = new Scanner(System.in);
		int respuestas;
		
		Suma s = new Suma();
		Resta r = new Resta();
		Multiplicacion m = new Multiplicacion();
		Division d = new Division();
		AreaCirculo a = new AreaCirculo();
		
		do {
			System.out.println("\nSeleccione el calculo que desea realizar: ");
			System.out.println("1. Suma");
			System.out.println("2. Resta");
			System.out.println("3. Multiplicacion");
			System.out.println("4. Division");
			System.out.println("5. Area de un circulo");
			System.out.println("6. Salir\n");
			
			respuestas = (int) calculator.nextInt();
			
			switch (respuestas) {
			case 1:
				s.SumNum();
				break;
			case 2:
				r.RestaNum();
				break;
			case 3: 
				m.MultiNum();
				break;
			case 4:
				d.DivNum();
				break;
			case 5:
				a.AreaNumeros();
				break;
			case 6:
				System.exit(0);
			default:
				System.out.println("Usted ha ingresado una opcion incorrecta\n");
				
			}
			
		}while(respuestas!=6);
	}

}
