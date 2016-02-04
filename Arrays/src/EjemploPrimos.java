
public class EjemploPrimos {
	
	public static void main(String[] args) {
		
		int[] primos = new int[100000];
		primos[0] = 2;
		
		int numPrimos = 1;
		int candidato = 3;
		boolean esPrimo = true;
		
		int i;
		System.out.println("Calculando números primos ...");
		
		long tiempoInicio = System.currentTimeMillis();
		
		// Vamos a buscar números primos hasta llenar el array.
		while (numPrimos < primos.length) {
			// Dividimos el número candidato entre todos los anteriores
			// empezando por 2.
			i = 2;
			esPrimo = true;
			while (i < candidato && esPrimo == true) {
				if (candidato % i == 0) {
					esPrimo = false;
				}
				i++;
			}
			// Si hemos comprobado que el número es primo, lo añadimos al
			// array.
			if (esPrimo == true) {
				primos[numPrimos] = candidato;
				System.out.println(numPrimos + " --> " + candidato);
				numPrimos++;
			}
			// En la siguiente pasada del bucle probaremos si el siguiente
			// número es primo.
			candidato++;
		}
		
		double tiempoTranscurrido = (double)(System.currentTimeMillis() - tiempoInicio);
		System.out.println("\nTiempo de ejecución:\n" + ((double)(tiempoTranscurrido / 1000)) + " segundos");
		
	}
}