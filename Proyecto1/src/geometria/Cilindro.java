package geometria;

/**
 * @author Raúl Blanco Rama
 */

public class Cilindro {

	// Atributos

	private int altura;
	private int radio;
	private final double PI = 3.141592;

	// Constructor

	public Cilindro() {

	}

	public Cilindro(int altura, int radio) {
		this.altura = altura;
		this.radio = radio;
	}

	// Metodos

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	public double getArea() {
		return 2 * PI * radio * (altura + radio);
	}

	public double getVolumen() {
		return PI * Math.pow(radio, 2) * altura;
	}

	public String toString() {
		return ("Cilindro de altura " + altura + " y radio " + radio);
	}
}