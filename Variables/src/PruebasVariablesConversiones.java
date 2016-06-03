
public class PruebasVariablesConversiones {
	public static void main (String[]args) {
		
		short numeroPequeno = 1000;
		int numeroGrande;
		
		numeroGrande = (short) numeroPequeno;
		
		System.out.println(numeroGrande);
		
		System.out.println("");
		
		double numero = 200.50;
		float numeroFloat = (float) numero;
		int numeroInt = (int) numeroFloat;
		byte numeroByte = (byte) numeroInt;
		
		System.out.println(numeroFloat);
		System.out.println(numeroInt);
		System.out.println(numeroByte);
		
	}
}
