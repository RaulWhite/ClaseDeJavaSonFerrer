package leccion08;

/**
 * @author Raúl Blanco Rama
 */

public class Principal {

	public static void main(String[] args) {
		Persona p = new Persona();
		
		p.setDni("100120912U");
		System.out.println(p.getDni());
		
		p.setNombre("Perico");
		p.setApellidos("de los Palotes");
		System.out.println(p.getNombre() + " " + p.getApellidos());
		
		System.out.println(p.getContador());
		
		Persona p2 = new Persona("00000000A", "Yo", "Que Se", 18, 80);
		
		System.out.println(p.getContador());
		
		Persona p3 = new Persona("Pepe", "Martínez");
				
		System.out.println(p.getContador());
		
	}

}