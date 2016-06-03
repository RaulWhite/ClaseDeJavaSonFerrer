/**
 * @author Raúl Blanco Rama
 */
public class EjemploPasoValor {

	public static void main(String[] args) {
		
		int valor = 10;
		
		doblar(valor);
		
		System.out.println("Valor es " + valor);

	}
	static void doblar(int num){
		System.out.println("El doble de " + num + " es " + 2 * num);
		num = 2 * num;
			System.out.println("La variable num ahora es " + num);
	}

}
