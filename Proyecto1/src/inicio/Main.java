package inicio;

import java.util.Scanner;

import geometria.Cilindro;

/**
 * @author Raúl Blanco Rama
 */

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Altura? ");
		int altura = entrada.nextInt();
		
		System.out.print("Radio? ");
		int radio = entrada.nextInt();
		
		Cilindro c1 = new Cilindro();
		c1.setAltura(altura);
		c1.setRadio(radio);
		
		System.out.println(c1.getArea());
		System.out.println(c1.getVolumen());
		
		System.out.print("Altura? ");
		altura = entrada.nextInt();
		
		System.out.print("Radio? ");
		radio = entrada.nextInt();
		
		Cilindro c2 = new Cilindro(altura, radio);
		
		System.out.println(c2.getArea());
		System.out.println(c2.getVolumen());
		
		System.out.println(c2.toString());
		
		entrada.close();
		
	}
	
}
