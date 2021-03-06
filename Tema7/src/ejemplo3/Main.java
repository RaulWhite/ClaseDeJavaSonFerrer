package ejemplo3;

/**
 * @author Raúl Blanco Rama
 */

public class Main {

	public static void main(String[] args) {
		
		Circulo c = new Circulo();
		
		c.mostrar();
		
		Figura2D unaFigura; // En esta variable podremos colocar un objeto cuya clase implemente la interfaz Figura2D
		
//		unaFigura = new Circulo();
//		unaFigura = new Rombo();		// Solo tendrán los métodos de la interfaz del tipo de objeto, a no ser que se use un cast
//		unaFigura = new Cuadrado();
		
		Figura2D unCuadrado = new Cuadrado();
		
		((Cuadrado)unCuadrado).mostrar();
		
		// Pruebas usando una interfaz para almacenar constantes
		
		int diaCita;
		diaCita = DiasSemana.MARTES;
		
		System.out.println(diaCita);
		
	}
	
}
