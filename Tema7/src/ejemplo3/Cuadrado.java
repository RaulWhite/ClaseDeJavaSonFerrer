package ejemplo3;

public class Cuadrado extends Figura implements Mostrable, Figura2D {

private double lado;
	
	@Override
	public void mostrar() {
		System.out.println("Cuadrado de lado: " + lado);
	}

	@Override
	public double area() {
		return Math.pow(lado, 2);
	}

	@Override
	public double perimetro() {
		return lado * 4;
	}
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
}
