import java.util.Scanner;

public class Ejercicio18{

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int nota;
		
		for (int i = 1; i <= 5; i++) {
			
			System.out.print("Introduzca una nota: ");
			nota = entrada.nextInt();
			
			while (nota < 1 || nota > 10) {
				
				System.out.println("ERROR");
				System.out.print("Introduzca una nota del 1 al 10: ");
				nota = entrada.nextInt();
				
			}
			
			System.out.println("Nota " + i + ": " + nota);
			
		}
		
		entrada.close();
		
	}
	
}
