package Leccion3;

/**
 * @author Raúl Blanco Rama
 */

public class Main3 {

	public static void main(String[] args) {
	
		Cuadrado cd1 = new Cuadrado(200, 200, 100);
		
		Cuadrado cd2 = new Cuadrado();
		cd2.x = 400;
		cd2.y = 500;
		cd2.lado = 150;
		
		cd1.mostrar();
		
		System.out.println("Perímetro de cd1: " + cd1.perimetro());
		System.out.println("Perímetro de cd2: " + cd2.perimetro());
		
		System.out.println("Área de cd1: " + cd1.area());
		System.out.println("Área de cd2: " + cd2.area());
		
	}
	
}
