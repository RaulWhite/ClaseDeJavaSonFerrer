import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int mult;
		
		for (int i = 1; i <= 5; i++) {
			
			System.out.print("\nMultiplicador: ");
			mult = entrada.nextInt();
			
			if (mult == 1) {
				System.out.println("¡No seas tonto!");
				continue;
			}
			
			System.out.println("Tabla del " + mult);
			
			for (int j = 1; j <= 10; j++) {
				
				System.out.println("\t" + mult + " x " + j +" = " + mult*j);
				
			}
						
		}
		
		entrada.close();
		
	}
	
}
