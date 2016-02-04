/**
 * @author Raúl Blanco Rama
 * 
 * Programa que lea el nombre y precio de tres artículos
 * y los actualice añadiéndoles el 21% de IVA a todos.
 * Finalmente mostrará una lista con los nombre y precios
 * actualizados a todos. 
 */
import java.util.Scanner;

public class EjemploArraysBidimensionales3 {

	public static void main(String[] args) {
		
		String precios[][] = new String[3][2];
		Scanner entrada = new Scanner(System.in);
		float aux = 0;
		
		for (int i = 0; i<precios.length; i++){
			System.out.print("Nombre del producto " + (i+1) + ": ");
			precios[i][0] = entrada.nextLine();
			
			System.out.print("Precio del producto " + (i+1) + ": ");
			aux = Float.parseFloat(entrada.nextLine());
			
			precios[i][1] = String.valueOf(aux*1.21);
			
			System.out.println();
		}
		
		System.out.println("Listado de precios (con IVA)");
		System.out.println("============================");
		for (int j = 0; j<precios.length; j++){
			System.out.println(precios[j][0] + "\t|\t" + precios[j][1] + "€");
			System.out.println("----------------------------");
		}
		
		entrada.close();
		
	}
	
}
