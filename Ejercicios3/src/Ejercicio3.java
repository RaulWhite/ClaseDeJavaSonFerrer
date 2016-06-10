/**
 * @author Raúl Blanco Rama
 */
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int suma1 = (int) (Math.random()*100+1);
		int suma2 = (int) (Math.random()*100+1);
		
		int respuesta = 0;
		
		while (true){
			System.out.print("¿Cuánto es " + suma1 + " + " + suma2 + "?: ");
			respuesta = entrada.nextInt();
			
			if ((suma1 + suma2) == respuesta) {
				System.out.println("CORRECTO");
				break;
			}else{
				System.out.println("Prueba de nuevo.\n");
			}
		}
		
		entrada.close();
		
	}
	
}
