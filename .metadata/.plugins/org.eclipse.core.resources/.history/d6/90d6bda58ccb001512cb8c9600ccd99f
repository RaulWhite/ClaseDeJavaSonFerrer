/**
 * @author Raúl Blanco Rama
 */
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		final int aleatorio = (int) (Math.random()*10+1);
		Scanner entrada = new Scanner(System.in);
		int respuesta = 0;		
		int i = 1;
		
		while (i <= 3) {
			
			System.out.print("Adivina el número: ");
			respuesta = entrada.nextInt();
			
			if (respuesta == aleatorio) {
				break;
			}
		
			i++;
			
		}
		
		if (respuesta == aleatorio) {
			System.out.println("¡ENHORABUENA! Has acertado en " + i + " intento(s).");
		} else {
			System.out.println("Lo siento. Has gastado tus 3 intentos."
					+ "\nEl número era el " + aleatorio + ".");
		}
		
		entrada.close();
		
	}
	
}
