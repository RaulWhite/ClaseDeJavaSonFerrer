import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Nota: ");
		float nota = teclado.nextFloat();
		
		if (nota < 4) {
			System.out.println("Rojo");
		}else if (nota >= 4 && nota < 5){
			System.out.println("Verde");
		}else if (nota >= 5){
			System.out.println("Azul");
		}else{
			System.out.println("ERROR");
		}
		
		teclado.close();
		
	}
	
}
