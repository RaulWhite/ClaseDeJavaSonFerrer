package auxiliar;

import java.util.Scanner;

/**
 * @author Raúl Blanco Rama
 */

public class Alumno {

	// Atributos
	private int numExpediente;
	private String apellidos;
	private String nombre;
	private Grupo grupo;
	
	// Constructores
	public Alumno(){
		
	}
	
	public Alumno(int numExpediente, String apellidos, String nombre, Grupo grupo){
		this.numExpediente = numExpediente;
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.grupo = grupo;
	}

	// Métodos
	
	public int getNumExpediente() {
		return numExpediente;
	}

	public void setNumExpediente(int numExpediente) {
		this.numExpediente = numExpediente;
	}
	
	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
	
	public String toString(){
		return ("" + nombre + " " + apellidos + ". " + grupo.toString());
	}
	
	public void leeDatos(Grupo grupo){
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Número de expediente del alumno: ");
		this.numExpediente = entrada.nextInt();
		
		System.out.print("Nombre del alumno: ");
		this.nombre = entrada.nextLine();
		
		System.out.print("Apellidos del alumno: ");
		this.apellidos = entrada.nextLine();
		
		this.grupo = grupo;
		
	}
	
}
