package refactorizar;
/**
 * @author Raúl Blanco Rama
 */
public class Ejercicio13 {

	public static void main(String[] args) {
		
		double medidas[][] = {{8.5, 1020, 40}, {14.2, 1021, 35}, {11, 1022, 45}, {7, 1023, 50}};
		
		System.out.println("Registros meteorológicos");
		System.out.println("========================");
		
		for (int i = 0; i < medidas.length; i++){
			System.out.println(medidas[i][0] + "\t" + medidas[i][1] + "\t" + medidas[i][2]);
		}
		
	}
	
}
