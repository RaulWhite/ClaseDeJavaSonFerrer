import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		float precio = 0;
		
		for (short i = 1; i <= 4; i++) {
			System.out.print("Precio del producto " + i + ": ");
			precio = precio + entrada.nextFloat();
		}
		
		System.out.println("Precio total: " + precio);
		
		entrada.close();
		
	}
	
}
