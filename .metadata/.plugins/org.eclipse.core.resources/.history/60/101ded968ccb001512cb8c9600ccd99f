import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		//Indicar el precio del producto
		System.out.println("¿Precio del producto? (En Euros)");
		
		Scanner teclado = new Scanner(System.in);
		double precio;
		precio = teclado.nextDouble();
		teclado.nextLine();
		
		//Descuento del 10%
		double descuento = 10;
		
		//Comprobar si el precio es mayor de 80€
		if (precio > 80) {
			
			//Calcular el precio con el descuento
			double descDecimal = descuento / 100.0;
			double descCant = precio * descDecimal;
			double precioDesc = precio - descCant;
			
			//Sacar el precio total por pantalla
			System.out.println("Se aplica descuento del 10%.");
			System.out.println("El precio final es de " + precioDesc + "€.");
			
		}
		
		//Anuncio de fin del programa
		System.out.println("Fin del programa.");
		
		teclado.close();
		
	}

}
