package ejemplo2;

/**
 * @author Raúl Blanco Rama
 */

public class Main {

	public static void mostrar (Vehiculo v){
		System.out.println(v.toString());
	}
	
	public static void main(String[] args) {
		
		Vehiculo v;
		
		v = new Coche();
				
		mostrar(v);
		
//		Vehiculo v1 = new Vehiculo();
//		v1.matricula = "0000BBB";
//		v1.marca = "Hyundai";
//		v1.modelo = "Getz";
//		
//		System.out.println(v1.toString());
//		
//		Coche c1 = new Coche();
//		c1.matricula = "1111CCC";
//		c1.marca = "Peugeot";
//		c1.modelo = "206";
//		c1.setNumPuertas(5);
//		
//		System.out.println(c1.toString());
//		
//		Moto m1 = new Moto();
//		m1.matricula = "2222DDD";
//		m1.marca = "Piaggio";
//		m1.modelo = "Vespa";
//		m1.setTieneSidecar(false);
//		
//		System.out.println(m1.toString());
	}
	
}