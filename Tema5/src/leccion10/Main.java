package leccion10;
/**
 * @author Raúl Blanco Rama
 */

public class Main {

	public static void main(String[] args) {
		
		Rectangulo r1 = new Rectangulo(0, 0, 200, 300);
		
		Rectangulo r2 = new Rectangulo();
		r2.x = 500;
		r2.y = 500;
		r2.alto = 450;
		r2.ancho = 150;
		
		System.out.println("El área de r1 es: " + r1.area() + " px²");
		System.out.println("El área de r2 es: " + r2.area() + " px²");
		
		System.out.println("El perímetro de r1 es: " + r1.perimetro() + " píxeles");
		System.out.println("El perímetro de r2 es: " + r2.perimetro() + " píxeles");
		
		r1.mostrar();
		r2.mostrar();
		
		r1.mover(50,50);
		r2.mover(50,50);
		
		r1.mostrar();
		r2.mostrar();
		
		System.out.println(r1.puntoInterior(0, 150));
		
	}
	
}
