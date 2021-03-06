/**
 * @author Raúl Blanco Rama
 *
 * Programa que pide dos números decimales y pregunta qué operación queremos hacer con ellos.
 * (Suma, resta, multiplicación, división).
 * A continuación hace la operación y muestra el resultado.
 * 
 * Al menos 5 métodos.
 */
import java.util.Scanner;

public class EjemploAritmetica {

	static double num1, num2;
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Indique el primer número: ");
		num1 = entrada.nextDouble();
		
		System.out.print("Indique el segundo número: ");
		num2 = entrada.nextDouble();
		
		System.out.println("Menú: ");
		System.out.println("1. Suma\n2. Resta\n3. Multiplcar\n4. Dividir");
		System.out.print("\nElige una opción: ");
		System.out.println();
		menu(entrada.nextInt());
		
	}
	
	static void menu(int selec){
		switch (selec){
		case 1:
			suma();
			break;
		case 2:
			resta();
			break;
		case 3:
			mult();
			break;
		case 4:
			divid();
			break;
		default:
			System.out.println("Operación incorrecta");
		}
			
	}
	
	static void suma(){
		System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
	}
	
	static void resta(){
		System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
	}
	
	static void mult(){
		System.out.println(num1 + " x " + num2 + " = " + (num1*num2));
	}
	
	static void divid(){
		System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
	}
	
}
