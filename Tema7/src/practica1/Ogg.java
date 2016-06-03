package practica1;

/**
 * @author Raúl Blanco Rama
 */

public class Ogg extends Musica implements Guardable {

	private int version;
	
	public Ogg(){
		
	}
	
	public Ogg(int id, String nombre, double duracion, String artista, String estilo, int version) {
		super(id, nombre, duracion, artista, estilo);
		this.version = version;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Override
	public boolean guardar() {
		System.out.println("Guardando...");
		return true;
	}
	
}
