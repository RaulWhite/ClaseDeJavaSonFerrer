package leccion07;

/**
 * @author Raúl Blanco Rama
 */

public class Main {

	public static void main(String[] args) {
		
		Coche c1 = new Coche();
		c1.setMatricula("0000BBB");
		
		Coche c2 = new Coche();
		c2.setMatricula("9999ZZZ");
		
		System.out.println("Coche 1: " + c1.getMatricula());
		System.out.println("Coche 2: " + c2.getMatricula());
		System.out.println();
		
		c1.setDesceunto(10);
		System.out.println("Coche 1: " + c1.getDescuento() + "% de descuento.");
		System.out.println("Coche 2: " + c2.getDescuento() + "% de descuento.");
		System.out.println();
		
		c2.setDesceunto(15);
		System.out.println("Coche 1: " + c1.getDescuento() + "% de descuento.");
		System.out.println("Coche 2: " + c2.getDescuento() + "% de descuento.");
		System.out.println();
		
	}
	
}