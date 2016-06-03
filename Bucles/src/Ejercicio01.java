import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		System.out.print("Indique letra: ");
		
		Scanner entrada = new Scanner(System.in);
		String letra = entrada.nextLine();	
		
		int i = 1;
		
		while (i <= 100) {
			
			System.out.println(letra);
			i++;
			
		}
		
		entrada.close();
		
	}
	
}
