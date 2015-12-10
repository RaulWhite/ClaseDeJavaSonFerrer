import java.util.Scanner;

public class Ejemplo3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String invitados[] = new String[5];
		
		for (int i = 0; i < invitados.length; i++){
			System.out.print("Invitado " + (i+1) + ": ");
			invitados[i] = entrada.nextLine();
		}
		
		System.out.println("\nLista de invitados");
		System.out.println("==================");
		
		for (int i = 0; i < invitados.length; i++) {
			System.out.println((i+1) + ". " + invitados[i]);
		}
		
		entrada.close();
		
	}
	
}
