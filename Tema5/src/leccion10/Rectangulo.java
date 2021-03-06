package leccion10;

/**
 * @author Raúl Blanco Rama
 */

public class Rectangulo {

	// Atributos
	int x, y; // Posición del vértice superior izquierdo
	int ancho, alto; // Ancho y alto del rectángulo (píxeles)
	int contador;
	
	// Método constructor
	Rectangulo(){
		contador++;
	}
	
	Rectangulo(int x, int y, int ancho, int alto){
		this.x = x;
		this.y = y;
		this.alto = alto;
		this.ancho = ancho;
		contador++;
	}
	
	Rectangulo(int x, int y){
		this(x, y, 50, 50);
	}
	
	Rectangulo(int x, int y, int lado){
		this(x, y, lado, lado);
	}
	
	// Métodos
	int area(){
		return (alto * ancho);
	}
	
	int perimetro(){
		return ((alto + ancho) * 2);
	}
	
	void mostrar(){
		System.out.println("Coordenadas: (" + x + ", " + y + ")");
		System.out.println("Dimensiones: " + ancho + " x " + alto + " px.");
	}
	
	void mover(int dx, int dy){
		x = dx + x;
		y = dy + y;
	}
	
	boolean puntoInterior(int x1, int y1){		
		if (x <= x1 && (x+ancho) >= x1 && y <= y1 && (y+alto) >= y1){
			return true;
		} else {
			return false;
		}
	}
	
}