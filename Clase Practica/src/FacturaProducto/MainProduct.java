package FacturaProducto;

import java.util.Scanner;

public class MainProduct {

	public static void main(String[] args) {
		Scanner product = new Scanner(System.in);
		String nombre;
		double precio;
		int cantidad;
		double subtotal;
		double total;
		double total2;
		double impuesto;
		double IGV= 0.25;
		double descuento= 0.5;
		
		System.out.println("Ingrese el nombre del producto a comprar: ");
		nombre= product.next();
		System.out.println("Digite precio del producto: ");
		precio= product.nextDouble();
		System.out.println("Cuantas unidades de "+nombre+" desea llevar?");
		cantidad= product.nextInt();
		
		subtotal= precio * cantidad;
		impuesto= subtotal * IGV;
		total= subtotal + impuesto;
		
		if(total>10000) {
			total2= (total)-total * descuento;
			System.out.println("-----Factura del Cliente-----"
			+"\nproductos: "+nombre
			+"\nprecio: "+precio
			+"\ncantidad de producto adquirido: "+cantidad
			+"\nsubtotal: "+subtotal
			+"\nimpuesto: "+impuesto
			+"\ntotal: "+total
			+"\ndescuento: "+(total*descuento)
			+"\ntotal de producto que se pago: "+total2);
			
		}else {
			System.out.println("-----Factura del Cliente-----"
					+"\nproductos: "+nombre
					+"\nprecio: "+precio
					+"\ncantidad de producto adquirido: "+cantidad
					+"\nsubtotal: "+subtotal
					+"\nimpuesto: "+impuesto
					+"\ntotal: "+total);
		}
		

	}

}
