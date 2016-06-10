package ejemplo1;
/**
 * @author Raúl Blanco Rama
 */
public class Main {
	public static void main(String[] args) {
		
		Persona p = new Cliente();

		p.setNombre("Carlos");
		p.setApellidos("Sogorb");
		p.setDni("87128162T");

		p.mostrar();
		
		System.out.println();

		Persona p1;
		
		p1 = new Cliente();

		p1.setNombre("Raúl");
		p1.setApellidos("Blanco");
		p1.setDni("87128162T");

		p1.mostrar();
		
		System.out.println();
		
		Cliente c = new Cliente();
		c.setNombre("Pepe");
		c.setApellidos("García");
		c.setDni("27263572H");
		c.setVisa("6251-6127-1211-1213");
		
		c.mostrar();
		
		System.out.println();

		Empleado e = new Empleado();
		e.setDni("2328392");
		e.setNombre("Pablo");
		e.setApellidos("Sánchez");
		e.setCategoriaEmpleado(1);
		
		e.mostrar();
		
		System.out.println();
		
		String cadena = "Hola";
		System.out.println(p.equals(cadena));
		
	}
}