package ejemplo3;

/**
 * @author Raúl Blanco Rama
 */

public class Rombo extends Figura implements Mostrable, Figura2D {

	private double diagMayor;
	private double diagMenor;
	
	@Override
	public void mostrar() {
		System.out.println("Diagonal Mayor: " + diagMayor + "\n"
							+ "Diagonal Menor: " + diagMenor);
	}

	@Override
	public double area() {
		return (diagMayor * diagMenor)/2;
	}

	@Override
	public double perimetro() {
		return getLado() * 4;
	}
	
	public double getLado() {
		return Math.sqrt((Math.pow((diagMayor/2), 2)
						+ Math.pow((diagMenor/2), 2)));
	}

	public double getDiagMayor() {
		return diagMayor;
	}

	public void setDiagMayor(double diagMayor) {
		this.diagMayor = diagMayor;
	}

	public double getDiagMenor() {
		return diagMenor;
	}

	public void setDiagMenor(double diagMenor) {
		this.diagMenor = diagMenor;
	}
	
}
