package practica1;

/**
 * @author Raúl Blanco Rama
 */

public class Main {

	public static void main(String[] args) {
		
//		Medio me1 = new Medio();
		Mp3 mp1 = new Mp3(1, "Welcome to the Jungle", 240, "Guns n' Roses", "Rock", 1);
		Ogg o1 = new Ogg(2, "Highway to Hell", 300, "AC/DC", "Rock", 3);
		
		Medio m1 = new Mp3(3, "Welcome to the Jungle", 240, "Guns n' Roses", "Rock", 1);
		
		m1.reproducir();
		((Mp3)m1).guardar();
		
		Mp3 mpalgo = (Mp3)m1;
		mpalgo.guardar();
		
		Guardable g1 = new Ogg(4, "Highway to Hell", 300, "AC/DC", "Rock", 3);
		g1.guardar();
		
		Biblioteca biblio = new Biblioteca();
		biblio.addSong(mp1);
		biblio.addSong(mp1);
		biblio.addSong(mp1);
		biblio.addSong(mp1);
		biblio.addSong(mp1);
		biblio.addSong(mp1);
		
		System.out.println((biblio.getSong(1)).getNombre());
		
	}
	
}