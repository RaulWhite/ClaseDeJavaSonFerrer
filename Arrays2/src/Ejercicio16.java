/**
 * @author Raúl Blanco Rama
 */
import java.util.Scanner;
public class Ejercicio16 {

	public static void main(String[] args) {
		
		String alumnos[][] = new String [3][4];
		String aux = "";
		Scanner	entrada = new Scanner(System.in);
		float nota;
		
		for (int i=0; i<alumnos.length; i++){
			System.out.println("Alumno " + (i+1));
			System.out.println("=================");
			
			for (int j=0; j<alumnos[i].length; j++){
				
				switch (j) {
				case 0:
					aux = "Nombre: ";
					break;
				case 1:
					aux = "Exámenes: ";
					break;
				case 2:
					aux = "Trabajos: ";
					break;
				case 3:
					aux = "Actitud: ";
					break;
				}
				
				System.out.print(aux);
				alumnos[i][j] = entrada.nextLine();
				
			}
			
			System.out.println();
			
		}
		
		System.out.println("Nota de evaluación");
		System.out.println("==================");
		
		for (int k = 0; k<alumnos.length; k++){
			
			nota = (0.5F*(Float.parseFloat(alumnos[k][1])) + 0.4F*(Float.parseFloat(alumnos[k][2])) + 0.1F*Float.parseFloat(alumnos[k][3]));
			System.out.println(alumnos[k][0] + ": " + nota);
			
		}
		
		entrada.close();
		
	}
	
}
