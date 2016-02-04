import java.util.Scanner; 

public class Actividad6 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		//Indicar el nombre del producto
		System.out.print("Nombre del producto: ");
		String nombre = teclado.nextLine();
		
		//Indicar el precio del producto
		System.out.print("Precio del producto (en Euros): ");
		float precio = teclado.nextFloat();
		
		//Indicar el número de unidades vendidas
		System.out.print("Unidades vendidas: ");
		float unidades = teclado.nextFloat();
		
		//Calcular el precio total
		float total = precio * unidades;
		
		//Sacar el resultado del precio total por pantalla
		System.out.println("El total de la compra de " + unidades + " unidades de " + nombre + " asciende a " + total + "€.");
		
		teclado.close();		
		
	}

}
