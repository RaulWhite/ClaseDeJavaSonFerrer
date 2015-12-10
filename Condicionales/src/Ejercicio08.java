import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("¿Cómo se dice en inglés ordenador?");
		String palabra = entrada.next();
		
		palabra = palabra.toLowerCase();
		
		if(palabra.equals("computer")){
			System.out.println("La palabra es correcta.");
		}
		else{
			System.out.println("La palabra no es correcta");
		}
		
		entrada.close();

	}

}
