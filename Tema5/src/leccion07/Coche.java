package leccion07;

/**
 * @author Raúl Blanco Rama
 */

public class Coche {

	// Atributos
	private String matricula;
	private static int descuento;
	
	//Métodos de acceso
	String getMatricula(){
		return matricula;
	}
	
	void setMatricula(String matricula){
		this.matricula = matricula;
	}
	
	int getDescuento(){
		return descuento;
	}
	
	void setDesceunto(int descuento){
		this.descuento = descuento;
	}
	
}