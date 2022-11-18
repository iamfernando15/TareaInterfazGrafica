package InversoCaptura;

import java.util.Scanner;

public class Inverso {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("El nombre a invertir es:");
		String nombre= scan.nextLine();
		String invertir= "";
		
		for(int i= nombre.length()-1; i>=0; i--) {
			invertir = invertir + nombre.charAt(i);
			
		}
		System.out.println(invertir);
	}

}
