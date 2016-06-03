/**
 * @author Raúl Blanco Rama
 */
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		final int aleatorio = (int) (Math.random()*10+1);
		Scanner entrada = new Scanner(System.in);
		int respuesta;		
		int i = 1;
		int puntos;
		
		while (i <= 3) {
			
			System.out.print("Adivina el número: ");
			respuesta = entrada.nextInt();
			
			if (respuesta == aleatorio) {
				break;
			}
		
			i++;
			
		}
		
		// Al haber gastado los 3 intentos y fallado, la i vale 4 al no haber roto el bucle.
				
		switch(i) {
		case 1:
			puntos = 10;
			break;
		case 2:
			puntos = 5;
			break;
		case 3:
			puntos = 2;
			break;
		default:
			puntos = 0;
		}
		
		if (puntos != 0){		
			System.out.println("¡ENHORABUENA! Has acertado en " + i + " intento(s).");
		}else{
			System.out.println("Lo siento. Has gastado tus 3 intentos."
					+ "\nEl número era el " + aleatorio + ".");
		}
		
		System.out.println("Recibes " + puntos + " punto(s).");		
		
		entrada.close();
		
	}
	
}
