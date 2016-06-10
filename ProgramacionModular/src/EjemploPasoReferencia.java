/**
 * @author Raúl Blanco Rama
 */
public class EjemploPasoReferencia {

	public static void main(String[] args) {
		
		String[] colores = {"Rojo", "Verde", "Magenta", "Amarillo"};
		
		muestraColores(colores);
	}
	static void muestraColores(String[] c){
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		//Cambiamos un valor del array
		c[2] = "Verde";
		System.out.println("El tercer valor del array c es " + c[2]);
	}

}
