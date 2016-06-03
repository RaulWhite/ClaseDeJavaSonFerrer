import java.util.Scanner;

public class Asignaturas {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Abreviatura: ");
		String abreviatura = entrada.next();

		if (abreviatura.equals("prog") ) {
			System.out.println("Programación");
		} else if (abreviatura.equals("sistemas")) {
			System.out.println("Sistemas informáticos");
		} else {
			System.out.println("Otras asignaturas");
		}
		
		entrada.close();
		
	}
	
}
