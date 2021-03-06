/**
 * @author Raúl Blanco Rama
 */
package Poker;

public class Baraja {

	private Carta[] cartas;

	public Baraja() {
		// En este constructor creamos la baraja y la ordenamos.
		cartas = new Carta[52];
		ordenar();
	}

	public void ordenar() {
		// En este método pondremos en cada posición de la baraja la carta
		// ordenada que le corresponda. Como si acabáramos de comprarla.
		int valor = 1;
		int palo = 0;
		for (int i = 0; i < cartas.length; i++) {

			cartas[i] = new Carta(valor, palo);
			if (valor < 13) {
				valor++;
			} else {
				// Cambiamos de palo.
				valor = 1;
				palo++;
			}
		}
	}

	// Mostramos todas las cartas de la baraja.
	public void mostrar() {
		System.out.println("Listado de cartas de la baraja");
		for (int i = 0; i < cartas.length; i++) {
			System.out.println(cartas[i].toString());

		}
	}

	// Sacamos la carta de arriba de la baraja.
	public void extraer() {
		System.out.println("La carta de arriba es el " + cartas[0].toString());
	}

	// Barajamos las cartas. Una manera sencilla es intercambiar, por ejemplo,
	// cien pares de cartas.
	public void barajar() {
		int pos1 = 0, pos2 = 0;
		Carta aux;

		for (int i = 0; i < 200; i++) {
			// Elegimos dos cartas aleatoriamente...
			pos1 = (int) (Math.random() * 52);
			pos2 = (int) (Math.random() * 52);

			// Y las intercambiamos.
			aux = cartas[pos1];
			cartas[pos1] = cartas[pos2];
			cartas[pos2] = aux;
		}
	}

	// Cortamos la baraja.
	public void cortar() {
		// Elegimos una carta al azar.
		int pos = (int) (Math.random() * 52);

		System.out.println("Cortamos por la posición " + pos);

		// Colocamos todas las cartas por debajo en la parte superior de la
		// baraja.
		Carta[] nuevaBaraja = new Carta[52];
		for (int i = 0; i < 52 - pos; i++) {
			nuevaBaraja[i] = cartas[i + pos];
		}

		// Y colocamos el resto de cartas a continuación.
		for (int i = 52 - pos; i < 52; i++) {
			nuevaBaraja[i] = cartas[i - (52 - pos)];
		}

		// Copiamos la nueva baraja en la antigua.
		cartas = nuevaBaraja;
	}
}