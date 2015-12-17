/**
 * @author Raúl Blanco Rama
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		
		int edades[] = {20, 25, 30, 28, 39, 42, 30, 29, 28, 21, 60, 55, 20, 19};
		boolean edadEncontrada = false;
		int i = 0;
		
		while (i<edades.length && edadEncontrada == false){
			if (edades[i] == 35){
				edadEncontrada = true;
			}
			i++;
		}
		
		if (edadEncontrada == true){
			System.out.println("Localizada persona de 35 años.");
		} else {
			System.out.println("No se ha encontrado una persona de 35 años.");
		}
		
	}
	
}
