package leccion10;

/**
 * @author Raúl Blanco Rama
 */

public class Cuadrado {

	//Atributos: x, y, lado
	int x, y;
	int lado;
	int contador = 0;
	
	//Constructores
	Cuadrado(){
		contador++;
	}
	
	Cuadrado(int x, int y, int lado){
		this.x = x;
		this.y = y;
		this.lado = lado;
		contador++;
	}
	
	//Métodos: perímetro(), área(), mostrar()
	double perimetro(){
		return(lado*4);
	}
	
	double area(){
		return(Math.pow(lado, 2));
	}
	
	void mostrar(){
		System.out.println("Posición centro: " + x + "px , " + y + "px.");
		System.out.println("Tamaño de un lado: " + lado);
	}
	
}
