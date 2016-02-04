import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		
		String error = "Entrada no válida.\nDebe ser un número entero (sin decimales)\nentre el 1 y el 10.";
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduzca un número entero del 1 al 10: ");
		
		if(entrada.hasNextByte()==true) {
			
			byte numero = entrada.nextByte();
			
			if(numero >= 1 && numero <= 10) {
				
				System.out.println("Número introducido: " + numero);
				
				if (numero == 3) {
					
					System.out.println("¡HA ACERTADO EL NÚMERO SECRETO!");
					
				}
				
			}else{
				
				System.out.println(error);
				
			}
			
		}else{
			
			System.out.println(error);
			
		}
	
		entrada.close();
		
	}

}
