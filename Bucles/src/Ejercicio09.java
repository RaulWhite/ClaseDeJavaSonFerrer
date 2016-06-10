import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Indique el dividendo: ");
		int dividendo = entrada.nextInt();
		
		System.out.print("Indique el divisor: ");
		int divisor = entrada.nextInt();
		
		while (divisor <= dividendo) {
			
			dividendo = dividendo - divisor;
			
		}
		
		System.out.println("El resto es: " + dividendo);
		
		entrada.close();
		
	}
	
}
