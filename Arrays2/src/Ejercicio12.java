/**
 * @author Raúl Blanco Rama
 */
public class Ejercicio12 {
		
	public static void main(String[] args) {
			
		int atoms[] = {8, 2, 10, 20, 12, 71, 15, 23};
		int posMin;
		int aux;
		
		for (int i=0; i < (atoms.length - 1); i++){
			posMin = i;
			for (int j = (i + 1); j < atoms.length; j++){
				if (atoms[j] < atoms[posMin]){
					posMin = j;
				}
			}
			
			aux = atoms[i];
			atoms[i] = atoms[posMin];
			atoms[posMin] = aux;
			
		}
				
		for (int k=0; k<atoms.length; k++){
			System.out.print(atoms[k] + " ");
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("Numéro atómico menor: " + atoms[0]);
		System.out.println("Numéro atómico mayor: " + atoms[(atoms.length - 1)]);
				
	}
	
}
