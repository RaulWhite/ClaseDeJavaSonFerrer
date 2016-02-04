import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		byte numero = 0;
		
		while (numero != 3) {
			
			System.out.print("Indique un número entre 1 y 5: ");
			numero = entrada.nextByte();
			
			if (numero < 1 || numero > 5) {
				
				System.out.println("Número no válido.\n");
				
			} else if (numero != 3){
				
				System.out.println("Pruebe de nuevo.\n");
				
			}
			
		}
		
		System.out.println("¡ENHORABUENA!");
	
		entrada.close();
		
	}
	
}
