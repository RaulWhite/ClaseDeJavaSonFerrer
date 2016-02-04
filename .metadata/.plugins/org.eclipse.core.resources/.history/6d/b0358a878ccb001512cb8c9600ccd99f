import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double productos[] = new double[10];

		boolean preciosCorrectos = true;

		double suma = 0;

		for (int i = 0; i < productos.length; i++) {

			System.out.print("Introduce precio " + (i+1) + ": ");
			productos[i] = entrada.nextDouble();

		}

		for (int j = 0; j < productos.length && preciosCorrectos == true; j++) {

			if (productos[j] < 0) {

				System.out.println("\nSe ha encontrado un valor no valido en la posicion: " + j + ".\nEl programa terminará");

				preciosCorrectos = false;

			} else {

				suma = suma + productos[j];

			}

		}

		if (preciosCorrectos == true) {

			System.out.println(suma);

		}
		
		entrada.close();

	}

}