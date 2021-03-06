package ejemplo2;

/**
 * @author Raúl Blanco Rama
 */

public abstract class Vehiculo {
	
	// Atributos
	protected String matricula;
	protected String marca;
	protected String modelo;
	
	// Constructores
	public Vehiculo(){
		System.out.println("Ejecutando el constructor implícito...");
	}
	
	// Métodos
	public String toString() {
		return "Matrícula: " + matricula + ", Marca: " + marca + ", Modelo: " + modelo;
	}
}
