package auxiliar;

import java.util.Scanner;

/**
 * @author Raúl Blanco Rama
 */

public class Grupo {

	// Atributos
	private String nivel;
	private int curso;
	private String clase;
	
	// Constructores
	public Grupo(){
		
	}
	
	public Grupo(String nivel, int curso, String clase) {
		this.nivel = nivel;
		this.curso = curso;
		this.clase = clase;
	}
	
	// Métodos
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	public int getCurso() {
		return curso;
	}
	public void setCurso(int curso) {
		this.curso = curso;
	}
	public String getClase() {
		return clase;
	}
	public void setClase(String clase) {
		this.clase = clase;
	}
	
	public String toString() {
		return curso + "º de " + nivel + ".\n"
				+ "Clase: " + clase;
	}
	
	public void leeDatos(){
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Nivel: ");
		this.nivel = entrada.nextLine();
		
		System.out.print("Curso: ");
		this.curso = entrada.nextInt();
		entrada.nextLine();
		
		System.out.print("Clase: ");
		this.clase = entrada.nextLine();
		
	}
	
}
