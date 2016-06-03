import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		byte opcion = 0;
		
		while (opcion < 1 || opcion > 4) {
			
			System.out.println("¿Cómo se escribe 30 en hexadecimal?\n"
					+ "\t1) 1E\n"
					+ "\t2) 2F\n"
					+ "\t3) 33\n"
					+ "\t4) Ninguna de las anteriores");
			
			opcion = entrada.nextByte();
			
		}
		
		if (opcion == 1) {
			
			System.out.println("CORRECTO");
			
		} else {
			
			System.out.println("INCORRECTO");
			
		}
	
		entrada.close();
		
	}
	
}
