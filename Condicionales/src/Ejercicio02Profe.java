import java.util.Scanner;

public class Ejercicio02Profe {

	public static void main(String[] args) {
		
		float precio, precioFinal;
		Scanner teclado = new Scanner(System.in);
		
		//Leemos el precio
		System.out.print("Precio: ");
		precio = teclado.nextFloat();
		
		precioFinal = precio;
		
		if (precio > 80) {
			
			precioFinal = precio - precio*10/100;
			
		}
	
		System.out.println("Precio final: " + precioFinal);
		
		teclado.close();
		
	}
	
}
