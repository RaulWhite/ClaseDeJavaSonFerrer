package leccion01;
/**
 * @author Raúl Blanco Rama
 */
public class Principal {

	public static void main(String[] args) {
		
		Persona p;  // Declarar una variable de tiopo Persona
		p = new Persona();  // Crear un objeto Persona y asignarlo a p.
		// Es lo mismo que 'Persona p = new Persona()'
		p.dni = "12345678A";
		p.nombre = "Pepe";
		p.apellidos = "Martínez Ruiz";
		p.peso = 70;
		p.edad = 25;
		
		Persona cliente = new Persona();
		cliente.dni = "87654321Z";
		cliente.nombre = "Pablo";
		cliente.apellidos = "Menéndez Pérez";
		cliente.peso = 90;
		cliente.edad = 70;
		
		Persona p2 = new Persona("45671234C", "Nuria", "Sánchez", 60, 30);
		
		Persona p3 = new Persona("Fernando", "Mariano");
		
		p.mostrar();
		System.out.println();
		cliente.mostrar();
		System.out.println();
		p2.mostrar();
		System.out.println();
		p3.mostrar();
		System.out.println();
		
		p.hola();
		System.out.println();
		cliente.hola();
		System.out.println();
		
		cliente.cumplirAnyos();
		System.out.println("¡FELIZ CUMPLEAÑOS!");
		System.out.println("Ahora " + cliente.nombre + " tiene " + cliente.edad + " años.");
		System.out.println();
		
		System.out.println(p.nombre + " tiene " + p.getEdad() + " años.");
		
	}
	
}
