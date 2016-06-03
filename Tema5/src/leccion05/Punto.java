package leccion05;

/**
 * @author Raúl Blanco Rama
 */

public class Punto {

	// Atributos
	private double x, y;
	private String color;
	private double transparencia;
	private boolean visible;
	
	// Constructores
	Punto() {
		x = 1;
		y = 2;
		color = "Verde";
		transparencia = 0.5;
		visible = false;
	}

	Punto(double x, double y, String color, double transparencia, boolean visible) {
		this.x = x;
		this.y = y;
		this.color = color;
		this.transparencia = transparencia;
		this.visible = visible;
	}

	Punto(double x, double y, String color) {
		this(x, y, color, 0.8, false);
	}

	// Métodos
	void mostrar() {
		System.out.println("Coordenada x: " + x);
		System.out.println("Coordenada y: " + y);
		System.out.println("Color: " + color);
		System.out.println("Transparencia: " + transparencia);

		if (visible == true) {
			System.out.println("Visible");
		} else {
			System.out.println("Oculto");
		}
	}

	// Métodos de acceso
	double getX() {
		return x;
	}

	void setX(double x) {
		this.x = x;
	}

	double getY() {
		return y;
	}

	void setY(double y) {
		this.y = y;
	}

	String getColor() {
		return color;
	}

	void setColor(String color) {
		this.color = color;
	}

	double getTransparencia() {
		return transparencia;
	}

	void setTransparencia(double transparencia) {
		this.transparencia = transparencia;
	}

	boolean getVisible() {
		return visible;
	}

	void setVisible(boolean visible) {
		this.visible = visible;
	}
}