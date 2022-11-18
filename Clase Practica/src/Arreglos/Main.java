package Arreglos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner prueba = new Scanner(System.in);
		Persona p[]= new Persona[2];
		
		String nombre="";
		int edad= 0;
		String genero= "";
		String puesto= "";
		
		for(int i=0;i<p.length;i++) {
			System.out.println("\nIngresa tu nombre: ");
			nombre= prueba.nextLine();
			System.out.println("Ingresa tu edad: ");
			edad= prueba.nextInt();
			System.out.println("Ingresa tu genero: ");
			genero= prueba.nextLine();
			prueba.nextLine();
			System.out.println("Ingresa tu puesto: ");
			puesto= prueba.nextLine();
			
		}

	}

}
