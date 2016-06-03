import java.util.Scanner;

public class Ejercicio12 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int opcion;
		
		do {
			
			System.out.println("¿Quién es el autor de la novela \"Ready Player One\"?\n"
					+ "\t1) Douglas Capland\n"
					+ "\t2) Isaac Asimov\n"
					+ "\t3) Ernest Cline\n"
					+ "\t4) Ray Bradbury");
			
			opcion = entrada.nextInt();
			
		} while (opcion < 1 || opcion > 4);
		
		if (opcion == 3) {
			
			System.out.println("CORRECTO");
			
		} else {
			
			System.out.println("INCORRECTO");
			
		}
		
		entrada.close();
		
	}

}
