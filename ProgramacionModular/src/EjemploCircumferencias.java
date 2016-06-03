/**
 * @author Raúl Blanco Rama
 */
import java.util.Scanner;

public class EjemploCircumferencias {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double radio;
		
		System.out.print("Radio? ");
		radio = entrada.nextDouble();
		
		System.out.println("Perímetro: " + perimetro(radio));
		System.out.println("Área: " + area(radio));
		
		entrada.close();
				
	}
	
	static double perimetro(double r){
		return 2*Math.PI*r;
	}
	
	static double area(double r){
		return Math.PI*r*r;
	}

}
