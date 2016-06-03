import java.util.Scanner;

public class Entrada {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("¿Cómo te llamas?");
		
		String nombre;
		
		nombre = teclado.nextLine();
		
		System.out.println("Encantado de conocerte " + nombre + ".");
		
	}

}
