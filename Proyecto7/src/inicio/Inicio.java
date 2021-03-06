package inicio;

import algebra.Polinomio;

/**
 * @author Raúl Blanco Rama
 */

public class Inicio {

	public static void main(String[] args) {
		 
//		Polinomio p = new Polinomio(new double[] {3, -2, 5, 1});
//		Polinomio q = new Polinomio(new double[] {2, 0, 3, 10});
//		
//		System.out.println(p.toString());
//		
//		System.out.println(p.evaluar(2));
//		
//		System.out.println(p.sumar(q).toString());
		
		final int NUM_OBJETOS = 1000000;
		
		Polinomio arrayObjetos[] = new Polinomio[NUM_OBJETOS];
		
		System.out.println("Creando objetos (Ronda 1) ...");
		for (int i = 0; i < NUM_OBJETOS; i++){
			arrayObjetos[i] = new Polinomio();
		}
		
		System.out.println("Desubicando objetos (Ronda 1) ...");
		for (int i = 0; i < NUM_OBJETOS; i++){
			arrayObjetos[i] = null;
		}
		
		System.out.println("Creando objetos (Ronda 2) ...");
		for (int i = 0; i < NUM_OBJETOS; i++){
			arrayObjetos[i] = new Polinomio();
		}
		
		System.out.println("Desubicando objetos (Ronda 2) ...");
		for (int i = 0; i < NUM_OBJETOS; i++){
			arrayObjetos[i] = null;
		}
		
	}
	
}
