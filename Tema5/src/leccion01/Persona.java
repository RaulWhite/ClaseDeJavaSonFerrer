package leccion01;
/**
 * @author Raúl Blanco Rama
 */
public class Persona {

	// Atributos
	String dni;
	String nombre;
	String apellidos;
	int edad;
	double peso;
	
	// Método constructor
	Persona(){
		
	}

	Persona(String dni, String nombre, String apellidos, int edad, double peso) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.peso = peso;
	}
	
	Persona(String nombre, String apellidos){
		this("00000000A", nombre, apellidos, 18, 70);
	}
	
	// Métodos
	void mostrar(){
		System.out.println("DNI: " + dni);
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("Edad: " + edad + " años");
		System.out.println("Peso: " + peso + " kg.");
	}
	
	void hola(){
		System.out.println("Hola, soy " + nombre + " " + apellidos + ".");
	}
	
	void cumplirAnyos(){
		edad++;
	}
	
	int getEdad(){
		return edad;
	}
		
}
