import java.util.Scanner;

public class Entrada2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca precio:");
		int precio = teclado.nextInt();
		
		teclado.nextLine();
		
		System.out.println("Introduzca nombre:");
		String nombre = teclado.nextLine();
		
		
		
		teclado.close();
		
	}

}
