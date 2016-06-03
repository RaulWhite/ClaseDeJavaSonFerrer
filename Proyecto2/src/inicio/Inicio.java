/**
 * @author Raúl Blanco Rama
 */

package inicio;
import java.util.Scanner;
import conversion.Conversor;

public class Inicio {

	public static void main(String[] args) {
				
		Scanner entrada = new Scanner(System.in);
		System.out.print("KM: ");
		double km = entrada.nextDouble();
		
		double millas = Conversor.millas(km);
		System.out.println(km + " km son " + millas + " millas.");

		System.out.print("Millas: ");
		millas = entrada.nextDouble();
		
		km = Conversor.km(millas);
		System.out.println(millas + " millas son " + km + " km.");
		
		entrada.close();
		
	}
	
}
