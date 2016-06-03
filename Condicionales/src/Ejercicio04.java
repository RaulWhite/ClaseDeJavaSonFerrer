import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		//Indicar la contraseña
		System.out.print("Introduzca la contraseña de 4 dígitos: ");
		int password = teclado.nextInt();
		
		//Comprobar si la contraseña introducida es 1234
		if (password == 1234) {
			
			//Anunciar el acceso concedido
			System.out.println("Acceso concedido.");
			
		}
		
		teclado.close();
		
	}

}
