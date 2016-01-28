/**
 * @author Raúl Blanco Rama
 * 
 * Crear un array donde se guardarán el nombre, apellidos y edad de 5 personas.
 * Leer estos datos desde el teclado.
 * 
 * Mostrarlos todos por pantalla.
 * Calcular la edad media de las cinco personas dentro del array.
 * Encontrar la edad mínima y máxima.
 */
import java.util.Scanner;

public class EjemploArraysBidimensionales6 {

	public static void main(String[] args) {
		
		String gente[][] = new String[5][3];
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i < gente.length; i++){
			System.out.println("Persona " + (i+1));
			System.out.print("Nombre: ");
			gente[i][0] = entrada.nextLine();
			System.out.print("Apellidos: ");
			gente[i][1] = entrada.nextLine();
			System.out.print("Edad: ");
			gente[i][2] = entrada.nextLine();
			System.out.println();
		}

		for (int j = 0; j < gente.length; j++){
			System.out.println((j+1) + ".| " + gente[j][0] + " " + gente[j][1] + " | " + gente[j][2] + " años");
		}
		
		System.out.println();
		
		float media = 0;
		
		for (int k = 0; k < gente.length; k++){
			media = media + (Float.parseFloat(gente[k][2]));
		}
		
		media = media / gente.length;
		
		System.out.println("Media de edad: " + media + " años.");
		
		int min = (Integer.parseInt(gente[0][2])), max = (Integer.parseInt(gente[0][2]));
		
		for (int l = 1; l < gente.length; l++){
			if ((Integer.parseInt(gente[l][2])) < min){
				min = (Integer.parseInt(gente[l][2]));
			}
			if ((Integer.parseInt(gente[l][2])) > max){
				max = (Integer.parseInt(gente[l][2]));
			}
		}
		
		System.out.println("Edad mínima: " + min + " años.");
		System.out.println("Edad máxima: " + max + " años.");
		
		entrada.close();
		
	}
	
}
