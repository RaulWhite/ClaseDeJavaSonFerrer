package leccion02;
/**
 * @author Raúl Blanco Rama
 */
public class Punto {

	// Atributos
	double x, y;
	String color;
	double transparencia;
	boolean visible;
	
	// Constructores

	Punto() {
		x = 0;
		y = 0;
		color = "Azul";
		transparencia = 0.5;
		visible = true;
	}

	Punto(double x, double y, String color, double transparencia, boolean visible) {
		this.x = x;
		this.y = y;
		this.color = color;
		this.transparencia = transparencia;
		this.visible = visible;
	}

	// Crear constructor que tome como parámetros x, y, color. La transparencia
	// valdrá 1 y será visible.
	Punto(double x, double y, String color){
		this(x, y, color, 1, true);
	}
	
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
