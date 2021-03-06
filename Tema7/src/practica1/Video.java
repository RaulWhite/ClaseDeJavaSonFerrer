package practica1;

/**
 * @author Raúl Blanco Rama
 */

public class Video extends Medio {

	private String director;
	private String idioma;
	
	public Video(){
		
	}
	
	public Video(int id, String nombre, double duracion, String direrctor, String idioma) {
		super(id, nombre, duracion);
		this.director = director;
		this.idioma = idioma;
	}
	
	public String getDirector() {
		return director;
	}
	
	public void setDirector(String director) {
		this.director = director;
	}
	
	public String getIdioma() {
		return idioma;
	}
	
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	@Override
	public void reproducir() {
		System.out.println("Reproduciendo " + getNombre());
	}
	
}
