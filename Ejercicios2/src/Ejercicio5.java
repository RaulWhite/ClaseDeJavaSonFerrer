/**
 * @author Raúl Blanco Rama
 */

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int respuesta = (int)(Math.random()*10 + 1);
		int concursante;
		int i = 1;
		
		do {
						
			System.out.print("Indique un número del 1 al 10: ");
			concursante = entrada.nextInt();
			
			while (concursante < 1 || concursante > 10) {
				System.out.print("Indique un número del 1 al 10, no otro: ");
				concursante = entrada.nextInt();
			}
			
			if (concursante == respuesta) {
				System.out.println("¡ENHORABUENA! ¡Ha acertado!");
				System.exit(0);
			}
						
			i++;
			
		} while (i <= 3);
		
		System.out.println("Lo siento. El número era el: " + respuesta);
		
		entrada.close();
		
	}
	
}
