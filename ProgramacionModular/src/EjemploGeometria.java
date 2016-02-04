/**
 * @author Raúl Blanco
 */
import java.util.Scanner;

public class EjemploGeometria {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double base,altura;
		
		System.out.print("Base del triángulo: ");
		base = entrada.nextDouble();
		System.out.print("Altura del triángulo: ");
		altura = entrada.nextDouble();
		
		double lado1, lado2, lado3;
		System.out.print("Lado 1 del triángulo: ");
		lado1 = entrada.nextDouble();
		System.out.print("Lado 2 del triángulo: ");
		lado2 = entrada.nextDouble();
		System.out.print("Lado 3 del triángulo: ");
		lado3 = entrada.nextDouble();
		
		System.out.println("El área del triángulo es: " + 
				areaTriangulo(base, altura));
		
		System.out.println("El perímetro del triángulo es " + perimetroTriangulo(lado1, lado2, lado3));
		
		entrada.close();
		
	}
	
	static double areaTriangulo(double base, double altura){
		double area;
		area = base*altura/2;
		return area;
	}
	
	static double perimetroTriangulo(double lado1,double lado2,double lado3){
		double resultado;
		resultado = lado1 + lado2 + lado3;
		return resultado;
	}
	
	

}