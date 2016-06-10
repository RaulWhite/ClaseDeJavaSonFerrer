public class Ejercicio13 {

	public static void main(String[] args) {

		int[] potencias = new int[20];
		int acu = 1;
		int i;

		for (i = 0; i < potencias.length; i++) {
			potencias[i] = acu;
			acu = acu * 2;
		}
		
		i = 0;
		while (i < potencias.length) {
			System.out.println(potencias[i]);
			i++;
		}
	}
}