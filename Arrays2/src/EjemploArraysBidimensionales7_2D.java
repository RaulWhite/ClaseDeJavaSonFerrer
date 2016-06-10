/**
 * @author Raúl Blanco Rama
 * 
 * Crear un array con los pesos de 10 pacientes.
 * Ordenarlo de menor a mayor.
 */
import java.util.Scanner;

public class EjemploArraysBidimensionales7_2D {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);		
		String pesos[][] = new String[10][2];
		int posMin;
		String auxNombre;
		String auxPeso;
		
		for (int i = 0; i<pesos.length; i++){
			System.out.print("Nombre: ");
			pesos[i][0] = entrada.nextLine();
			
			System.out.print("Peso: ");
			pesos[i][1] = entrada.nextLine();
			
			System.out.println();
		}
		
		for (int j = 0; j<pesos.length; j++){
			posMin = j;
			for (int k = (j + 1); k<pesos.length; k++){
				if (Double.parseDouble(pesos[k][1]) < Double.parseDouble(pesos[posMin][1])){
					posMin = k;
				}
			}
			
			auxNombre = pesos[j][0];
			auxPeso = pesos[j][1];
			
			pesos[j][0] = pesos[posMin][0];
			pesos[j][1] = pesos[posMin][1];
			
			pesos[posMin][0] = auxNombre;
			pesos[posMin][1] = auxPeso;
			
		}	
		
		for (int k = 0; k < pesos.length; k++){
			System.out.println(pesos[k][0] + ": " + pesos[k][1] + "kg");
		}
		
		entrada.close();
		
	}
	
}

