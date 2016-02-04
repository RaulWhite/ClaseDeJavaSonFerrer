import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		// Numero de Mes

		Scanner entrada = new Scanner(System.in);

		byte numeroMes;
		int numeroYear;
		System.out.println("¿En que año estamos?");
		numeroYear = entrada.nextInt();
		System.out.println("Numero de mes: ");
		numeroMes = entrada.nextByte();

		switch (numeroMes) {
		case 1:
			System.out.println("Enero tiene 30");
			break;
		case 2:

			if ((numeroYear % 4 == 0 && numeroYear % 100 != 0) || numeroYear % 400 == 0) {
				System.out.println("Febrero tiene 29");
			} else {
				System.out.println("Febrero tiene 28");
			}
			break;
		case 3:
			System.out.println("Marzo tiene 30");
			break;
		case 4:
			System.out.println("Abril tiene 31");
			break;
		case 5:
			System.out.println("Mayo tiene 30");
			break;
		case 6:
			System.out.println("Junio tiene 31");
			break;
		case 7:
			System.out.println("Julio tiene 30");
			break;
		case 8:
			System.out.println("Agosto tiene 31");
			break;
		case 9:
			System.out.println("Septiembre tiene 30");
			break;
		case 10:
			System.out.println("Octubre tiene 31");
			break;
		case 11:
			System.out.println("Noviembre tiene 30");
			break;
		case 12:
			System.out.println("Diciembre tiene 31");
			break;

		default:
			System.out.println("Error!");
		}
		
		entrada.close();
		
	}

}