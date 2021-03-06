/**
 * @author Raúl Blanco Rama
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		
		System.out.println(transforma(65535));
		
	}
	
	public static String transforma(int dato){
		String hexa = "";
		if (dato > 0 && (dato%16 < 10)){
			hexa = hexa + (dato%16);
			return transforma(dato/16) + hexa;
		} else if (dato > 0 && (dato%16 >= 10)){
			switch (dato%16){
				case 10:
					hexa = hexa + "A";
					break;
				case 11:
					hexa = hexa + "B";
					break;
				case 12:
					hexa = hexa + "C";
					break;
				case 13:
					hexa = hexa + "D";
					break;
				case 14:
					hexa = hexa + "E";
					break;
				case 15:
					hexa = hexa + "F";
					break;
			}
			return transforma(dato/16) + hexa;
		} else {
			return "";
		}
	}
	
}
