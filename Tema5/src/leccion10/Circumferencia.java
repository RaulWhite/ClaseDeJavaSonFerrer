package leccion10;

/**
 * @author Raúl Blanco Rama
 */

public class Circumferencia {

	//Atributos: x, y, radio
	int x, y;
	double radio;
	int contador = 0;
	
	//Constructores
	Circumferencia(){
		contador++;
	}
	
	Circumferencia(int x, int y, double radio){
		this.x = x;
		this.y = y;
		this.radio = radio;
		contador++;
	}
	
	Circumferencia(int x, int y){
		this(x, y, 10);
	}
	
	//Métodos: perímetro(), área(), mostrar()
	double perimetro(){
		return(Math.PI*2*radio);
	}
	
	double area(){
		return(Math.PI*Math.pow(radio, 2));
	}
	
	void mostrar(){
		System.out.println("Posición centro: " + x + "px , " + y + "px.");
		System.out.println("Radio: " + radio);
	}
	
	static String formulaArea(){
		return ("Área del círculo = pi * radio al cuadrado");
	}
	
}
