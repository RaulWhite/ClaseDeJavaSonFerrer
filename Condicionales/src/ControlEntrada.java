import java.util.Scanner;

public class ControlEntrada {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int edad;
		
		System.out.println("¿Qué edad tienes?");
				
		if(entrada.hasNextInt()==true) {
			
			edad = entrada.nextInt();
			System.out.println("Tienes " + edad + " años.");
			
		} else {
			
			System.out.println("Entrada no válida: La edad debería ser un entero.");
			
		}
		
		entrada.close();
		
	}

}
