import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int nota;
		float suma = 0;
		
		for (int i = 1; i <= 5; i++) {
			
			System.out.print("Introduzca una nota: ");
			nota = entrada.nextInt();
			
			while (nota < 1 || nota > 10) {
				
				System.out.println("ERROR");
				System.out.print("Introduzca una nota del 1 al 10: ");
				nota = entrada.nextInt();
				
			}
			
			System.out.println("Nota " + i + ": " + nota);
			suma = suma + nota;
			System.out.println("Suma de las notas: " + suma);
			System.out.println();
			
		}
		
		System.out.println("Nota media: " + (suma/5));
		
		entrada.close();
		
	}
	
}
