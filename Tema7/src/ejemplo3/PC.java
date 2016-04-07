package ejemplo3;

/**
 * @author Raúl Blanco Rama
 */

public class PC extends Computadora {

	private String tamaño;
	private boolean tieneGPUExtra;
	
	public String getTamaño() {
		return tamaño;
	}
	
	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}
	
	public boolean isTieneGPUExtra() {
		return tieneGPUExtra;
	}
	
	public void setTieneGPUExtra(boolean tieneGPUExtra) {
		this.tieneGPUExtra = tieneGPUExtra;
	}

	@Override
	public void computar() {
		
	}
	
}
