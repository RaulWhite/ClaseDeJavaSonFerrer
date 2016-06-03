import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		//Indicar el precio del producto
		System.out.println("¿Precio del producto? (En Euros)");
		
		Scanner teclado = new Scanner(System.in);
		double precio;
		precio = teclado.nextDouble();
		teclado.nextLine();
		
		//Por si no se cumple la condición, el precio final total es igual al indicado
		double total = precio;
		
		//Comprobar si el precio es menor a 5€ para cobrar 2€ de gestión
		if (precio < 5) {
			
			//Gastos de gestión
			byte gastosGestion = 2;
			
			//Calculo de precio con gastos de gestión
			total = precio + gastosGestion;
			
			//Anunciar que se aplicarán gastos de gestión
			System.out.println("Se aplicarán " + gastosGestion + "€ de gastos de gestión.");
			
		}
		
		//Sacar el precio total por pantalla
		System.out.println("El precio final es de " + total + "€.");
		
		teclado.close();
		
	}

}
