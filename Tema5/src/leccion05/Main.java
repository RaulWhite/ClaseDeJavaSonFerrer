package leccion05;

/**
 * @author Raúl Blanco Rama
 */

public class Main {

	public static void main(String[] args) {
	
		Punto p = new Punto();
		p.mostrar();
		System.out.println();
		
		Punto p1 = new Punto(50, 50, "Rojo", 0.75, true);
		p1.mostrar();
		System.out.println();
		
		Punto p2 = new Punto(40,40,"Amarillo");
		p2.mostrar();
		System.out.println();
		
	}

}
