import java.util.Scanner;

public class EjemploBreak {

	public static void main(String[] args) {
		
		// Bucle que pida 20 notas y pare cuando el usuario escriba el número -1.
		
		Scanner entrada = new Scanner(System.in);
		
		float nota;
		
		for (int i = 1; i <= 20; i++) {
			System.out.print("Nota: ");
			nota = entrada.nextFloat();
			
			if (nota == -1) {
				//Parar el bucle
				break;
			}
			
		}
		
		System.out.println("Has terminado de escribir notas.");
		entrada.close();
		
	}
	
}
