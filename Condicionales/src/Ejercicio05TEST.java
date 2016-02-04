
public class Ejercicio05TEST {

	public static void main(String[] args) {
		
		byte mes = -5;
		
		while (mes < 20) {
			
			System.out.println("\n" + mes);
		
			if (mes >= 1 && mes <= 12) {
				
				System.out.println("Mes correcto.");
				
			} else {
				
				System.out.println("Mes no válido.");
				
			}
			
			mes++;
		
		}
		
	}

}
