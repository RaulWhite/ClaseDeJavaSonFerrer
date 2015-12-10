import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int concursante;

		for (int i = 1; i <= 10; i++) {
			
			System.out.print("Número secreto: ");
			concursante = entrada.nextInt();
			
			if (concursante == 6) {
				System.out.println("¡FELICIDADES! Has acertado");
				break;
			}else if (i == 10){
				System.out.println("Has agotado todas tus posibilidades. Has perdido.");
			}

		}
		
		entrada.close();

	}

}
