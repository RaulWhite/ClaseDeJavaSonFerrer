package leccion02;
/**
 * @author Raúl Blanco Rama
 */
public class Main {

	public static void main(String[] args) {
		
		Punto p = new Punto();
		
		p.x = 50;
		p.y = 100;
		p.color = "Rojo";
		p.transparencia = 0.5;
		p.visible = true;
		
		p.mostrar();
		
	}
	
}
