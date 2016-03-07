/**
 * @author Raúl Blanco Rama
 */
package Poker;

public class Carta {

	// Atributos
		private int valor;
		private int palo;

		// Constructores
		public Carta(int valor, int palo) {
			if (valor >= 1 && valor <= 13 && palo >= 0 && palo <= 3) {
				this.valor = valor;
				this.palo = palo;
			}
		}

		// Métodos
		public boolean compara(Carta otraCarta) {
			if (otraCarta.valor == valor && otraCarta.palo == palo) {
				return true;
			}

			return false;
		}

		public String toString() {
			String p = ""; // Palo expresado como palabra.
			switch (palo) {
			case 0:
				p = "Diamantes";
				break;
			case 1:
				p = "Corazones";
				break;
			case 2:
				p = "Picas";
				break;
			case 3:
				p = "Tréboles";
				break;
			}
			return valor + " de " + p;
		}

		// Métodos de acceso
		public int getValor() {
			return valor;
		}

		public void setValor(int valor) {
			this.valor = valor;
		}

		public int getPalo() {
			return palo;
		}

		public void setPalo(int palo) {
			this.palo = palo;
		}

	}