package practica1;

/**
 * @author Raúl Blanco Rama
 */

public class Biblioteca {

	private Mp3[] biblioteca = new Mp3[1000];
	
	public boolean addSong(Mp3 cancion) {
		for (int i = 0; i < biblioteca.length; i++) {
			if (biblioteca[i] == null){
				biblioteca[i] = cancion;
				System.out.println("Se ha introducido la canción " + cancion.getNombre() + " - " + cancion.getArtista()
				+ "\nen la posición " + i + " de la biblioteca.");
				return true;
			}
		}
		return false;
	}
	
	public Mp3 getSong(int id) {
		for (int i = 0; i < biblioteca.length; i++) {
			if (biblioteca[i].getID() == id){
				return biblioteca[i];
			}
		}
		return null;
	}
	
	public boolean updateSong(Mp3 m, int pos) {
		if (pos >= 0 && pos < biblioteca.length){
			biblioteca[pos] = m;
			System.out.println("Se ha actualizado la canción en la posición " + pos);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean delSong(int id) {
		for (int i = 0; i < biblioteca.length; i++){
			if (biblioteca[i] != null && biblioteca[i].getID() == id){
				biblioteca[i] = null;
				System.out.println("Se ha eliminado la canción de la posición " + i);
				return true;
			}
		}
		return false;
	}
	
	public int busqueda(String nombre){
		for (int i = 0; i < biblioteca.length; i++) {
			if (biblioteca[i]!=null && biblioteca[i].getNombre().equals(nombre)){
				return i;
			}
		}
		return -1;
	}
	
	public int buscaPrimerAlfa(){
		
		int posMin = -1;
		
		for (int i = 0; i < biblioteca.length; i++) {
			if (biblioteca[i] != null){
				posMin = i;
				break;
			}
		}
		
		for (int i = (posMin + 1); i < biblioteca.length; i++) {
			if (posMin == 0){
				break;
			}
			if (biblioteca[i] != null && biblioteca[i].getNombre().compareTo(biblioteca[posMin].getNombre()) < 0){
				posMin = i;
			}
		}
		
		return posMin;
	}
	
	public void mostrar(){
		for (int i = 0; i < biblioteca.length; i++) {
			if (biblioteca[i]!=null){
				System.out.println("Pos: " + i + " | " + biblioteca[i].toString());
			}
		}
	}
	
	public void ordenar() {
		Mp3 aux;
		for (int i = 0; i < biblioteca.length; i++) {
			if (biblioteca[i] != null){
				for (int j = i + 1; j < biblioteca.length; j++) {
					if (biblioteca[j] != null && biblioteca[j].getNombre().compareTo(biblioteca[i].getNombre()) < 0) {
						aux = biblioteca[i];
						biblioteca[i] = biblioteca[j];
						biblioteca[j] = aux;
					}
				}
			}
		}
	}
	
	public void compactar() {
		for (int i = 0; i < biblioteca.length; i++) {
			if (biblioteca[i] == null){
				for (int j = i + 1; j < biblioteca.length; j++) {
					if (biblioteca[j] != null) {
						biblioteca[i] = biblioteca[j];
						biblioteca[j] = null;
						break;
					}
				}
			}
		}
	}
	
}
