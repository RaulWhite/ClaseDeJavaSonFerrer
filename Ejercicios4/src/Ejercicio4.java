/**
 * @author Raúl Blanco Ram
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		
		double temperaturas[] = {3.2, 3.5, 7.2, 0.1, 1, -2.3, -5, 3.4, 4, 4, 4, 1.4, 2.5, -0.4, -3.6};
		int posBajoCero = -1;
		
		for (int i = 0; i < temperaturas.length; i++){
			if (temperaturas[i] < 0){
				posBajoCero = i;
				break;
			}
		}
		
		System.out.println("La primera temperatura bajo cero está en la posición " + (posBajoCero+1));
		if (posBajoCero!=(-1)){
			System.out.println("Temperatua: " + temperaturas[posBajoCero] + "ºC.");
		}
		
	}
	
}
