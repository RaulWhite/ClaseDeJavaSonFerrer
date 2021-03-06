/**
 * @author Raúl Blanco Rama
 */
public class BusquedaBinaria {

	public static void main(String[] args) {

		int numeros[] = {2, 12, 14, 20, 21, 22};		
		
		System.out.println(busqueda(numeros, 12));
		
	}

	public static int busqueda(int[] lista, int num) {
		int i = 0, f = lista.length - 1, m; // Posiciones inicial, media y final en el array
		while (i <= f) {
			m = (i + f) / 2;
			
			if (lista[m] == num) {
				return m; // El número está en la posición m.
			} else if (lista[m] > num) {
				f = m - 1;
			} else {
				i = m + 1;
			}
		}
		return -1;
	}

	public static int busquedaSecuencial(int[] lista, int num) {
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] == num) {
				return i;
			}
		}
		return -1;
	}
}