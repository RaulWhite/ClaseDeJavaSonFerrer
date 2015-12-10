import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {

		String error = "Entrada no válida.\nDebe ser un número entero (sin decimales)\nentre el 1 y el 10.";
		
		Scanner entrada = new Scanner(System.in);
		byte numero;
		
		System.out.print("Introduzca un número entero del 1 al 10: ");
		
		if(entrada.hasNextByte()==true) {
			
			numero = entrada.nextByte();
			
			if(numero >= 1 && numero <= 10) {
				
				System.out.print("Número introducido: " + numero);
				
			}else{
				
				System.out.println(error);
				
			}
			
		}else{
			
			System.out.println(error);
			
		}
	
		entrada.close();
		
	}

}
