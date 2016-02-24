/**
 * @author Raúl Blanco Rama
 */
package biblioteca;

public class Autor {

	// Atributos
	private String nombre;
	private String email;
	private String fechaNacimiento;
	
	// Constructores
	public Autor(){
		
	}
	
	public Autor(String nombre, String email, String fechaNacimiento){
		this.nombre = nombre;
		this.email = email;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public Autor(String nombre){
		this(nombre, "Unknown", "0");
	}
	
	public String getNombre(){
		return nombre;	
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public String getEmail(){
		return email;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public String getFechaNacimiento(){
		return fechaNacimiento;
	}
	
	public void setFechaNacimiento(String fechaNacimiento){
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public String toString(){
		return ("Nombre: " + nombre
				+ "\nCorreo electrónico: " + email
				+ "\nFecha de nacimiento: " + fechaNacimiento);
	}
	
}
