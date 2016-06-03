import java.util.Scanner;

public class Ejercicio02DoWhile {

	public static void main(String[] args) {
		
		System.out.print("Indique letra: ");
		
		Scanner entrada = new Scanner(System.in);
		String letra = entrada.nextLine();	
		
		System.out.print("Indique las veces que debe repetirse: ");
		int repetir = entrada.nextInt();
		
		int i = 1;
		
		do {
			
			System.out.println(letra);
			i++;
			
		} while (i <= repetir);
		
		entrada.close();
		
	}
	
}
