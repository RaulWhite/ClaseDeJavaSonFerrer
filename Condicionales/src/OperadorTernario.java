
public class OperadorTernario {

	public static void main(String[] args) {
		
		final int a = 10;
		final int b = 35;
		
		int mayor;
		
//		if (a > b) {
//			mayor = a;
//		}else{
//			mayor = b;
//		}
		
		mayor = (a>b)?a:b;
		
		System.out.println("El mayor es " + mayor);
		
	}
	
}
