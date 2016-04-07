package ejemplo3;

/**
 * @author Raúl Blanco Rama
 */

public class Main {

	public static void main(String[] args) {
		
//		Computadora comp1 = new Computadora();
//		
//		comp1.setModeloCPU("Generico");
//		comp1.setNumNucleos(1);
//		comp1.setCantMemoria("128MB");
//		comp1.setTipoMemoria("Generica");
		
		Smartphone s1 = new Smartphone();
		
		s1.setModeloCPU("Qualcomm 615");
		s1.setNumNucleos(8);
		s1.setCantMemoria("3GB");
		s1.setTipoMemoria("LDDR3");
		s1.setPulgadas(5);
		s1.setPeso(0.18);
		
		PC pc1 = new PC();
		
		pc1.setModeloCPU("Intel Core i3 2120");
		pc1.setNumNucleos(2);
		pc1.setCantMemoria("10GB");
		pc1.setTipoMemoria("DDR3");
		pc1.setTamaño("m-ATX");
		pc1.setTieneGPUExtra(true);
		
		Consola c1 = new Consola();
		
		c1.setModeloCPU("AMD Jaguar x64");
		c1.setNumNucleos(8);
		c1.setCantMemoria("8GB");
		c1.setTipoMemoria("GDDR5");
		c1.setMarca("Sony");
		c1.setModelo("PlayStation 4");
		
	}
	
}
