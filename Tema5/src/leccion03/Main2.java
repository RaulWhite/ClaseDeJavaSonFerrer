package leccion03;

/**
 * @author Raúl Blanco Rama
 */

public class Main2 {

	public static void main(String[] args) {
	
		Circumferencia c1 = new Circumferencia(200, 200, 100);
		
		Circumferencia c2 = new Circumferencia();
		c2.x = 400;
		c2.y = 500;
		c2.radio = 150;
		
		c1.mostrar();
		
		System.out.println("Perímetro de c1: " + c1.perimetro());
		System.out.println("Perímetro de c2: " + c2.perimetro());
		
		System.out.println("Área de c1: " + c1.area());
		System.out.println("Área de c2: " + c2.area());
		
	}
	
}
