package practica1;

/**
 * @author Raúl Blanco Rama
 */

public abstract class Medio {

	private int id;
	private String nombre;
	private double duracion;
	
	public abstract void reproducir();
	
	public Medio(){
		
	}
	
	public Medio(int id, String nombre, double duracion){
		this.id = id;
		this.nombre = nombre;
		this.duracion = duracion;
	}
	
	public int getID() {
		return id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getDuracion() {
		return duracion;
	}
	
	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}
	
}
