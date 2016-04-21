package ejemplo2;

/**
 * @author Raúl Blanco Rama
 */

public class Moto extends Vehiculo{
	private boolean tieneSidecar;
	
	public boolean isTieneSidecar() {
		return tieneSidecar;
	}

	public void setTieneSidecar(boolean tieneSidecar) {
		this.tieneSidecar = tieneSidecar;
	}
	
	@Override
	public String toString() {
		if (tieneSidecar){
			return super.toString() + ", Tiene sidecar: Sí";
		} else {
			return super.toString() + ", Tiene sidecar: No";
		}
	}
}