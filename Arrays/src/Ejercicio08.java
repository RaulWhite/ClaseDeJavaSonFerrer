import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double notas[] = new double[10];
		
		int i = 0;
		
		while (i < notas.length){
			System.out.print("Nota " + (i+1) + ": ");
			notas[i] = entrada.nextDouble();
			
			if (notas[i] < 0) {
				break;
			}
			
			i++;
		}
		
		System.out.println("\nNotas");
		System.out.println("=====");
		
		for (int j = 0; j < notas.length; j++){
			System.out.println("  Nota " + (j+1) + ": " + notas[j]);
		}
		
		entrada.close();
		
	}
	
}
