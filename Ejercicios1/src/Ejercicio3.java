import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Número: ");
		int numero = teclado.nextInt();
		
		String resultado = (numero%2 == 0)?"No es impar":"Es impar";
		System.out.println(resultado);

		teclado.close();
		
	}
	
}
