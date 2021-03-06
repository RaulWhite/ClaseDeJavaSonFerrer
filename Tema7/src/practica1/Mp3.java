package practica1;

/**
 * @author Raúl Blanco Rama
 */

public class Mp3 extends Musica implements Guardable {

	public Mp3(){
		
	}
	
	public Mp3(int id, String nombre, double duracion, String artista, String estilo, int modo) {
		super(id, nombre, duracion, artista, estilo);
		this.modo = modo;		
	}

	private int modo;

	public int getModo() {
		return modo;
	}

	public void setModo(int modo) {
		this.modo = modo;
	}

	@Override
	public boolean guardar() {
		System.out.println("Guardando...");
		return true;
	}
	
	@Override
	public String toString(){
		return ("ID: " + this.getID() + ". " + this.getNombre() + " - " + this.getArtista());
	}
	
}
