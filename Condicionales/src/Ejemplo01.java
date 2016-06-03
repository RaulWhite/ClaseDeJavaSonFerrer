import java.util.Scanner;

public class Ejemplo01 {

	public static void main(String[] args) {
		
		// Acceso a la discoteca
		// Hay que tener más de 18 años para pasar.
		
		System.out.println("¿Qué edad tiene el cliente?");
		
		Scanner teclado = new Scanner (System.in);
		int edad;
		edad = teclado.nextInt();
		
		if (edad >= 18){
			
			System.out.println("Puedes pasar.");
			
		}
	
		System.out.println("Fin del programa \"Portero\".");
		
		teclado.close();
		
	}

}
