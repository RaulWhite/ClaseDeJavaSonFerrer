/**
 * @author Raúl Blanco Rama
 */

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);		
		int votos[] = new int[6];
		int i = 0;
		
		do{
			System.out.print("Votos del partido " + (i+1) + ": ");
			votos[i] = entrada.nextInt();
			
			i++;
			
		} while (i<votos.length);
		
		int min = votos[0];
		int max = votos[0];
		int posicionMin = 1, posicionMax = 1;
		
		for (i = 1; i<votos.length; i++){
			
			if (votos[i]<min){
				min = votos[i];
				posicionMin = i+1;
			}
			
			if (votos[i]>max){
				max = votos[i];
				posicionMax = i+1;
			}
			
		}
		
		System.out.println();
		System.out.println("Partido con menos votos: Partido " + posicionMin + " con " + min + " voto(s).");
		System.out.println("Partido con más votos: Partido " + posicionMax + " con " + max + " voto(s).");
		
		entrada.close();
		
	}
	
}
