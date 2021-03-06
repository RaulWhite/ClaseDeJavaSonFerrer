package leccion11;

/**
 * @author Raúl Blanco Rama
 */

public class Persona {

	// Atributos
	private String dni;
	private String nombre;
	private String apellidos;
	private int edad;
	private double peso;
	private static int contador = 0;

	// Métodos constructor
	Persona() { // Constructor implícito
		contador++;
	}

	Persona(String dni, String nombre, String apellidos, int edad, double peso) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.peso = peso;
		contador++;
	}

	Persona(String nombre, String apellidos) {
		this("00000000A", nombre, apellidos, 18, 70);
	}

	// Métodos
	void mostrar() {
		System.out.println("\nDNI: " + dni);
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("Edad: " + edad + " años");
		System.out.println("Peso: " + peso + " kg");
	}

	void saludar() {
		System.out.println("Hola, me llamo " + nombre + ".");
	}

	void cumplirAnyos() {
		edad++;
	}

	int getEdad() {
		return edad;
	}
	
	// Métodos de acceso
	String getDni(){
		return dni;
	}
	
	void setDni(String dni){
		this.dni = dni;
	}
	
	String getNombre(){
		return nombre;
	}
	
	void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	String getApellidos(){
		return apellidos;
	}
	
	void setApellidos(String apellidos){
		this.apellidos = apellidos;
	}
	
	static int getContador(){
		return contador;
	}

}
