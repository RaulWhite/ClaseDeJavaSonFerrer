import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String arrayTest[] = new String[5];

		for (int i = 0; i < arrayTest.length; i++) {
			System.out.println("Introduce una pregunta y sus posibles respuestas: ");
			arrayTest[i] = entrada.nextLine();
		}
		
		System.out.println(arrayTest[0]);
		
		for (int i = 1; i < arrayTest.length; i++) {
			System.out.println("\t" + arrayTest[i]);
		}
		
		entrada.close();
	}
}