package ejemplo2;

/**
 * @author Raúl Blanco Rama
 */

public class Coche extends Vehiculo{
	private int numPuertas;
	
	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Número de puertas: " + numPuertas;
	}
}