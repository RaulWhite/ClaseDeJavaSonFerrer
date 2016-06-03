package refactorizar;
/**
 * @author Raúl Blanco Rama
 */

public class Ejercicio07 {

	public static void main(String[] args) {
		
		int espectadores[] = {2000000, 2500000, 3100000, 3000000, 1200000, 1800000, 2050000};
		int min = espectadores[0], max = espectadores[0];
		int posicionMin = 1, posicionMax = 1;
		String diaMin = "", diaMax = "";
		
		for (int i = 1; i<espectadores.length; i++){
			
			if (espectadores[i]<min) {
				min = espectadores[i];
				posicionMin = i;
			}
			
			if (espectadores[i]>max){
				max = espectadores[i];
				posicionMax = i;
			}
			
		}
		
		switch (posicionMin) {
		case 1:
			diaMin = "Lunes";
			break;
		case 2:
			diaMin = "Martes";
			break;
		case 3:
			diaMin = "Miércoles";
			break;
		case 4:
			diaMin = "Jueves";
			break;
		case 5:
			diaMin = "Viernes";
			break;
		case 6:
			diaMin = "Sábado";
			break;
		case 7:
			diaMin = "Domingo";
			break;
		}
		
		switch (posicionMax) {
		case 1:
			diaMax = "Lunes";
			break;
		case 2:
			diaMax = "Martes";
			break;
		case 3:
			diaMax = "Miércoles";
			break;
		case 4:
			diaMax = "Jueves";
			break;
		case 5:
			diaMax = "Viernes";
			break;
		case 6:
			diaMax = "Sábado";
			break;
		case 7:
			diaMax = "Domingo";
			break;
		}
		
		System.out.println("El menor día de audiencia fue el " + diaMin + " con " + min + " espectadores.");
		System.out.println("El mayor día de audiencia fue el " + diaMax + " con " + max + " espectadores.");
		
	}
	
}
