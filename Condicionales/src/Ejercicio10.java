import java.util.*;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int nota = entrada.nextInt();

		if (nota >= 0 && nota <= 4) {
			System.out.println("INS");
		} else if (nota == 5) {
			System.out.println("SUF");
		} else if (nota == 6) {
			System.out.println("BIEN");
		} else if (nota == 7 || nota == 8) {
			System.out.println("NOT");
		} else if (nota == 9 || nota == 10) {
			System.out.println("SOB");
		}
		
		entrada.close();

	}

}
