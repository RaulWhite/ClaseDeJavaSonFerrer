import java.util.Scanner;

public class Actividad5 {

	public static void main(String[] args) {
			
		Scanner teclado = new Scanner(System.in);
		
		//Indicar el nombre del producto
		System.out.print("Nombre del producto: ");
		String nombre = teclado.nextLine();
		
		//Indicar el precio del producto
		System.out.print("Precio del producto (en Euros): ");
		float precio = teclado.nextFloat();
		
		//Indicar el descuento a aplicar
		System.out.print("Descuento a aplicar (Porcentaje): ");
		float descuento = teclado.nextFloat();
		
		//Calcular el precio con el descuento
		float total = precio - (precio * (descuento / 100));
		
		//Sacar el resultado del precio total por pantalla
		System.out.println("El precio original (" + precio + "€) del producto " + nombre + ",\ncon un descuento del " + descuento + "% queda en " + total + "€.");
		
		teclado.close();
		
	}

}
