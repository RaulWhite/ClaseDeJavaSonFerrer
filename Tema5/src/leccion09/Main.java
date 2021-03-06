package leccion09;

/**
 * @author Raúl Blanco Rama
 */

public class Main {

	public static void main(String[] args) {
	
		Punto p = new Punto();
		
		p.mostrar();
		
		Punto p1 = new Punto(50, 50, "Rojo", 0.75, true);
		p1.mostrar();
		
		Punto p2 = new Punto(40,40,"Amarillo");
		p2.mostrar();
		
		System.out.println("El color del punto es " + p.getColor());
		p.setColor("Marrón");
		
		System.out.println("El valor de contador es " + p.getContador());
	}

}