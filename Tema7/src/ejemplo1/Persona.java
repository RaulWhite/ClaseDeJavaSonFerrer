package ejemplo1;
/**
 * @author Raúl Blanco Rama
 */
public /*abstract*/ class Persona {

	private String dni;
	private String nombre;
	private String apellidos;

	public void mostrar() {
		System.out.println("Dni: " + dni + ", Nombre: " + nombre 
				+ ", Apellidos: " + apellidos);
	}

	/*public abstract void darDeAlta();*/
	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	@Override
	public boolean equals(Object o){		
		if(!(o instanceof Persona)){
			return false;
		}
		
		Persona p = (Persona) o;
		
		if (dni.equals(p.getDni())){
			return true;
		} else {
			return false;
		}
	}
	
}