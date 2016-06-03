import java.util.Scanner;

public class Actividad2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Indique el dividendo:");
		
		float numX;
		numX = teclado.nextFloat();
		
		System.out.println("Indique el divisor:");
		
		float numY;
		numY = teclado.nextFloat();
		
		float numS;
		numS = numX % numY;
		
		System.out.println("El resto  de dividir " + numX + " / " + numY + " es : " + numS);
		
	}

}