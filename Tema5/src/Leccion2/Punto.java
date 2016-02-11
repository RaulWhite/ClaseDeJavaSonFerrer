package Leccion2;
/**
 * @author Raúl Blanco Rama
 */
public class Punto {

	// Atributos
	double x, y;
	String color;
	double transparencia;
	boolean visible;
	
	// Métodos
	void mostrar(){
		System.out.println("Coordenadas: " + x + ", " + y);
		System.out.println("Color: " + color);
		System.out.println("Transparencia: " + transparencia);
		if (visible==true){
			System.out.println("Visible: Sí");
		} else if (visible==false){
			System.out.println("Visible: No");
		}
	}
	
}
