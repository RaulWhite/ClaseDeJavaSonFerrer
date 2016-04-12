package ejemplo3;

/**
 * @author Raúl Blanco Rama
 */

public class Circulo extends Figura implements Mostrable, Figura2D {
	
	private double radio;
	
	@Override
	public void mostrar() {
		System.out.println("Círculo de radio: " + radio);
	}

	@Override
	public double area() {
		return Math.PI * (Math.pow(radio, 2));
	}

	@Override
	public double perimetro() {
		return 2 * (Math.PI * radio);
	}
	
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
}
