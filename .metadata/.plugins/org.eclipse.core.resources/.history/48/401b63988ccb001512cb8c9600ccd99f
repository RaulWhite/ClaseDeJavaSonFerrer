import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		//Indicar precio
		System.out.print("Precio: ");
		double precio = teclado.nextDouble();
		
		//Indicar número de unidades
		System.out.print("Número de unidades: ");
		double unidades = teclado.nextDouble();
		
		//Calcular el subtotal (precio * número de unidades)
		double subtotal = precio * unidades;
		
		//Establecer la variable para el descuento
		double descuento;
		
		//Comprobar si el subtotal es mayor de 75€
		if (subtotal > 75) {
		
			//Descuento del 15% al superar 75€
			descuento = 15;
			
			//Anunciar el descuento del 15%
			System.out.println(" \nSe aplicará un descuento del 15%\npor superar 75€ de compra.");
			
		} else {
				
			//Descuento del 5% al no superar 75€
			descuento = 5;
			
			//Anunciar el descuento del 5%
			System.out.println(" \nSe aplicará un descuento del 5%\npor no superar 75€ de compra.");
				
		}
		
		//Sacar el subtotal por pantalla
		System.out.println(" \nSubtotal: " + subtotal + "€.");
		
		//Sacar el descuento por pantalla
		System.out.println("Descuento: " + (int)descuento + "%.");
			
		//Calcular el precio final total aplicando del descuento
		double total = subtotal - (subtotal * (descuento / 100));
		
		//Sacar el resultado del precio con el descuento por pantalla
		System.out.println(" \nTOTAL: " + total + "€.");
		
		teclado.close();
		
	}
	
}
