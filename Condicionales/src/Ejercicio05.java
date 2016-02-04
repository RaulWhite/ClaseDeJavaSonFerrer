import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		
		//Indicar un mes
		System.out.print("Indique mes: ");
		
		Scanner teclado = new Scanner(System.in);
		byte mes = teclado.nextByte();
		
		//Comprobar si es mes indicado está entre 1 y 12 
		if (mes >= 1 && mes <= 12) {
			
			//Anunciar que el mes indicado es válido
			System.out.println("Mes correcto.");
			
		} else {
			
			//Anunciar que el mes indicado es inválido
			System.out.println("Mes no válido.");
			
		}
		
		teclado.close();
		
	}

}
