/**
 * @author Raúl Blanco Rama
 */
public class PracticaCadenas {

	public static void main(String[] args) {
		
		String miPalabra = "Ordenador";
		
		// Ejemplo del método length()
		System.out.println("El número de caracteres de la palabra "	+ miPalabra + " es " + miPalabra.length());

		// Ejemplo del método charAt()
		System.out.println("El caracter en la posición 4 (3 si la primera es 0) de la palabra " + miPalabra + " es " + miPalabra.charAt(3));
		
		// Ejemplo del método replace()
		System.out.println("Si en la palabra " + miPalabra + " se cambian las r por s, quedaría así: " + miPalabra.replace("r", "s"));
		
		// Ejemplo del método indexOf()
		System.out.println("Siendo 0 la primera posición, la primera letra r de " + miPalabra + " está en la posición " + miPalabra.indexOf("r"));
		
		// Ejemplo del método lastIndexOf()
		System.out.println("Siendo 0 la primera posición, la última letra r de " + miPalabra + " está en la posición " + miPalabra.lastIndexOf("r"));
		
		// Ejemplo del método compareTo()
		System.out.println("Entre la palabra Ordenadores y " + miPalabra + " hay una diferencia de " + miPalabra.compareTo("Ordenadores") + " letras");
		
		// Ejemplo del método substing()
		System.out.println("Si de la palabra " + miPalabra + " se eliminan las 4 primeras letras, quedaría en " + miPalabra.substring(4));

		// Ejemplo del método split()
		String mi2aPalabra = "Ordenador-PC";
		String misPalabras[] = mi2aPalabra.split("-");
		System.out.println("Si tenemos la pabra " + mi2aPalabra + ", podemos separarla en dosvariables por el guión: " + misPalabras[0] + ", " + misPalabras[1]);
		
		// Ejemplo del método String.valueOf()
		char array[] = {'P', 'C'};
		double precio = 499.99;
		System.out.println("El precio de un " + String.valueOf(array) + " es de " + String.valueOf(precio));
		
		// Ejemplo del método Integer.parseInt(texto)
		String lista[] = {"Ordenador", "500"};
		int descuento = ((Integer.parseInt(lista[1]))/100)*90;
		System.out.println("Con un 10% de descuento, el " + lista[0] + " vale " + descuento + " euros.");
		
	}
	
}
