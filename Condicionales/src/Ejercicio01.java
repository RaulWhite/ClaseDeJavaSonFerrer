import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		System.out.println("¿Cuál es la temperatura del núcleo? (En ºC)");
		
		Scanner teclado = new Scanner(System.in);
		int tempNucleoC;
		tempNucleoC = teclado.nextInt();
				
		if (tempNucleoC > 120) {
					
			System.out.println("TEMPERATURA DEL REACTOR CRÍTICA.\n¡CORRED	INSENSATOS!");

		}
		
		if (tempNucleoC <= 120) {
			
			System.out.println("TEMPERATURA DEL REACTOR NORMAL.\nTODO VA BIEN.");

		}
				
		teclado.close();
			
		System.out.println("Fin del programa \"Avisador\".");

		
	}

}
