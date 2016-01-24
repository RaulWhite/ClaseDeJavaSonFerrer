/**
 * @author Raúl Blanco Rama
 * 
 * Programa que guarde en un array la lista de meses del año
 * y el número de días que tienen (considerando que febrero tiene 28 días).
 * Después se pedirá al usuario que escriba el nombre de un mes
 * y el programa le responderá con el nombre de días que tiene ese mes,
 * utilizando la tabla. 
 */
import java.util.Scanner;

public class EjemploArraysBidimensionales4 {

	public static void main(String[] args) {
		
		String meses[][] = {{"Enero", "31"}, {"Febrero", "28"}, {"Marzo", "31"}, {"Abril", "30"}, {"Mayo", "31"}, {"Junio", "30"},
							{"Julio", "31"}, {"Agosto", "31"}, {"Septiembre", "30"}, {"Octubre", "31"}, {"Noviembre", "30"}, {"Diciembre", "31"}};
		String mes;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Mes: ");
		mes = entrada.nextLine().toLowerCase();
		
		for (int i = 0; i<meses.length; i++){
			if (mes.equals(meses[i][0].toLowerCase())){
				System.out.println("El mes de " + meses[i][0] + " tiene " + meses[i][1] + " días.");
				break;
			}
			if (i==11){
				System.out.println("Entrada inválida.");
			}
		}
				
		entrada.close();
		
	}
	
}
