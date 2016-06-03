import java.util.Scanner;

public class Ejercicio05 {
	
	public static void main(String[] args) {
		
		System.out.print("Base de la tabla de multiplicar: ");
		
		Scanner entrada = new Scanner(System.in);
		int base = entrada.nextInt();
		
		int i = 1;
				
		while (i <= 10) {
			
			System.out.println(base + " x " + i + " = " + (base*i));

			i++;
			
		}
		
		entrada.close();
		
	}
	
}
