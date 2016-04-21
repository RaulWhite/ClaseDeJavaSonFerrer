package practica1;

/**
 * @author Raúl Blanco Rama
 */

public class Biblioteca {

	private Mp3[] biblioteca = new Mp3[1000];
	
	public void addSong(Mp3 cancion) {
		for (int i = 0; i < biblioteca.length; i++) {
			if (biblioteca[i] == null){
				biblioteca[i] = cancion;
				System.out.println("Se ha introducido la canción " + cancion.getNombre() + " - " + cancion.getArtista()
				+ "\nen la posición " + i + " de la biblioteca.");
				break;
			}
		}
	}
	
	public Mp3 getSong(int id) {
		for (int i = 0; i < biblioteca.length; i++) {
			if (biblioteca[i].getID() == id){
				return biblioteca[i];
			}
		}
		return null;
	}
	
	public void updateSong(Mp3 m, int pos) {
		biblioteca[pos] = m;
		System.out.println("Se ha actualizado la canción en la posición " + pos);
	}
	
	public void delSong(int id) {
		for (int i = 0; i < biblioteca.length; i++){
			if (biblioteca[i].getID() == id){
				biblioteca[i] = null;
				System.out.println("Se ha eliminado la canción de la posición " + i);
				break;
			}
		}
	}
	
	public int busqueda(String nombre){
		for (int i = 0; i < biblioteca.length; i++) {
			if (biblioteca[i].getNombre().equals(nombre)){
				return i;
			}
		}
		return -1;
	}
	
}
