import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		final String NOMBRE_REQUERIDO = "raulwhite";
		final String PASSWORD_REQUERIDO = "java8";
		
		System.out.print("Nombre de usuario: ");
		String username = teclado.nextLine();
		
		System.out.print("Contraseña: ");
		String password = teclado.nextLine();
		
		if (username.equals(NOMBRE_REQUERIDO) && password.equals(PASSWORD_REQUERIDO)) {
			System.out.println("ACCESO PERMITIDO");
		} else {
			System.out.println("ACCESO DENEGADO");
		}
		
		teclado.close();
		
	}
	
}
