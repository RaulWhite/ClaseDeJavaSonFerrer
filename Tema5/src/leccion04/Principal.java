package leccion04;

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
		
	}

}