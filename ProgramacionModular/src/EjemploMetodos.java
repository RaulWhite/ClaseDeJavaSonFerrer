/**
 * @author Raúl Blanco Rama
 */
import java.util.Scanner;

public class EjemploMetodos {

	public static void main(String[] args) {
		
//		System.out.println("Bienvenido a casa.");
//		
//		mayordomo();
//		
//		System.out.println("Tráigame un coñac.");
//		
//		System.out.println("Esta es la tabla del 5:");
//		tabla5();
//		
//		autoenganyo();
		
		// Los métodos que sacan valor se tratan como variables
		
		System.out.println("El cuadrado de 20 es: " + cuadrado(20));
		System.out.println("El cubo de 20.5 es: " + cubo(20.5F));
		System.out.println("20 elevado a 3 da: " + elevar(20, 3));
		
		System.out.println("El volumen de una habitación de 3x4x3 metros es: " + volumen(3, 4, 3) + " metros cúbicos.");
		
	}
	
	static void mayordomo(){
		System.out.println("¿Qué se le ofrece, señor?");
		System.out.println("A su servicio.");
	}
	
	static void tabla5(){
		for (int i=0; i<=10; i++){
			System.out.println("5 x " + i + " = " + i*5);
		}
	}
	
	static void autoenganyo(){
		int edad;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("\n¿Cuántos años tiene? ");
		edad = entrada.nextInt();
		
		System.out.println("No parece que tenga " + edad + " años.");
		
		entrada.close();
	}
	
	static int cuadrado(int numero){
		int resultado = numero*numero;
		return resultado;
	}
	
	static float cubo(float valor){
		float c = valor * valor * valor;
		return c;
	}
	
	static int elevar(int base, int exponente){
		return (int)Math.pow(base, exponente);
	}
	
	static int volumen(int x, int y, int z){
		return (x*y*z);
	}
	
}
