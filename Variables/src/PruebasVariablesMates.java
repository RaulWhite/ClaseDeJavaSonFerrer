
public class PruebasVariablesMates {
	public static void main(String[] args) {
		
		int a=30, b=20, c=15;
		
		boolean operacion;
		
		operacion = a>b && b>c;
		
		System.out.println(operacion);
		
		boolean operacion2;
		
		operacion2 = !(((a < b) || (b < c)) && (c >= (a * 5)));
		
		System.out.println(operacion2);
		
	}
}
