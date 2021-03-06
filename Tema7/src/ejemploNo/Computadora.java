package ejemploNo;

/**
 * @author Raúl Blanco Rama
 */

public abstract class Computadora {
	
	private String modeloCPU;
	private int numNucleos;
	private String CantMemoria;
	private String tipoMemoria;
	
	public abstract void computar();
	
	public String getModeloCPU() {
		return modeloCPU;
	}
	
	public void setModeloCPU(String modeloCPU) {
		this.modeloCPU = modeloCPU;
	}
	
	public int getNumNucleos() {
		return numNucleos;
	}
	
	public void setNumNucleos(int numNucleos) {
		this.numNucleos = numNucleos;
	}
	
	public String getCantMemoria() {
		return CantMemoria;
	}
	
	public void setCantMemoria(String cantMemoria) {
		CantMemoria = cantMemoria;
	}
	
	public String getTipoMemoria() {
		return tipoMemoria;
	}
	
	public void setTipoMemoria(String tipoMemoria) {
		this.tipoMemoria = tipoMemoria;
	}
	
}
