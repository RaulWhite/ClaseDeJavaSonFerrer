import java.util.*;

public class Ejercicio09 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float precio;
		int unidades;
		
		int descuento;
		float precioRebajado;
		
		System.out.print("Precio del artículo: ");
		precio = entrada.nextFloat();
		
		System.out.print("Número de unidades: ");
		unidades = entrada.nextInt();
		
		float coste = precio*unidades;
		
		if(coste<100){
			descuento = 0;
		}
		else if(coste>=100 && coste<=200){
			descuento = 10;
		}
		else{
			descuento = 15;
		}
		
		precioRebajado = precio - precio*descuento/100;
		
		System.out.println("Precio rebajado: " + precioRebajado);
		
		entrada.close();
		
	}

}
