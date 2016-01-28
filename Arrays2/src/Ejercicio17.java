/**
 * @author Raúl Blanco Rama
 */
public class Ejercicio17 {

	public static void main(String[] args) {
		
		double temperaturas[][][] = new double[3][3][3];
		
		temperaturas[0][0][1] = 18.2;
		temperaturas[0][1][1] = 19.0;
		temperaturas[1][0][1] = 22.5;
		temperaturas[1][2][1] = 19.5;
		temperaturas[2][0][0] = 21.5;
		
		double suma = 0;
		for (int i = 0; i<temperaturas.length; i++){
			for (int j = 0; j<temperaturas[i].length; j++){
				for (int k = 0; k<temperaturas[i][j].length; k++){
					suma = suma + temperaturas[i][j][k]; 
				}
			}
		}
		
		System.out.println("Suma de las temperaturas: " + suma + "ºC.");
		
		double media = suma/5;
		
		System.out.println("Media de las temperaturas: " + media + "ºC.");
		
	}
	
}
