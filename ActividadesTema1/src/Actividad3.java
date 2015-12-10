import java.util.Scanner;

public class Actividad3 {

	public static void main(String[] args) {
		
			Scanner teclado = new Scanner (System.in);
			
			//Introducir el dividendo
			System.out.println("Indique el dividendo:");
			
			//Variable del dividendo
			float numX;
			numX = teclado.nextFloat();
			
			//Introducir el divisor
			System.out.println("Indique el divisor:");
			
			//Variable del divisor
			float numY;
			numY = teclado.nextFloat();
			
			//Cálculo del resultado de la división
			float numS = numX / numY;
			
			//Cálculo del resto de la división
			float numR = numX % numY;
			
			//Sacar el resultado de la división por pantalla
			System.out.println("El resultado de divirir " + numX + " / " + numY + " es : " + numS);
			
			//Sacar el resto de la división por pantalla
			System.out.println("El resto  de dividir " + numX + " / " + numY + " es : " + numR);
			
			teclado.close();
		
	}

}
