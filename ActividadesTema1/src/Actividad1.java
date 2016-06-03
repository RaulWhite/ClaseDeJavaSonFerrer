import java.util.Scanner;

public class Actividad1 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Indique el numero a multiplicar:");
		
		float numX;
		numX = teclado.nextFloat();
		
		System.out.println("Indique el número multiplicador:");
		
		float numY;
		numY = teclado.nextFloat();
		
		float numS;
		numS = numX * numY;
		
		System.out.println("El resultado de multiplicar " + numX + " x " + numY + " es: " + numS);
		
	}

}