package refactorizar;
/**
 * @author Raúl Blanco Rama
 */
public class Ejercicio01 {

	public static void main(String[] args) {
		
		int edades[] = {20, 25, 30, 28, 39, 42, 30, 29, 28, 21, 60, 55, 20, 19};
				
		if (buscarEdad(edades) == true){
			System.out.println("Localizada persona de 35 años.");
		} else {
			System.out.println("No se ha encontrado una persona de 35 años.");
		}
		
	}
	
	//Función que recorre el array y devuelve true si encuentra un 35.
	
	static boolean buscarEdad(int[] eds){
		int i = 0;
		boolean edadEncontrada = false;
		
		while (i<eds.length && edadEncontrada == false){
			if (eds[i] == 35){
				edadEncontrada = true;
			}
			i++;
		}
		
		return edadEncontrada;
	}
	
}
