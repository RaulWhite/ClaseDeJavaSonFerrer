import java.util.Scanner;

public class Ejercicio20 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		boolean mayorDeEdad;
		
		System.out.print("Edad: ");
		int edad = entrada.nextInt();
		
//		if (edad >=18) {
//			mayorDeEdad = true;
//		}else{
//			mayorDeEdad = false;
//		}
		
		mayorDeEdad = (edad >= 18)?true:false;
		
		System.out.println("Mayor de edad: " + mayorDeEdad);
		
		entrada.close();
		
	}

}
