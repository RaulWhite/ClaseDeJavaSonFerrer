/**
 * @author Raúl Blanco Rama
 */
public class Ejercicio15 {

	public static void main(String[] args) {
		
		String precios[][] = {{"Tablet Samsung", "120"}, {"Móvil Sony", "115"}, {"iPad Mini", "290"}, {"Móvil HTC", "95"}};
		float total = 0;
		String productoMin = precios[0][0];
		String productoMax = precios[0][0];
		float precioMin = Float.parseFloat(precios[0][1]);
		float precioMax = Float.parseFloat(precios[0][1]);
		
		System.out.println("Artículos");
		System.out.println("======================");
		
		for (int i = 0; i < precios.length; i++){
			System.out.println(precios[i][0] + "\t" + precios[i][1]);
			total = total + (Float.parseFloat(precios[i][1]));
		}
		
		System.out.println("\nTotal: " + total + "€");
		
		for (int i = 0; i < precios.length; i++){
			
			if (Float.parseFloat(precios[i][1]) < precioMin){
				productoMin = precios[i][0];
				precioMin = Float.parseFloat(precios[i][1]);
			}
			
			if (Float.parseFloat(precios[i][1]) > precioMax){
				productoMax = precios[i][0];
				precioMax = Float.parseFloat(precios[i][1]);
			}
			
		}
		
		System.out.println("Más barato: " + productoMin + ": " + precioMin + "€");
		System.out.println("Más caro: " + productoMax + ": " + precioMax + "€");
		
	}
	
}
