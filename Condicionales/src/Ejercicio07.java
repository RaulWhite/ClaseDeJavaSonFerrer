import java.util.Scanner;

public class Ejercicio07 {

	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		final int NUMERO_SECRETO = 4;
		int numero;
		
		System.out.println("Escribe el número: ");
		numero = entrada.nextInt();
		
		if(numero == NUMERO_SECRETO){
			System.out.println("Bien, has acertado.");
		}
		else{
			System.out.println("Has fallado.");
		}
		
		entrada.close();
		
	}

}
