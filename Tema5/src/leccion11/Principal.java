package leccion11;

/**
 * @author Raúl Blanco Rama
 */

public class Principal {

	public static void main(String[] args) {
		Persona p1 = new Persona();
		
		p1.setDni("100120912U");
		System.out.println(p1.getDni());
		
		p1.setNombre("Perico");
		p1.setApellidos("de los Palotes");
		System.out.println(p1.getNombre() + " " + p1.getApellidos());
		
		System.out.println(Persona.getContador());
		
		Persona p2 = new Persona();
		
		p2.setDni("100120912U");
		System.out.println(p2.getDni());
		
		p2.setNombre("Perico");
		p2.setApellidos("de los Palotes");
		System.out.println(p2.getNombre() + " " + p2.getApellidos());
		
		System.out.println(Persona.getContador());
		
	}

}
