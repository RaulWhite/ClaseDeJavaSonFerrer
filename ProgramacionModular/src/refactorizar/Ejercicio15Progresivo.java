package refactorizar;
/**
 * @author Raúl Blanco Rama
 */
public class Ejercicio15Progresivo {

	public static void main(String[] args) {
		
		String precios[][] = {{"Tablet Samsung", "120"}, {"Móvil Sony", "115"}, {"iPad Mini", "290"}, {"Móvil HTC", "95"}};
		
		int posMin = 0;
		for (int i = 0; i < precios.length; i++){
			
			if (Float.parseFloat(precios[i][1]) < Float.parseFloat(precios[posMin][1])){
				posMin = i;
			}
		}
		
		System.out.println("El menor elemento es " + precios[posMin][0] + " y está en la posición " + posMin + ", que vale " + precios[posMin][1] + "€.");
		
		// Otra manera
		
		posMin = 0;
		float precio;
		float minimo;
		for (int i = 0; i < precios.length; i++){
			
			precio = Float.parseFloat(precios[i][1]);
			minimo = Float.parseFloat(precios[posMin][1]);
			
			if (precio<minimo){
				posMin = i;
			}
		}
		
		System.out.println("El menor elemento es " + precios[posMin][0] + " y está en la posición " + posMin + ", que vale " + precios[posMin][1] + "€.");
		
	}
	
}
