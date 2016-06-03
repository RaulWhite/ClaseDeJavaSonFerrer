package ejemplo1;
/**
 * @author Raúl Blanco Rama
 */
public class Empleado extends Persona {

	private int categoriaEmpleado;

	public int getCategoriaEmpleado() {
		return categoriaEmpleado;
	}

	public void setCategoriaEmpleado(int categoriaEmpleado) {
		this.categoriaEmpleado = categoriaEmpleado;
	}

	@Override
	public void mostrar() {
		super.mostrar();
		System.out.println("Categoría de empleado: " + categoriaEmpleado);
	}

	/*@Override
	public void darDeAlta() {
		
	}*/
}