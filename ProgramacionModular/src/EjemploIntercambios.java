/**
 * @author Raúl Blanco Rama
 */
public class EjemploIntercambios {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		intercambio(num1, num2);
		
		System.out.println(num1 + " " + num2);
		
		int numeros1[] = {21, 34, 10, 10};
		int numeros2[] = {1, 5, 3, 0};
		
		intercambio(numeros1, numeros2);
		
		System.out.println(numeros1[0] + " " + numeros2[0]);
		
	}
	
	static void intercambio(int a, int b){
		int aux;
		aux = a;
		a = b;
		b = aux;
	}
	
	static void intercambio(int a[], int b[]){
		int aux;
		aux = a[0];
		a[0] = b[0];
		b[0] = aux;
	}
	
}
